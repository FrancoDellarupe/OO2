package ar.edu.info.unlp.ejercicio4;

public class Pasante extends Empleado {
	
	private int examenes;
	
	public Pasante(String nombre, int examenes) {
		super(nombre);
		this.examenes = examenes;
	}
	
	protected double basico() {
		return 20000.0;
	}
	
	protected double adicional() {
		return this.examenes * 2000.0;
	}

}
