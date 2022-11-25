package com.example.demo.sping.boot;

import org.springframework.stereotype.Component;

@Component

public class HabitacionFamiliarSB extends HabitacionSB{
	private boolean guarderia;
	
	public Integer calcularDecuento() {
		System.out.println("Habitacion Familiar con 20% de descuento");
		return 20;
	}

	public boolean isGuarderia() {
		return guarderia;
	}

	public void setGuarderia(boolean guarderia) {
		this.guarderia = guarderia;
	}

	@Override
	public String toString() {
		return "HabitacionFamiliar [guarderia=" + guarderia +" numero habitacion= "+this.getNumHabitacion() 
		+" canales por cable= "+ this.isCanalesPorCable()+" servicio a la habitacion="+this.isServicioHabitacion()+"]";
	}
	

}
