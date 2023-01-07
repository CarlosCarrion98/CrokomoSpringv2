package org.bd.dao.impl;

import org.bd.dao.ClienteDAO;
import org.bd.hibernate.config.HibernateConfig;
import org.hibernate.cfg.Configuration;
import org.objects.Cliente;
import org.objects.Proyecto;
import org.objects.relations.ClienteRequisito;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> implements ClienteDAO {
	
	public ClienteDAOImpl() {
		hc = new HibernateConfig<Cliente>(new Cliente());
		hc.setMySession(new Configuration().configure()
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(ClienteRequisito.class)
				.addAnnotatedClass(Proyecto.class)
				.buildSessionFactory());
	}
	
}
