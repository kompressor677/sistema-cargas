package com.unidadtecnica.cargas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorPrincipal {
	
	
	public ControladorPrincipal() {
		super();
		// TODO Auto-generated constructor stub
	}

	//pagina index
	@GetMapping("/")
	public String mostrarIndex() {
			
		return "index";
	}
	

	
	
}
