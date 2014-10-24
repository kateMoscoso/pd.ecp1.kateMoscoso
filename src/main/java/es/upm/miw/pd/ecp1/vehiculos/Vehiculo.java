package es.upm.miw.pd.ecp1.vehiculos;

public abstract class Vehiculo {
    String descripcion;
    public Vehiculo(String descripcion) {
    	this.descripcion=descripcion;
    }
    public abstract int calcularPrecio(int dias);
    public abstract String toString();
    public abstract void asignarID(int id);
    public abstract int getId();

}
