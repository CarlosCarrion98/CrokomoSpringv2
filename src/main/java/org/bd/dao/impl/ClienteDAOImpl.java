package org.bd.dao.impl;

import org.bd.dao.ClienteDAO;
import org.bd.hibernate.config.HibernateConfig;
import org.objects.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> implements ClienteDAO {
	
	public ClienteDAOImpl() {
		hc = new HibernateConfig<Cliente>(new Cliente());
	}
	
}
