package com.unidadtecnica.cargas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unidadtecnica.cargas.entidades.TarjetasModelo;


public interface TarjetasRepo extends JpaRepository<TarjetasModelo, Long> {

}
