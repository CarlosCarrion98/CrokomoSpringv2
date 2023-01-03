package org.objects;

import java.util.ArrayList;

public class Solucion {
	private ArrayList<Requisito> requisitos;
	
	public Solucion(ArrayList<Requisito> requisitos) {
		if (requisitos != null) {
			this.requisitos = new ArrayList<Requisito>(requisitos);
		}else {
			this.requisitos = new ArrayList<Requisito>();
		}
	}
	
	public ArrayList<Requisito> getRequisitos() {
		return requisitos;  
	}
}
