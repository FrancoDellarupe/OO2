package ar.edu.info.unlp.ejercicioDemo;

public class Sobrepasada implements ExcursionState {

	private Excursion excursion;
	
	public Sobrepasada(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public void alcanzoCupoMinimo() {
		throw new RuntimeException("Esta excursion ya alcanzo el cupo minimo anteriormente");
	}
	
	public void alcanzoCupoMaximo() {
		throw new RuntimeException("Esta excursion ya alcanzo el cupo maximo anteriormente");
	}
	
	public String toString() {
		return "Nombre: " + this.excursion.getNombre() + " | Costo: $" + this.excursion.getCosto() + " | Fecha de Inicio: " + this.excursion.getFechaInicio() + " | Fecha de Fin: " + this.excursion.getFechaFin() + " | Punto de Encuentro: " + this.excursion.getPuntoDeEncuentro(); 
	}
	
}
