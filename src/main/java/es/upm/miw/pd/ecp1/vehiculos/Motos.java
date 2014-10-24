package es.upm.miw.pd.ecp1.vehiculos;

public class Motos extends Vehiculo{

	public int id;
	public Motos(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularPrecio(int dias) {
		int precio=0;
		if (dias<=6)
			precio=8*dias;
		else
			precio=7*dias;
		return precio;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El vehiculo Motos tiene la siguiente descripcion: " 
				+ this.descripcion+ " id: " + this.id;
	}

	public void setID(int id){
		this.id=id;
	}

	@Override
	public void asignarID(int id) {
		this.id=id;
		
	}

	@Override
	public int getId() {
		return this.id;
	}
}
