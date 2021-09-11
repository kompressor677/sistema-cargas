package com.unidadtecnica.cargas.servicios;

import java.util.List;

import com.unidadtecnica.cargas.entidades.TicketsModelo;

public interface TicketsServicios {
	
	List<TicketsModelo> listarTodosLosTickets();
	
	TicketsModelo guardarTicket(TicketsModelo ticket);
	
	TicketsModelo ticketPorID(Long ticketid);
	
	TicketsModelo actualizarTicket(TicketsModelo ticket);
	
	void borrarTicket(Long id);

}
