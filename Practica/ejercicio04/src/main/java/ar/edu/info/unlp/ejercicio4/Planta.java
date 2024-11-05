package ar.edu.info.unlp.ejercicio4;

public class Planta extends NoPasante {

	private int antiguedad;
	
	public Planta(String nombre, boolean casado, int cantHijos, int ant) {
		super(nombre, casado, cantHijos);
		this.antiguedad = ant;
	}
	
	protected double basico() {
		return 50000.0;
	}
	
	protected double adicional() {
		return super.adicional() + 2000.0 * this.antiguedad;
	}
	
}
