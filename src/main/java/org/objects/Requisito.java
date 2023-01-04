package org.objects;

import java.util.ArrayList;
import org.objects.relations.ClienteRequisito;
import org.objects.relations.RelacionRequisito;
import org.springframework.stereotype.Component;

@Component("Requisito")
public class Requisito {

	private int idRequisito;
	private int esfuerzo;
	private String nombreRequisito;
	private int satisfaccion;
	private ArrayList<RelacionRequisito> listaDeRequisitos;
	private ArrayList<ClienteRequisito> relaciones;
	
	/*
	 * Satisfacción = -1 indica que la satisfacción del requisito no ha sido calculada
	 */
	public Requisito(int idRequisito, int esfuerzo, String nombreRequisito, ArrayList<RelacionRequisito> listaDeRequisitos, ArrayList<ClienteRequisito> valores) {
		this.idRequisito = idRequisito;
		this.esfuerzo = esfuerzo;
		this.nombreRequisito = nombreRequisito;
		this.satisfaccion = -1;
		
		if(listaDeRequisitos != null)
			this.listaDeRequisitos = new ArrayList<RelacionRequisito>(listaDeRequisitos);
		else 
			this.listaDeRequisitos = new ArrayList<RelacionRequisito>();
		
		if(valores != null)
			this.relaciones = new ArrayList<ClienteRequisito>(valores);
		else
			this.relaciones = new ArrayList<ClienteRequisito>();
	}

	public Requisito(int idRequisito, int esfuerzo, String nombreRequisito, int satisfaccion, ArrayList<RelacionRequisito> listaDeRequisitos, ArrayList<ClienteRequisito> valores) {
		this.idRequisito = idRequisito;
		this.esfuerzo = esfuerzo;
		this.nombreRequisito = nombreRequisito;
		this.satisfaccion = satisfaccion;
		
		if(listaDeRequisitos != null)
			this.listaDeRequisitos = new ArrayList<RelacionRequisito>(listaDeRequisitos);
		else 
			this.listaDeRequisitos = new ArrayList<RelacionRequisito>();
		
		if(valores != null)
			this.relaciones = new ArrayList<ClienteRequisito>(valores);
		else
			this.relaciones = new ArrayList<ClienteRequisito>();
	}
	
	public int getIdRequisito() {
		return idRequisito;
	}
	public void setIdRequisito(int idRequisito) {
		this.idRequisito = idRequisito;
	}
	public int getEsfuerzo() {
		return esfuerzo;
	}
	public void setEsfuerzo(int esfuerzo) {
		this.esfuerzo = esfuerzo;
	}
	public String getNombreRequisito() {
		return nombreRequisito;
	}

	public void setNombreRequisito(String nombreRequisito) {
		this.nombreRequisito = nombreRequisito;
	}

	public ArrayList<RelacionRequisito> getListaDeRequisitos() {
		return listaDeRequisitos;
	}
	public void setListaDeRequisitos(ArrayList<RelacionRequisito> listaDeRequisitos) {
		for (RelacionRequisito relacionRequisito : listaDeRequisitos) {
			this.listaDeRequisitos.add(relacionRequisito);
		}
	}
	public int getSatisfaccion() {
		return satisfaccion;
	}
	public void setSatisfaccion(int satisfaccion) {
		this.satisfaccion = satisfaccion;
	}
	public ArrayList<ClienteRequisito> getRelaciones() {
		return relaciones;
	}
	public void setRelaciones(ArrayList<ClienteRequisito> relaciones) {
		for (ClienteRequisito relacion : relaciones) {
			this.relaciones.add(relacion);
		}
	}
	
	public String toString() {
		return this.nombreRequisito;
	}
}
