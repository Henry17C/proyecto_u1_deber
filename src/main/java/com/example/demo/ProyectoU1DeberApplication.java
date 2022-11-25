package com.example.demo;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.sping.boot.ClienteSB;
import com.example.demo.sping.boot.HabitacionFamiliarSB;
import com.example.demo.sping.boot.HabitacionSB;
import com.example.demo.sping.boot.ReservaSB;

@SpringBootApplication
public class ProyectoU1DeberApplication implements CommandLineRunner  {
	@Autowired
	ClienteSB cliente= new ClienteSB();
	@Autowired
	HabitacionFamiliarSB habitacionF;
	@Autowired
	ReservaSB reserva = new ReservaSB();

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DeberApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SprigBoot");
		
	
		
		this.habitacionF.setCanalesPorCable(true);
		this.habitacionF.setGuarderia(true);
		this.habitacionF.setNumHabitacion(5);
		this.habitacionF.setServicioHabitacion(true);
		
		this.cliente.setCedula("16546");
		this.cliente.setNombre("Jorge");
		
	
		System.out.println(habitacionF);
		
		reserva.agendar("3A", LocalDateTime.of(2022, 12, 2, 8, 30), habitacionF, cliente);
		
		
	}

}
