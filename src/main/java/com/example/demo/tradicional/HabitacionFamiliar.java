package com.example.demo.tradicional;

public class HabitacionFamiliar extends Habitacion{
	private boolean guarderia;

	public boolean isGuarderia() {
		return guarderia;
	}

	public void setGuarderia(boolean guarderia) {
		this.guarderia = guarderia;
	}

	@Override
	public String toString() {
		return "HabitacionFamiliar [guarderia=" + guarderia + "]";
	}
	

}
