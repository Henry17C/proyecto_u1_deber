package com.example.demo.sping.boot;

import java.time.LocalDateTime;

public class mainFramework {

	public static void main(String[] args) {
		
		
		HabitacionSB habitacionF= new HabitacionFamiliarSB();
		habitacionF.setCanalesPorCable(false);
		habitacionF.setNumHabitacion(5);
		habitacionF.setServicioHabitacion(true);
		habitacionF.setTipo("HF");
		
		ClienteSB cliente  = new ClienteSB();
		cliente.setCedula("176646488");
		cliente.setNombre("Pedro");
		ReservaSB reserva= new ReservaSB();
		System.out.println(habitacionF);
		reserva.agendar("3A", LocalDateTime.of(2022, 12, 2, 8, 30), habitacionF, cliente);
		
		
		//String codigo, LocalDateTime fechaReserva, Habitacion habitacion, Cliente cliente
		

	}

}
