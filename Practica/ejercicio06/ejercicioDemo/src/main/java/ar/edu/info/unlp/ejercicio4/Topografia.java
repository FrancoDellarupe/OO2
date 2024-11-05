package ar.edu.info.unlp.ejercicio4;

public abstract class Topografia {
	
	public abstract double calcularProporcion();

	public boolean esIgual(Topografia otra) {
		return this.calcularProporcion() == otra.calcularProporcion();
	}
	
}
