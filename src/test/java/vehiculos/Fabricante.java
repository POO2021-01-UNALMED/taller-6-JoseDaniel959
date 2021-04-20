	package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int totalFabricante;
	public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	private static ArrayList<Fabricante> Numerofabricantes = new ArrayList<Fabricante>();
	
	
	
	
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		totalFabricante++;
		
		if(fabricantes.indexOf(this) == -1) {
			fabricantes.add(this);
			Numerofabricantes.add(this);
			
		}
		else{
			Numerofabricantes.add(this);
			
		}
		
	
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

	
	public static Fabricante fabricaMayorVentas() {
		
		
		int supuestoMaximo = 0;
		
		for(Fabricante f : fabricantes) {
			
			if(supuestoMaximo < Collections.frequency(Numerofabricantes, f)){
				supuestoMaximo = Collections.frequency(Numerofabricantes, f);
			}
			
			
		}
		return fabricantes.get(supuestoMaximo);
	}
	
	

}
