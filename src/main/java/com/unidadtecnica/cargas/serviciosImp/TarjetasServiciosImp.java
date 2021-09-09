package com.unidadtecnica.cargas.serviciosImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unidadtecnica.cargas.entidades.TarjetasModelo;
import com.unidadtecnica.cargas.repositorios.TarjetasRepo;
import com.unidadtecnica.cargas.servicios.TarjetasServicios;

@Service
public class TarjetasServiciosImp implements TarjetasServicios {
	
	
	private TarjetasRepo tarjetasRepo;
	
	
	public TarjetasServiciosImp(TarjetasRepo tarjetasRepo) {
		super();
		this.tarjetasRepo = tarjetasRepo;
	}

	@Override
	public List<TarjetasModelo> listarTodasLasTarjetas() {

		return tarjetasRepo.findAll();
		
	}

	@Override
	public TarjetasModelo guardarTarjeta(TarjetasModelo tarjeta) {
		
		return tarjetasRepo.save(tarjeta);
	}

	@Override
	public TarjetasModelo tarjetaPorId(Long tarjetaid) {
		
		return tarjetasRepo.getById(tarjetaid);
	}

	@Override
	public TarjetasModelo actualizarTarjeta(TarjetasModelo tarjeta) {
		
		return tarjetasRepo.save(tarjeta);
	}

	@Override
	public void borrarTarjetaPorId(Long id) {
		
		tarjetasRepo.deleteById(id);
		
	}

}
