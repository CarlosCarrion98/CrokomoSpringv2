package org.objects;

import java.util.ArrayList;

import org.objects.relations.ClienteRequisito;
import org.springframework.stereotype.Component;

@Component
public class Cliente {
	
	private int idCliente;
	private int peso;
	private String nombreCliente;
	private int idProyecto;

	
	ArrayList<ClienteRequisito> relacionesRequisito;
	
	public Cliente() {
		this.peso = 0;
		this.relacionesRequisito = new ArrayList<>();
		this.nombreCliente = "";
	}
	
	
	public Cliente(int idCliente, int peso, String nombreCliente, int idProyecto) {
		this.idCliente = idCliente;
		this.peso = peso;
		this.relacionesRequisito = new ArrayList<>();
		this.nombreCliente = nombreCliente;
		this.idProyecto = idProyecto;
	}
	
	public Cliente(int idCliente, int peso, ArrayList<ClienteRequisito> relaciones, String nombreCliente, int idProyecto) {
		this.idCliente = idCliente;
		this.peso = peso;
		this.relacionesRequisito = new ArrayList<>();
		for(ClienteRequisito cr : relaciones) {
			this.relacionesRequisito.add(cr);
		}
		this.nombreCliente = nombreCliente;
		this.idProyecto = idProyecto;
	}
	
	public Cliente(Cliente cliente) {
		if (cliente != null) {
			this.idCliente = cliente.idCliente;
			this.idProyecto = cliente.idProyecto;
			this.nombreCliente = cliente.nombreCliente;
			this.relacionesRequisito = new ArrayList<ClienteRequisito>();
			this.relacionesRequisito.addAll(cliente.relacionesRequisito);	
		}
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public ArrayList<ClienteRequisito> getRelacionesRequisito() {
		return relacionesRequisito;
	}
	

//	public void setRelaciones(ArrayList<ClienteRequisito> relaciones) {
//		this.relaciones = relaciones;
//	}

	public boolean equals(Cliente c) {
		if(this.idCliente != c.idCliente)
			return false;
		return true;
	}
}
