package com.example.demo.hotel.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hotel.modelo.Habitacion;
@Repository
public class HabitacionRepositoryImpl implements IHabitacionRepository {
	private static List<Habitacion> baseHabitaciones= new ArrayList();
	@Override
	public Habitacion bucarPorNumero(String codigo) {
		Habitacion hab = new Habitacion();
		hab.setCanalesPorCable(false);
		hab.setNumHabitacion("0");
		hab.setServicioHabitacion(false);
		hab.setTipo("FA");
		return hab;
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String numHabitacion) {
		// TODO Auto-generated method stub
		
	}

}
