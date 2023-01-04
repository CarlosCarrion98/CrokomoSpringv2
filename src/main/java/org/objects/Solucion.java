package org.objects;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component("Solucion")
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
