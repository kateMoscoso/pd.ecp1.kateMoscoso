package es.upm.miw.pd.ecp1.vehiculos;



public class MainVehiculo {
	public static void main(String[] args) {
		VehiculoHandler vehiculos = new VehiculoHandler();
		vehiculos.addVehiculo(new Coche("Audi, A5","C"));
		vehiculos.addVehiculo(new Coche("Seat, Ibiza", "A"));
		vehiculos.obtenerListaVehiculos();
		vehiculos.addVehiculo(new Bicicleta("Rockrider 5.0 "));
		vehiculos.addVehiculo(new Motos("Yamaha Majesty 400"));
		vehiculos.addVehiculo(new Motos("BMW F800GS"));
		vehiculos.obtenerListaVehiculos();
		System.out.println("El precio del Audi A5 es: " + vehiculos.obtenerPrecioVehiculo(101, 5));
		System.out.println("El precio del vehiculo con id: 103 por 9 días es: " + vehiculos.obtenerPrecioVehiculo(103, 9));
		System.out.println("El precio del vehiculo con id: 104 por 10 días es: " + vehiculos.obtenerPrecioVehiculo(104, 10));

	}

}
