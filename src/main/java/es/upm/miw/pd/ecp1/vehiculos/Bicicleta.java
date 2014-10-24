package es.upm.miw.pd.ecp1.vehiculos;

public class Bicicleta extends Vehiculo{

	public int id;
	public Bicicleta(String descripcion) {
		super(descripcion);
	}

	@Override
	public int calcularPrecio(int dias) {
		int precio=0;
		for (int i = 0; i < dias; i++) {
			if(i<=1)
				precio+=3;
			else 
				precio+=2;
		}
		return precio;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El vehiculo Bicicleta tiene la siguiente descripcion: " + this.descripcion+ " y el ID: " + this.id;
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
