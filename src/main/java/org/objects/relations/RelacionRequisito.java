package org.objects.relations;

public class RelacionRequisito {
	
	private int idRequisito1;
	private int idRequisito2;
	private String tipoRelacion;
	
	public RelacionRequisito(int idRequisito1, int idRequisito2, String tipoRelacion) {
		this.idRequisito1 = idRequisito1;
		this.idRequisito2 = idRequisito2;
		this.tipoRelacion = tipoRelacion;
	}
	
	public int getIdRequisito1() {
		return idRequisito1;
	}
	public void setIdRequisito1(int idRequisito1) {
		this.idRequisito1 = idRequisito1;
	}
	public int getIdRequisito2() {
		return idRequisito2;
	}
	public void setIdRequisito2(int idRequisito2) {
		this.idRequisito2 = idRequisito2;
	}
	public String getTipoRelacion() {
		return tipoRelacion;
	}
	public void setTipoRelacion(String tipoRelacion) {
		this.tipoRelacion = tipoRelacion;
	}
}
