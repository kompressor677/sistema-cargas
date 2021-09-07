package com.unidadtecnica.cargas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unidadtecnica.cargas.entidades.CargasModelo;

public interface CargasRepo extends JpaRepository<CargasModelo, Long>{

}
