package com.unidadtecnica.cargas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Cargas")
public class CargasModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cargaid;
	
	@Column
	private Date fecha;
	
	@Column
	private Long litros_faltantes_segun_estado;
	
	@Column
	private String observacion;
	
	@OneToOne
	@JoinColumn(name = "ticketid", referencedColumnName = "ticketid")
	private TicketsModelo ticketsModelo;
	
	@OneToOne
	@JoinColumn(name = "generadorid", referencedColumnName = "generadorid")
	private GeneradoresModelo generadoresModelo;
	
	
	public CargasModelo() {
		
	}
	
	public CargasModelo(Date fecha, Long litros_faltantes_segun_estado, String observacion) {
		super();
		this.fecha = fecha;
		this.litros_faltantes_segun_estado = litros_faltantes_segun_estado;
		this.observacion = observacion;
	}

	public Long getCargaid() {
		return cargaid;
	}

	public void setCargaid(Long cargaid) {
		this.cargaid = cargaid;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getLitros_faltantes_segun_estado() {
		return litros_faltantes_segun_estado;
	}

	public void setLitros_faltantes_segun_estado(Long litros_faltantes_segun_estado) {
		this.litros_faltantes_segun_estado = litros_faltantes_segun_estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public TicketsModelo getTicketsModelo() {
		return ticketsModelo;
	}

	public void setTicketsModelo(TicketsModelo ticketsModelo) {
		this.ticketsModelo = ticketsModelo;
	}

	public GeneradoresModelo getGeneradoresModelo() {
		return generadoresModelo;
	}

	public void setGeneradoresModelo(GeneradoresModelo generadoresModelo) {
		this.generadoresModelo = generadoresModelo;
	}

}
