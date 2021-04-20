package vehiculos;

public class Automovil extends Vehiculo {
	

	
	private int puestos;
	private static int totalAutomovil;
	


	public Automovil(String string, String string2, int i, int j, Fabricante f, int k) {
		super();
		super.placa = string;
		super.nombre = string2;
		super.velocidadMaxima = i;
		super.precio = j;
		super.fabricante = f;
		super.peso = k;
		
		super.puertas = 4;
		super.velocidadMaxima = 100;
		super.traccion = "FWD";
		totalAutomovil++;
	}




	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	
	public static int getTotalAutomovil() {
		return totalAutomovil;
	}




	public void setTotalAutomovil(int totalAutomovil) {
		this.totalAutomovil = totalAutomovil;
	}



	
	

}
