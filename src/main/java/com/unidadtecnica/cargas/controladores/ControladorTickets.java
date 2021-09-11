package com.unidadtecnica.cargas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.unidadtecnica.cargas.entidades.TicketsModelo;
import com.unidadtecnica.cargas.servicios.TicketsServicios;

@Controller
public class ControladorTickets {
	
	private TicketsServicios ticketsServicios;
	

	public ControladorTickets(TicketsServicios ticketsServicios) {
		super();
		this.ticketsServicios = ticketsServicios;
	
	}
	

	//listar todos los tickets
	@GetMapping("/tickets")
	public String listarTickets(Model model) {
		
		model.addAttribute("tickets", ticketsServicios.listarTodosLosTickets());
		//model.addAttribute("tarjetas", tarjetasServicios.listarTodasLasTarjetas());
		
		return "tickets";
	}
	
	
	//añadir un nuevo ticket
	@GetMapping("/tickets/nuevo")
	public String nuevoTicket(Model model) {
		
		TicketsModelo ticket = new TicketsModelo();
		model.addAttribute("tickets", ticket);
		return "tickets_nuevos";
		
	}
	
	//el post mapping del nuevo ticket, se ejecuta cuando le damos click a "Guardar" en el formulario de la nueva tarjeta
	//y vuelve a redireccionar a la lista de tajetas
	@PostMapping("/tickets")
	public String guardarTicket(@ModelAttribute("ticket") TicketsModelo ticket) {
		
		ticketsServicios.guardarTicket(ticket);
		
		return "redirect;/tickets";
	}
	
	//editar un ticket por id
	@GetMapping("/tickets/editar/{id}")
	public String editarTicket(@PathVariable Long id, Model model) {
		
		model.addAttribute("tickets", ticketsServicios.ticketPorID(id));
		
		return "tickets_editar";
	}
	
	//editar un ticket por ID - formulario
	@PostMapping("/tickets/{id}")
	public String actualizarTicket(@PathVariable Long id, @ModelAttribute("ticket") TicketsModelo ticket) {
		
		TicketsModelo ticketExistente = ticketsServicios.ticketPorID(id);
		
		ticketExistente.setTicketid(id);
		ticketExistente.setFecha(ticket.getFecha());
		ticketExistente.setTipo_combus(ticket.getTipo_combus());
		ticketExistente.setCantidad(ticket.getCantidad());
		ticketExistente.setPrecio_x_litro(ticket.getPrecio_x_litro());
		ticketExistente.setMonto_total_gs(ticket.getMonto_total_gs());
		ticketExistente.setSaldo_tarjeta(ticket.getSaldo_tarjeta());
		ticketExistente.setTarjetasModelo(ticket.getTarjetasModelo());
		
		return "redirect:/tickets";
	}
	
	//borrar un ticket por ID
	@GetMapping("/tickets/{id}")
	public String borrarTicket(@PathVariable Long id) {
		
		ticketsServicios.borrarTicket(id);
		
		return "redirect:/tickets";
	}
	
}
