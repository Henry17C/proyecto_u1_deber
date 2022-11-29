package com.example.demo.hotel.repository;


import com.example.demo.hotel.modelo.Reserva;

public interface IReservaRepository {
	
	public Reserva buscar(String codigo);
	//
	public void actualizar(Reserva Reserva );
	public void insertar (Reserva Reserva);
	public void borrar(String codigo);

}
