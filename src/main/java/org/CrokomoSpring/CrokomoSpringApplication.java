package org.CrokomoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CrokomoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrokomoSpringApplication.class, args); 
		
		//Leer XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 
		
		//Pedir el bean
		
		
		//Usar el bean
		
		//Cerrar contexto
	}

}
