package es.upm.miw.pd.ecp1.colecciones;

public class Multiplication extends Operations{

    public Multiplication(int operator1, int operator2) {
    	super(operator1, operator2);
    }
    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }
    @Override
    public String toString() {
        return "[" + operator1 + "*" + operator2 + "]";
    }

	@Override
	public int calculate() {
		return this.operator1 * this.operator2;
	}
}
