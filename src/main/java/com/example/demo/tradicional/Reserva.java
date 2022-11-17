package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Reserva {
	private String codigo;
	private LocalDateTime fechaReserva;
	private Cliente cliente;
	private Habitacion habitacion= new Habitacion();
	
	public void agendar (String codigo, LocalDateTime fechaCita,String cedulaCliente,String nombreCliente,
			int numHabitacion, boolean servicioHabitacion, boolean canalesPorCable,String tipo) {
		
		this.codigo = codigo;
		this.fechaReserva = fechaCita;
		Cliente cliente = new Cliente();
		cliente.setCedula(cedulaCliente);
		cliente.setNombre(nombreCliente);
		this.cliente=cliente;
		
		if (tipo.equals("MATR")) {
			HabitacionMatrimonial hMatrimonial = new HabitacionMatrimonial();
			hMatrimonial.setTipo("MATR");
		
			hMatrimonial.setDecoracionEspecial(false);
			hMatrimonial.setMinibar(false);
			hMatrimonial.setSpa(false);
			
			this.habitacion=hMatrimonial;
			System.out.println("Habitacion matrimonial registrada");
	
			
		}else {
			HabitacionFamiliar hFamiliar = new HabitacionFamiliar();
			hFamiliar.setGuarderia(false);
			hFamiliar.setTipo("FAM");
			
			this.habitacion=hFamiliar;
			
			System.out.println("Habitacion matrimonial familiar");
			
		
			
		}
		this.habitacion.setCanalesPorCable(canalesPorCable);
		this.habitacion.setNumHabitacion(numHabitacion);
		this.habitacion.setServicioHabitacion(servicioHabitacion);
		this.guardaCinta(this);
		
		
	}
	

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", fechaReserva=" + fechaReserva + ", cliente=" + cliente + ", habitacion Tipo="
				+ habitacion + "]";
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
