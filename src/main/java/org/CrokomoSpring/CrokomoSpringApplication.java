package org.CrokomoSpring;

import org.bd.dao.ClienteDAO;
import org.bd.dao.impl.ClienteDAOImpl;
import org.bd.hibernate.config.HibernateConfig;
import org.objects.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CrokomoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrokomoSpringApplication.class, args); 
		
	}

}
