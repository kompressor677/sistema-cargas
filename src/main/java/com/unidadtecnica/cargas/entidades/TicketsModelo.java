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
@Table(name = "Tickets")
public class TicketsModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ticketid;
	
	@Column
	private Date fecha;
	
	@Column
	private String tipo_combus;
	
	@Column
	private float cantidad;
	
	@Column
	private int precio_x_litro;
	
	@Column
	private Long monto_total_gs;
	
	@Column
	private Long saldo_tarjeta;
	
	@OneToOne
	@JoinColumn(name = "tarjetaid", referencedColumnName = "tarjetaid")
	private TarjetasModelo tarjetasModelo;
	
	
	public TicketsModelo() {
		
	}
	
	public TicketsModelo(Date fecha, String tipo_combus, float cantidad, int precio_x_litro, Long monto_total_gs,
			Long saldo_tarjeta) {
		super();
		this.fecha = fecha;
		this.tipo_combus = tipo_combus;
		this.cantidad = cantidad;
		this.precio_x_litro = precio_x_litro;
		this.monto_total_gs = monto_total_gs;
		this.saldo_tarjeta = saldo_tarjeta;
	}
	public Long getTicketid() {
		return ticketid;
	}
	public void setTicketid(Long ticketid) {
		this.ticketid = ticketid;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTipo_combus() {
		return tipo_combus;
	}
	public void setTipo_combus(String tipo_combus) {
		this.tipo_combus = tipo_combus;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio_x_litro() {
		return precio_x_litro;
	}
	public void setPrecio_x_litro(int precio_x_litro) {
		this.precio_x_litro = precio_x_litro;
	}
	public Long getMonto_total_gs() {
		return monto_total_gs;
	}
	public void setMonto_total_gs(Long monto_total) {
		this.monto_total_gs = monto_total;
	}
	public Long getSaldo_tarjeta() {
		return saldo_tarjeta;
	}
	public void setSaldo_tarjeta(Long saldo_tarjeta) {
		this.saldo_tarjeta = saldo_tarjeta;
	}

	public TarjetasModelo getTarjetasModelo() {
		return tarjetasModelo;
	}

	public void setTarjetasModelo(TarjetasModelo tarjetasModelo) {
		this.tarjetasModelo = tarjetasModelo;
	}

	
}
 