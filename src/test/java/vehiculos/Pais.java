package vehiculos;

public class Pais {
	private String nombre;
	private int totalPais;
	
	
	public Pais(String nombre){
		this.nombre = nombre;
		totalPais++;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTotalPais() {
		return totalPais;
	}

	public void setTotalPais(int totalPais) {
		this.totalPais = totalPais;
	}
	
	//public static String paisMasVendedor() {
		
		
	//}
	

}
