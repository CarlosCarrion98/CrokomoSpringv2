package org.objects;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component("Proyecto")
public class Proyecto {
	private int idProyecto;
	private String nombreProyecto;
	
	private ArrayList<Cliente> clientes;
	
	public Proyecto(int idProyecto, String nombreProyecto, ArrayList<Cliente> clientes) {
		this.idProyecto = idProyecto;
		this.nombreProyecto = nombreProyecto;
		this.clientes = new ArrayList<>();
		if(clientes != null) {
			setCliente(clientes);
		}
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public ArrayList<Cliente> getCliente() {
		return clientes;
	}

	public void setCliente(ArrayList<Cliente> clientes) {
		for(Cliente c : clientes) {
			this.clientes.add(c);
		}
	}
	
	public String toString() {
		return this.nombreProyecto;
	}
}
