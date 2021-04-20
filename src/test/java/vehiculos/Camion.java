package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	private static int totalCamion;

	
	public Camion(String placa,String texto,int precio,int peso,Fabricante fabricante,int ejes) {
		super.placa = placa;
		super.puertas = 2;
		super.velocidadMaxima = 80;
		super.nombre = texto;
		super.precio = precio;
		super.peso = peso;
		super.traccion = "4X2";
		super.fabricante = fabricante;
		this.ejes = ejes;
		totalCamion++;
		Vehiculo.totalVehiculos++;

	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getTotalCamion() {
		return totalCamion;
	}

	public void setTotalCamion(int totalCamion) {
		this.totalCamion = totalCamion;
	}

	
	
	
}
