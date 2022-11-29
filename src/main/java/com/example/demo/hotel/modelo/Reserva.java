package com.example.demo.hotel.modelo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

public class Reserva {
	private String codigo;
	private LocalDateTime fechaReserva;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public LocalDateTime getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(LocalDateTime fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	


	
	
	
	
	
}
