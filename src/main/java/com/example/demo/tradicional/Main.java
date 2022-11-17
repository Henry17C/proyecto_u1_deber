package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reserva reserva= new Reserva();
		reserva.agendar("3A", LocalDateTime.of(2022, 12, 2, 8, 30), "17555", "Pedro", 3, false, false, "MATR");

	}

}
