package com.example.demo.herencia;

import java.time.LocalDateTime;

public class ReservaH {
	private String codigo;
	private LocalDateTime fechaReserva;
	private ClienteH cliente;
	private HabitacionH habitacion= new HabitacionH();
	
	public void agendar (String codigo, LocalDateTime fechaReserva, HabitacionH habitacion, ClienteH cliente) {
		
		this.codigo = codigo;
		this.fechaReserva = fechaReserva;
		
		Integer valorDescuento= habitacion.calcularDecuento();
		System.out.println("Valor: "+ valorDescuento);
		this.cliente=cliente;
		this.habitacion=habitacion;
		this.guardaCinta(this);
		
	}
	private void guardarReserva(ReservaH reserva){
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
	public HabitacionH getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(HabitacionH habitacion) {
		this.habitacion = habitacion;
	}
	public ClienteH getCliente() {
		return cliente;
	}


	public void setCliente(ClienteH cliente) {
		this.cliente = cliente;
	}


	private void guardaCinta(ReservaH reserva) {
		
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
