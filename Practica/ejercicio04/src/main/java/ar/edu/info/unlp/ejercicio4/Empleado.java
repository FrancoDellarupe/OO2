package ar.edu.info.unlp.ejercicio4;

public abstract class Empleado {

	@SuppressWarnings("unused")
	private String nombre;
	
	protected Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public double sueldo() {
		return this.descuento(this.basico(), this.adicional());
	}
	
	protected abstract double basico();
		
	protected abstract double adicional();
	
	protected double descuento(double basic, double ad) {
		return basic * 0.87 + ad * 0.95;
	}
}
