package com.unidadtecnica.cargas.servicios;

import java.util.List;

import com.unidadtecnica.cargas.entidades.GeneradoresModelo;


public interface GeneradoresServicios {
	
	List<GeneradoresModelo> listarTodosLosGeneradores();
	
	GeneradoresModelo guardarGenerador(GeneradoresModelo generador);
	
	GeneradoresModelo generadorPorId(Long generadorid);
	
	GeneradoresModelo actualizarGenerador(GeneradoresModelo generador);
	
	void borrarGeneradorPorId(Long id);

}
