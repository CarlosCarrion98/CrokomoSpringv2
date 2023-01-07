package org.objects;

import java.util.ArrayList;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="proyecto")
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProyecto")
	private int idProyecto;
	
	@Column(name="nombreProyecto")
	private String nombreProyecto;
	
	@OneToMany(mappedBy = "proyecto", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private ArrayList<Cliente> clientes;
	
	public Proyecto(int idProyecto, String nombreProyecto, ArrayList<Cliente> clientes) {
		this.idProyecto = idProyecto;
		this.nombreProyecto = nombreProyecto;
		this.clientes = new ArrayList<>();
		if(clientes != null) {
			setCliente(clientes);
		}
	}
	
	public Proyecto(Proyecto proyecto) {
		if (proyecto != null) {
			this.idProyecto = proyecto.idProyecto;
			this.nombreProyecto = proyecto.nombreProyecto;
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
