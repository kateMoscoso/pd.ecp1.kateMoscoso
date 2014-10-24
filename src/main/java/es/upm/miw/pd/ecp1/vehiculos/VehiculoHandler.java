package es.upm.miw.pd.ecp1.vehiculos;

import java.util.ArrayList;



public class VehiculoHandler  {
	public ArrayList<Vehiculo> vehiculosLista = new ArrayList<Vehiculo>();
	public String concatenate ="";
	private int id =100;
	public void addVehiculo(Vehiculo vehiculo) {
		vehiculo.asignarID(obtenerID());
		vehiculosLista.add(vehiculo);
	}
	public void obtenerListaVehiculos(){	
		for(Vehiculo vehiculo : vehiculosLista) {
			System.out.println(vehiculo.toString());
		}
	}
	public int obtenerPrecioVehiculo(int id, int dias){
		int precio=0;
		for(Vehiculo vehiculo : vehiculosLista) {
			if (vehiculo.getId()==id){
				precio=vehiculo.calcularPrecio(dias);
			}
		}
		return precio;
	}
	public int obtenerID(){
		id++;
		return id;
	}
}
