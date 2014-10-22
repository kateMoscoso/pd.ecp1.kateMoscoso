package es.upm.miw.pd.ecp1.vehiculos;



public class MainVehiculo {
	public static void main(String[] args) {
		VehiculoHandler vehiculos = new VehiculoHandler();
		vehiculos.addVehiculo(new Coche("marca, modelo", 2345, "B"));
		System.out.println(vehiculos.vehiculosLista);
		
	}

}
