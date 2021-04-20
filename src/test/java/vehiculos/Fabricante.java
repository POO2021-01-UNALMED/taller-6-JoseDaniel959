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
		
		if(fabricantes.indexOf(this) == -1) {
			fabricantes.add(this);
			Numerofabricantes.set(fabricantes.indexOf(this),1);
		}
		else{
			Numerofabricantes.set(fabricantes.indexOf(this),Numerofabricantes.get(fabricantes.indexOf(this))+1);
			
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
		String a = "";
		
		int supuestoMaximo = 0;
		
		for(int i = 1;i<Numerofabricantes.size();i++) {
			
			if(Numerofabricantes.get(supuestoMaximo) <Numerofabricantes.get(i)) {
				
				supuestoMaximo = i;
			}
			else{
				
				
			}
		
			
			
		}
		return fabricantes.get(supuestoMaximo);
	}
	

}
