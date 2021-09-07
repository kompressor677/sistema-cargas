package com.unidadtecnica.cargas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unidadtecnica.cargas.servicios.TarjetasServicios;

@Controller
public class ControladorTarjetas {

	private TarjetasServicios tarjetasServicios;
	
	public ControladorTarjetas(TarjetasServicios tarjetasServicios) {
		super();
		this.tarjetasServicios = tarjetasServicios;
	}

	@GetMapping("/tarjetas")
	public String listarTarjetas(Model model) {
		
		model.addAttribute("tarjetas", tarjetasServicios.listarTodasLasTarjetas());
		
		return "tarjetas";
	}
	
	
	
}
