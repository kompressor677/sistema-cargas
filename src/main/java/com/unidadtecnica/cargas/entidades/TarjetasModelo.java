package com.unidadtecnica.cargas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tarjetas")
public class TarjetasModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tarjetaid;
	
	@Column
	private String nro_tarjeta;
	
	@Column
	private Long linea_credito;
	
	public TarjetasModelo() {
		
	}
	
	public TarjetasModelo(String nro_tarjeta, Long linea_credito) {
		super();
		this.nro_tarjeta = nro_tarjeta;
		this.linea_credito = linea_credito;
	}
	public Long getTarjetaid() {
		return tarjetaid;
	}
	public void setTarjetaid(Long tarjetaid) {
		this.tarjetaid = tarjetaid;
	}
	public String getNro_tarjeta() {
		return nro_tarjeta;
	}
	public void setNro_tarjeta(String nro_tarjeta) {
		this.nro_tarjeta = nro_tarjeta;
	}
	public Long getLinea_credito() {
		return linea_credito;
	}
	public void setLinea_credito(Long linea_credito) {
		this.linea_credito = linea_credito;
	}
	
	

}
