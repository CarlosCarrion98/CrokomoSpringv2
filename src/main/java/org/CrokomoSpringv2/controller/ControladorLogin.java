package org.CrokomoSpringv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorLogin {
	
	@GetMapping("/inicio-sesion")
	public String loguear() {
		return "iniciar-sesion";
	}
}
