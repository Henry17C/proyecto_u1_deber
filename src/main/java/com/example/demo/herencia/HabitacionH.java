package com.example.demo.herencia;

public class HabitacionH {

	private int numHabitacion;
	private boolean servicioHabitacion;
	private boolean canalesPorCable;
	protected String tipo;
	
	public Integer calcularDecuento() {
		System.out.println("Habitacion sin descuento");
		return 0;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumHabitacion() {
		return numHabitacion;
	}
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
	
	public boolean isServicioHabitacion() {
		return servicioHabitacion;
	}
	public void setServicioHabitacion(boolean servicioHabitacion) {
		this.servicioHabitacion = servicioHabitacion;
	}
	public boolean isCanalesPorCable() {
		return canalesPorCable;
	}
	public void setCanalesPorCable(boolean canalesPorCable) {
		this.canalesPorCable = canalesPorCable;
	}

	@Override
	public String toString() {
		return "Habitacion [numHabitacion=" + numHabitacion + ", servicioHabitacion=" + servicioHabitacion
				+ ", canalesPorCable=" + canalesPorCable + ", tipo=" + tipo + "]";
	}
	
	
	

}
