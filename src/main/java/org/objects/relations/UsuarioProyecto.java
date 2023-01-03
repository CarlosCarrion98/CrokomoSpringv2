package org.objects.relations;

public class UsuarioProyecto {
	private String userName;
	private int idProyecto;
	
	public UsuarioProyecto(int idProyecto, String userName) {
		this.idProyecto = idProyecto;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}
	
	

}
