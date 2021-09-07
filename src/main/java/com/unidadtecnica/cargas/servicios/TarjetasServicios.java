package com.unidadtecnica.cargas.servicios;

import java.util.List;

import com.unidadtecnica.cargas.entidades.TarjetasModelo;


public interface TarjetasServicios {

	List<TarjetasModelo> listarTodasLasTarjetas();
	
	TarjetasModelo guardarTarjeta(TarjetasModelo tarjeta);
	
	TarjetasModelo tarjetaPorId(Long tarjetaid);
	
	TarjetasModelo actualizarTarjeta(TarjetasModelo tarjeta);
	
	void borrarTarjetaPorId(Long id);

	
}