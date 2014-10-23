package es.upm.miw.pd.ecp1.vehiculos;

import java.util.ArrayList;



public class VehiculoHandler  {
	public ArrayList<Vehiculo> vehiculosLista = new ArrayList<Vehiculo>();
	public String concatenate ="";
	public void addVehiculo(Vehiculo vehiculo) {
		vehiculosLista.add(vehiculo);
	}
	public void obtenerListaVehiculos(){	
		//int total = 0;
		//String separator = "";
		for(Vehiculo vehiculo : vehiculosLista) {
			System.out.println(vehiculo.toString());
			//total += operation.calculate();
		}
		//return concatenate ;
	}
}
