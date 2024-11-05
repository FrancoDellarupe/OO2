package ar.edu.info.unlp.ejercicioDemo;

public class Provisoria implements ExcursionState {
	
	private Excursion excursion;
	
	public Provisoria(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public void alcanzoCupoMinimo() {
		this.excursion.setState(new Definitiva(this.excursion));
	}
	
	public void alcanzoCupoMaximo() {
		if (this.excursion.getCupoMinimo() == this.excursion.getCupoMaximo()) {
			this.excursion.setState(new Sobrepasada(this.excursion));
		}
	}
	
	public String toString() {
		return "Nombre: " + this.excursion.getNombre() + " | Costo: $" + this.excursion.getCosto() + " | Fecha de Inicio: " + this.excursion.getFechaInicio() + " | Fecha de Fin: " + this.excursion.getFechaFin() + " | Punto de Encuentro: " + this.excursion.getPuntoDeEncuentro() + " | Usuarios faltantes: " + (this.excursion.getCupoMinimo() - this.excursion.getCantInscriptos()); 
	}
	
}
