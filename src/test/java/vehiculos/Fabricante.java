	package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int totalFabricante;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	private static ArrayList<Integer> Numerofabricantes = new ArrayList<Integer>();
	
	
	
	
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		totalFabricante++;
		
		
		
	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getTotalFabricante() {
		return totalFabricante;
	}
	public void setTotalFabricante(int totalFabricante) {
		this.totalFabricante = totalFabricante;
	}
	public static Vehiculo fabricaMayorVentas() {
		// TODO Auto-generated method stub
		return null;
	}



}
