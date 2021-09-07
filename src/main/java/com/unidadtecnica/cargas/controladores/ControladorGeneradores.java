package com.unidadtecnica.cargas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.unidadtecnica.cargas.entidades.GeneradoresModelo;
import com.unidadtecnica.cargas.servicios.GeneradoresServicios;

@Controller
public class ControladorGeneradores {
	
//INICIO GENERADOREs	
		private GeneradoresServicios generadoresServicios;
		
		public ControladorGeneradores(GeneradoresServicios generadoresServicios) {
			super();
			this.generadoresServicios = generadoresServicios;
			
		}
		
		//listar todos los generadores
		@GetMapping("/generadores")
		public String listarGeneradores(Model model) {
			
			model.addAttribute("generadores", generadoresServicios.listarTodosLosGeneradores());
			
			return "generadores";
				
		}
		
		//añadir un nuevo generador
		@GetMapping("/generadores/nuevo")
		public String nuevoGenerador(Model model) {
			
			GeneradoresModelo generador = new GeneradoresModelo();
			model.addAttribute("generador", generador);
			
			return"generadores_nuevos";
		}
		
		//el post mapping del nuevo generador, se ejecuta cuando le dmaos click a "Guardar" en el formulario del nuevo generador
		//y vuelve a redireccionar a la lista de generadores
		@PostMapping("/generadores")
		public String guardarGenerador(@ModelAttribute("generador") GeneradoresModelo generador) {
			
			generadoresServicios.guardarGenerador(generador);
			return"redirect:/generadores";
		}
		
		//editar un generador por ID
		@GetMapping("/generadores/editar/{id}")
		public String editarGenerador(@PathVariable Long id, Model model) {
			
			model.addAttribute("generador", generadoresServicios.generadorPorId(id));
			
			return "generadores_editar";
		}
		
		//editar un generador por ID formulario
		@PostMapping("/generadores/{id}")
		public String actualizarGenerador(@PathVariable Long id, @ModelAttribute("generador") GeneradoresModelo generador, Model model) {
			
			//traer un generador de la base de datos por id
			
			GeneradoresModelo generadorExistente = generadoresServicios.generadorPorId(id);
			
			generadorExistente.setGeneradorid(id);
			generadorExistente.setCapacidad(generador.getCapacidad());
			generadorExistente.setMarca(generador.getMarca());
			generadorExistente.setModelo(generador.getModelo());
			generadorExistente.setNro_serie(generador.getNro_serie());
			
			//guardar la nueva informacion modificada
			
			generadoresServicios.actualizarGenerador(generadorExistente);
			
			return"redirect:/generadores";
		}
		
		//eliminar un generador
		@GetMapping("/generadores/{id}")
		public String borrarGenerador(@PathVariable Long id) {
			
			generadoresServicios.borrarGeneradorPorId(id);
			
			return "redirect:/generadores";
		}
		
	// FIN GENERADORES	
		
}
