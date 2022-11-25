package com.example.demo.herencia;

import java.time.LocalDateTime;

public class mainFramework {

	public static void main(String[] args) {
		
		
		Habitacion habitacionF= new HabitacionFamiliar();
		habitacionF.setCanalesPorCable(false);
		habitacionF.setNumHabitacion(5);
		habitacionF.setServicioHabitacion(true);
		habitacionF.setTipo("HF");
		
		Cliente cliente  = new Cliente();
		cliente.setCedula("176646488");
		cliente.setNombre("Pedro");
		Reserva reserva= new Reserva();
		reserva.agendar("3A", LocalDateTime.of(2022, 12, 2, 8, 30), habitacionF, cliente);
		
		
		//String codigo, LocalDateTime fechaReserva, Habitacion habitacion, Cliente cliente
		

	}

}
