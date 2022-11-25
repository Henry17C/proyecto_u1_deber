package com.example.demo.herencia;

import java.time.LocalDateTime;

public class mainFrameworkH {

	public static void main(String[] args) {
		
		
		HabitacionH habitacionF= new HabitacionFamiliarH();
		habitacionF.setCanalesPorCable(false);
		habitacionF.setNumHabitacion(5);
		habitacionF.setServicioHabitacion(true);
		habitacionF.setTipo("HF");
		
		ClienteH cliente  = new ClienteH();
		cliente.setCedula("176646488");
		cliente.setNombre("Pedro");
		ReservaH reserva= new ReservaH();
		reserva.agendar("3A", LocalDateTime.of(2022, 12, 2, 8, 30), habitacionF, cliente);
		
		
		//String codigo, LocalDateTime fechaReserva, Habitacion habitacion, Cliente cliente
		

	}

}
