package com.unidadtecnica.cargas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unidadtecnica.cargas.entidades.GeneradoresModelo;

public interface GeneradoresRepo extends JpaRepository<GeneradoresModelo, Long>  {

}
