package com.unidadtecnica.cargas.serviciosImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unidadtecnica.cargas.entidades.TicketsModelo;
import com.unidadtecnica.cargas.repositorios.TicketsRepo;
import com.unidadtecnica.cargas.servicios.TicketsServicios;

@Service
public class TicketsServiciosImp implements TicketsServicios{
	
	
	private TicketsRepo ticketsRepo;
	
	

	public TicketsServiciosImp(TicketsRepo ticketsRepo) {
		super();
		this.ticketsRepo = ticketsRepo;
	}

	@Override
	public List<TicketsModelo> listarTodosLosTickets() {
		
		return ticketsRepo.findAll();
	}

	@Override
	public TicketsModelo guardarTicket(TicketsModelo ticket) {
		
		return ticketsRepo.save(ticket);
	}

	@Override
	public TicketsModelo ticketPorID(Long ticketid) {
		
		return ticketsRepo.getById(ticketid);
	}

	@Override
	public TicketsModelo actualizarTicket(TicketsModelo ticket) {
		
		return ticketsRepo.save(ticket);
	}

	@Override
	public void borrarTicket(Long id) {
		
		ticketsRepo.deleteById(id);
	}

}
