package es.upm.miw.pd.ecp1.vehiculos;

public class Coche extends Vehiculo{
	public String categoria;
	public int id;
	public Coche(String descripcion,  String categoria) {
		super(descripcion);
		this.categoria=categoria;
	}


	public int obtenerPrecioCategoria() {
		int precio =0;
		if(categoria.equals("A"))
			precio= 10;
		if(categoria.equals("B"))
			precio= 15;
		if(categoria.equals("C"))
			precio= 20;

		return precio;
	}
	public int calcularPrecio( int dias){
		int precio=0;
		int categoriaPrecio = obtenerPrecioCategoria();
		for (int i = 0; i < dias; i++) {
			if(i<=2)
				precio+=categoriaPrecio;
			else if(i<=6)
				precio+=(categoriaPrecio*0.8);
			else
				precio+=(categoriaPrecio*0.5);
		}
		return precio;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El vehiculo Coche es de Categoria: " + categoria + 
				" descripcion: "+ descripcion + " id: " +id;
	}


	@Override
	public void asignarID(int id) {
		this.id=id;
		
	}


	@Override
	public int getId() {
		return this.id;
	}

}
