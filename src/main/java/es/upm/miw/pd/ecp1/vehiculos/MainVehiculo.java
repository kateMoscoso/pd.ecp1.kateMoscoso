package es.upm.miw.pd.ecp1.vehiculos;



public class MainVehiculo {
	public static void main(String[] args) {
		VehiculoHandler vehiculos = new VehiculoHandler();
		vehiculos.addVehiculo(new Coche("Audi, A5", 2345, "C"));
		vehiculos.addVehiculo(new Coche("Seat, Ibiza", 2345, "A"));
		System.out.println(vehiculos.vehiculosLista);
		vehiculos.addVehiculo(new Bicicleta("Rockrider 5.0 ", 1234));
		vehiculos.addVehiculo(new Motos("Yamaha Majesty 400", 8345));
		vehiculos.addVehiculo(new Motos("BMW F800GS", 8375));
		System.out.println(vehiculos.vehiculosLista);
	}

}
