package es.upm.miw.pd.ecp1.vehiculos;

public class Motos extends Vehiculo{

	public Motos(String descripcion, int id) {
		super(descripcion, id);
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
				+ this.descripcion+ "id: " + this.id;
	}

}
