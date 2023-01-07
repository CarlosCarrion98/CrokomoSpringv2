package org.objects.relations;

import javax.persistence.*;

import org.objects.Cliente;
import org.objects.Requisito;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="cliente_has_requisito")
public class ClienteRequisito {
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="idCliente")
	private Cliente cliente;
	
	//Falta por mapear
	private Requisito requisito;
	
	@Column(name="valor")
	private int valor;
	
	@Autowired
	public ClienteRequisito(Cliente cliente, Requisito requisito, int valor) {
		this.cliente = cliente;
		this.requisito = requisito;
		this.valor = valor;
	}
	
	public Cliente getIdCliente() {
		return cliente;
	}
	
	@Autowired
	public void setCliente(Cliente o) {
		this.cliente = new Cliente(o);
	}
	public Requisito getRequisito() {
		return requisito;
	}

	@Autowired
	public void setRequisito(Requisito o) {
		this.requisito = new Requisito(o);
	}

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public boolean equals(ClienteRequisito cr) {
		if(this.cliente.getIdCliente() != cr.getIdCliente().getIdCliente())
			return false;
		if(this.requisito.getIdRequisito() != cr.requisito.getIdRequisito())
			return false;
		return true;
	}

	public String toString() {
		return String.valueOf(valor);
	}
	
}
