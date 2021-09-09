package com.unidadtecnica.cargas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.unidadtecnica.cargas.entidades.TarjetasModelo;
import com.unidadtecnica.cargas.servicios.TarjetasServicios;

@Controller
public class ControladorTarjetas {

	//constructor de TarjetasServicios
	private TarjetasServicios tarjetasServicios;
	
	public ControladorTarjetas(TarjetasServicios tarjetasServicios) {
		super();
		this.tarjetasServicios = tarjetasServicios;
	}

	//listar todas las tarjetas
	@GetMapping("/tarjetas")
	public String listarTarjetas(Model model) {
		
		model.addAttribute("tarjetas", tarjetasServicios.listarTodasLasTarjetas());
		
		return "tarjetas";
	}
	
	//añadir una nueva tarjeta
	@GetMapping("/tarjetas/nuevo")
	public String nuevaTarjeta(Model model) {
		
		TarjetasModelo tarjeta = new TarjetasModelo();
		model.addAttribute("tarjeta", tarjeta);
		return "tarjetas_nuevas";
	}
	
	//el post mapping de la nueva tarjeta, se ejecuta cuando le dmaos click a "Guardar" en el formulario de la nueva tarjeta
	//y vuelve a redireccionar a la lista de tajetas
	@PostMapping("/tarjetas")
	public String guardarTarjeta(@ModelAttribute("tarjeta") TarjetasModelo tarjeta) {
		
		tarjetasServicios.guardarTarjeta(tarjeta);
		
		return "redirect:/tarjetas";
	}
	
	//editar una tarjeta por ID
	@GetMapping("/tarjetas/editar/{id}")
	public String editarTarjeta(@PathVariable Long id, Model model) {
		
		model.addAttribute("tarjeta", tarjetasServicios.tarjetaPorId(id));
		
		return "tarjetas_editar";
	}
	
	//editar una tarjeta por ID formulario
	@PostMapping("/tarjetas/{id}")
	public String actualizarTarjeta(@PathVariable Long id, @ModelAttribute("tarjeta") TarjetasModelo tarjeta, Model model) {
		
		TarjetasModelo tarjetaExistente = tarjetasServicios.tarjetaPorId(id);
		
		tarjetaExistente.setTarjetaid(id);
		tarjetaExistente.setNro_tarjeta(tarjeta.getNro_tarjeta());
		tarjetaExistente.setLinea_credito(tarjeta.getLinea_credito());
		
		// guardamos la informacion editada
		
		tarjetasServicios.guardarTarjeta(tarjetaExistente);
		
		return "redirect:/tarjetas";
	}
	
	//borrar una tarjeta por id
	@GetMapping("/tarjetas/{id}")
	public String borrarTarjeta(@PathVariable Long id) {
		
		tarjetasServicios.borrarTarjetaPorId(id);
		
		return "redirect:/tarjetas";
	}
	
	
}
