package org.CrokomoSpring;

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
		
		//Leer XML de configuracion
//		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 
		
//		Ejemplo de llamada a HibernateConfig para un objeto
//		HibernateConfig<Cliente> configuationBD = new HibernateConfig<Cliente>(new Cliente(0, 0, null, 0));
		
		//Pedir el bean
		
		
		//Usar el bean
		
		//Cerrar contexto
	}

}
