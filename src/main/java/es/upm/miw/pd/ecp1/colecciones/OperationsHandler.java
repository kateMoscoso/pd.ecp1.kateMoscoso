package es.upm.miw.pd.ecp1.colecciones;

import java.util.ArrayList;



public class OperationsHandler {
	public ArrayList<Operations> operationsList = new ArrayList<Operations>();
	public String concatenate ="";
	public void addOperations(Operations operations) {
		operationsList.add(operations);
	}


	public String total() {
		int total = 0;
		String separator = "";
		for(Operations operation : operationsList) {
			concatenate+=(separator + operation.toString());
			total += operation.calculate();
			separator = "+";
		}
		return concatenate +"=" + total;
	}

}
