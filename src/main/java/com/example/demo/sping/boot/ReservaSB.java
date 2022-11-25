package com.example.demo.sping.boot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class ReservaSB {
	private String codigo;
	private LocalDateTime fechaReserva;
	private ClienteSB cliente;
	private HabitacionSB habitacion;
	
	public void agendar (String codigo, LocalDateTime fechaReserva, HabitacionSB habitacion, ClienteSB cliente) {
		
		this.codigo = codigo;
		this.fechaReserva = fechaReserva;
		
		Integer valorDescuento= habitacion.calcularDecuento();
		System.out.println("Valor: "+ valorDescuento);
		this.cliente=cliente;
		this.habitacion=habitacion;
		this.guardaCinta(this);

		
		
	}
	private void guardarReserva(ReservaSB reserva){
		//inset en la base de da
		System.out.println(reserva);
	}
	

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", fechaReserva=" + fechaReserva + ", cliente=" + cliente + ", habitacion Tipo="
				+ habitacion + "]";
	}


	public ClienteSB getCliente() {
		return cliente;
	}


	public void setCliente(ClienteSB cliente) {
		this.cliente = cliente;
	}


	private void guardaCinta(ReservaSB reserva) {
		
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
