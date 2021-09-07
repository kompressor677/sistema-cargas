package com.unidadtecnica.cargas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Generadores")
public class GeneradoresModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long generadorid;
	
	@Column
	private int capacidad;
	
	@Column
	private String marca;
	
	@Column
	private String modelo;
	
	@Column
	private String nro_serie;
	
	public GeneradoresModelo() {
		
	}
	
	public GeneradoresModelo(int capacidad, String marca, String modelo, String nro_serie) {
		super();
		this.capacidad = capacidad;
		this.marca = marca;
		this.modelo = modelo;
		this.nro_serie = nro_serie;
	}
	
	public Long getGeneradorid() {
		return generadorid;
	}
	public void setGeneradorid(Long generadorid) {
		this.generadorid = generadorid;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNro_serie() {
		return nro_serie;
	}
	public void setNro_serie(String nro_serie) {
		this.nro_serie = nro_serie;
	}
	

}
