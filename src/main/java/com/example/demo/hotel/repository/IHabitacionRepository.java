package com.example.demo.hotel.repository;



import com.example.demo.hotel.modelo.Habitacion;

public interface IHabitacionRepository {
	
	public Habitacion bucarPorNumero(String codigo);
	//SIEMRPE CONSTRUIR EL CRUD 
	
	public Habitacion buscar(Integer id);
	//
	public void actualizar(Habitacion habitacion );
	public void insertar (Habitacion habitacion);
	public void borrar(String numHabitacion);

}
