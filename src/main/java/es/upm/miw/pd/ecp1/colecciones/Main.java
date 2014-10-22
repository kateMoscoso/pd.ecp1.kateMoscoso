package es.upm.miw.pd.ecp1.colecciones;

public class Main {

	public static void main(String[] args) {
		OperationsHandler operations = new OperationsHandler();
		operations.addOperations(new Summation(3, 4));

		System.out.println(operations.total());
		operations.addOperations(new Subtraction(1, 1));
		operations.addOperations(new Multiplication(3, 5));
		System.out.println(operations.total());
		operations.addOperations(new Subtraction(4, 1));
		operations.addOperations(new Summation(3, 6));
		operations.addOperations(new Subtraction(3, 2));

		System.out.println(operations.total());
	}

}
