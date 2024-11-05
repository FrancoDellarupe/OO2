package ar.edu.info.unlp.ejercicio4;

public class Temporario extends NoPasante {
	
	private int horasTrabajadas;
	
	public Temporario(String nombre, boolean casado, int cantHijos, int hs) {
		super(nombre, casado, cantHijos);
		this.horasTrabajadas = hs;
	}
	
	protected double basico() {
		return 20000.0 + (300.0 * this.horasTrabajadas);
	}
	
}
