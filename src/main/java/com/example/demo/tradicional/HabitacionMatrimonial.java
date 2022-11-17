package com.example.demo.tradicional;

public class HabitacionMatrimonial extends Habitacion{
	private boolean minibar;
	private boolean spa;
	private boolean decoracionEspecial;
	
	
	@Override
	public String toString() {
		return "HabitacionMatrimonial [minibar=" + minibar + ", spa=" + spa + ", decoracionEspecial="
				+ decoracionEspecial + "]";
	}
	public boolean isMinibar() {
		return minibar;
	}
	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}
	public boolean isSpa() {
		return spa;
	}
	public void setSpa(boolean spa) {
		this.spa = spa;
	}
	public boolean isDecoracionEspecial() {
		return decoracionEspecial;
	}
	public void setDecoracionEspecial(boolean decoracionEspecial) {
		this.decoracionEspecial = decoracionEspecial;
	}

}
