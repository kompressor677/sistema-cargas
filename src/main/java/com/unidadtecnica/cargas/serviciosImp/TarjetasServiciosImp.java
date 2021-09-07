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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetasModelo tarjetaPorId(Long tarjetaid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetasModelo actualizarTarjeta(TarjetasModelo tarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarTarjetaPorId(Long id) {
		// TODO Auto-generated method stub
		
	}

}
