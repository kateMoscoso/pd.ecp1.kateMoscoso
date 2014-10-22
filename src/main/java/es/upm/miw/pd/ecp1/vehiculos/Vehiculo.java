package es.upm.miw.pd.ecp1.vehiculos;

public abstract class Vehiculo {
    int id;
    String descripcion;
    public Vehiculo(String descripcion, int id) {
    	this.descripcion=descripcion;
    	this.id=id;
    }
    public abstract int calcularPrecio(int dias);
    public abstract String toString();


}
