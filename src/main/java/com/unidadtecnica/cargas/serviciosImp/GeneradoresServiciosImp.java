package com.unidadtecnica.cargas.serviciosImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unidadtecnica.cargas.entidades.GeneradoresModelo;
import com.unidadtecnica.cargas.repositorios.GeneradoresRepo;
import com.unidadtecnica.cargas.servicios.GeneradoresServicios;

@Service
public class GeneradoresServiciosImp implements GeneradoresServicios {
	
	
	private GeneradoresRepo generadoresRepo;
	
	public GeneradoresServiciosImp(GeneradoresRepo generadoresRepo) {
		super();
		this.generadoresRepo = generadoresRepo;
	}

	@Override
	public List<GeneradoresModelo> listarTodosLosGeneradores() {
		
		return generadoresRepo.findAll();
	}

	@Override
	public GeneradoresModelo guardarGenerador(GeneradoresModelo generador) {
		
		return generadoresRepo.save(generador);
	}

	@Override
	public GeneradoresModelo generadorPorId(Long generadorid) {
		
		return generadoresRepo.getById(generadorid);
	}

	@Override
	public GeneradoresModelo actualizarGenerador(GeneradoresModelo generador) {
		
		return generadoresRepo.save(generador);
	}

	@Override
	public void borrarGeneradorPorId(Long id) {
		
		generadoresRepo.deleteById(id);
	}

}
