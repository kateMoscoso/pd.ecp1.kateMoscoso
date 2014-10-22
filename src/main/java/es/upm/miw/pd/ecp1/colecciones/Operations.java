package es.upm.miw.pd.ecp1.colecciones;

public abstract class Operations {
    int operator1, operator2;
    public Operations(int operator1, int operator2) {
    	this.operator1=operator1;
    	this.operator2=operator2;
    }
    public abstract int calculate();
    public abstract String toString();

}
