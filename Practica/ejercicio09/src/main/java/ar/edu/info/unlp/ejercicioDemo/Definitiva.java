package ar.edu.info.unlp.ejercicioDemo;

public class Definitiva implements ExcursionState {

private Excursion excursion;
	
	public Definitiva(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public void alcanzoCupoMinimo() {
		throw new RuntimeException("Esta excursion ya alcanzo el cupo minimo anteriormente.");
	}
	
	public void alcanzoCupoMaximo() {
		this.excursion.setState(new Sobrepasada(this.excursion));
	}
	
	public String toString() {
		String res = "Nombre: " + this.excursion.getNombre() + " | Costo: $" + this.excursion.getCosto() + " | Fecha de Inicio: " + this.excursion.getFechaInicio() + " | Fecha de Fin: " + this.excursion.getFechaFin() + " | Punto de Encuentro: " + this.excursion.getPuntoDeEncuentro() + " | Emails de Usuarios: "; 
		for (int i = 0; i < this.excursion.getEmailsInscriptos().size() - 1; i++) {
			res += this.excursion.getEmailsInscriptos().get(i) + " , ";
		}
		res += this.excursion.getEmailsInscriptos().get(this.excursion.getEmailsInscriptos().size() - 1);
		res += " | Usuarios faltantes para cupo maximo: " + (this.excursion.getCupoMaximo() - this.excursion.getCantInscriptos()); 
		return res;
	}
	
}
