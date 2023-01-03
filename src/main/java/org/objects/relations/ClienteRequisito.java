package org.objects.relations;

public class ClienteRequisito {
	
	
	private int idCliente;
	private int idRequisito;
	private int valor;
	
	public ClienteRequisito(int idCliente, int idRequisito, int valor) {
		this.idCliente = idCliente;
		this.setIdRequisito(idRequisito);
		this.valor = valor;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdRequisito() {
		return idRequisito;
	}

	public void setIdRequisito(int idRequisito) {
		this.idRequisito = idRequisito;
	}

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public boolean equals(ClienteRequisito cr) {
		if(this.idCliente != cr.idCliente)
			return false;
		if(this.idRequisito != cr.idRequisito)
			return false;
		return true;
	}

	public String toString() {
		return String.valueOf(valor);
	}
	
}
