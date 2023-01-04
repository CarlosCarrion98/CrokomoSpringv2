package org.objects.relations;

import org.objects.Requisito;
import org.springframework.beans.factory.annotation.Autowired;

public class RelacionRequisito {
	
	private Requisito re1;
	private Requisito re2;
	private String tipoRelacion;
	
	@Autowired
	public RelacionRequisito(Requisito re1, Requisito re2, String tipoRelacion) {
		this.re1 = re1;
		this.re2 = re2;
		this.tipoRelacion = tipoRelacion;
	}
	
	public Requisito getRequisito1() {
		return re1;
	}
	
	@Autowired
	public void setIdRequisito1(Requisito o) {
		this.re1 = new Requisito(o);
	}
	
	public Requisito getRequisito2() {
		return re2;
	}
	
	@Autowired
	public void setIdRequisito2(Requisito o) {
		this.re2 = new Requisito(o);
	}
	
	public String getTipoRelacion() {
		return tipoRelacion;
	}
	
	public void setTipoRelacion(String tipoRelacion) {
		this.tipoRelacion = tipoRelacion;
	}
}
