package vehiculos;

import java.util.ArrayList;


public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	private static int totalVehiculos;
	
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

	
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String texto, int precio, int peso, String traccion,
			Fabricante fabricante) {
		super();
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = texto;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		totalVehiculos++;
		fabricantes.add(fabricante);
	}

	public Vehiculo() {};


	public static int setCantidadVehiculos(){
		
		return totalVehiculos;
		
	}
	
	public static String getCantidadVehiculos(){
		return	"Automoviles: " + (Automovil.getTotalAutomovil()+"") + '\n' + "Camionetas: " + Camioneta.getTotalCamioneta()+"" + '\n' + "Camiones: " + Camion.getTotalCamion()+"";
		
		
	}
	
	public String vehiculosPorTipo(){
		String respuesta = "";
		
		return respuesta;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String texto) {
		this.nombre = texto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}


	
	
	
}
