package com.unidadtecnica.cargas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unidadtecnica.cargas.entidades.TicketsModelo;


public interface TicketsRepo extends JpaRepository<TicketsModelo, Long>{

}
