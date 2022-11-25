package com.example.demo.herencia;

import java.time.LocalDateTime;

public class Reserva {
	private String codigo;
	private LocalDateTime fechaReserva;
	private Cliente cliente;
	private Habitacion habitacion= new Habitacion();
	
	public void agendar (String codigo, LocalDateTime fechaReserva, Habitacion habitacion, Cliente cliente) {
		
		this.codigo = codigo;
		this.fechaReserva = fechaReserva;
		
		Integer valorDescuento= habitacion.calcularDecuento();
		System.out.println("Valor: "+ valorDescuento);
		this.cliente=cliente;
		this.habitacion=habitacion;
		this.guardaCinta(this);

		
		
	}
	private void guardarReserva(Reserva reserva){
		//inset en la base de da
		System.out.println(reserva);
	}
	

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", fechaReserva=" + fechaReserva + ", cliente=" + cliente + ", habitacion Tipo="
				+ habitacion + "]";
	}


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
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	private void guardaCinta(Reserva reserva) {
		
		System.out.println(reserva);
	}
	public String getNumero() {
		return codigo;
	}

	public void setNumero(String numero) {
		this.codigo = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaReserva;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaReserva = fechaCita;
	}




	
	
	
	
	
}
