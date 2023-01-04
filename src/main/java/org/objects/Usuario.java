package org.objects;

import java.util.ArrayList;
import org.objects.relations.UsuarioProyecto;
import org.springframework.stereotype.Component;

@Component
public class Usuario {
	private String userName;
	private String password;
	private String rol;
	private ArrayList<UsuarioProyecto> relacionesProyecto;
	
	public Usuario(String userName, String password, String rol, ArrayList<UsuarioProyecto> relacionesProyecto) {
		this.userName = userName;
		this.password = password;
		this.rol = rol;
		if(relacionesProyecto != null)
			this.relacionesProyecto = new ArrayList<>(relacionesProyecto);
		else
			this.relacionesProyecto = new ArrayList<>();
		
	}
	
	public Usuario (Usuario usuario) {
		if (usuario != null) {
			this.userName = usuario.userName;
			this.password = usuario.userName;
			this.rol = usuario.rol;
			this.relacionesProyecto = new ArrayList<UsuarioProyecto>();
			this.relacionesProyecto.addAll(usuario.relacionesProyecto);
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public ArrayList<UsuarioProyecto> getRelacionesProyecto() {
		return relacionesProyecto;
	}
	
	public void setRelacionesCliente(ArrayList<UsuarioProyecto> relacionesProyecto) {
		this.relacionesProyecto = new ArrayList<>(relacionesProyecto);
	}
	
}
