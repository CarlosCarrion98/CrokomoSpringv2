package org.objects.relations;

import org.objects.Proyecto;
import org.objects.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioProyecto {
	private Usuario usuario;
	private Proyecto proyecto;
	
	@Autowired
	public UsuarioProyecto(Usuario usuario, Proyecto proyecto) {
		this.usuario = usuario;
		this.proyecto = proyecto;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	@Autowired
	public void setUserName(Usuario o) {
		this.usuario = new Usuario(o);
	}

	public Proyecto Proyecto() {
		return this.proyecto;
	}

	@Autowired
	public void setProyecto(Proyecto o) {
		this.proyecto = new Proyecto(o);
	}
	
	

}
