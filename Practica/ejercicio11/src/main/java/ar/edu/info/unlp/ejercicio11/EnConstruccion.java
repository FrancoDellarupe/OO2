package ar.edu.info.unlp.ejercicio11;

public class EnConstruccion extends ProjectState {

	public EnConstruccion(Proyecto p) {
		super(p);
	}
	
	public void aprobarEtapa() {
		if (this.proyecto.precio() != 0) {
			this.proyecto.setEstado(new EnEvaluacion(this.proyecto));
		} else {
			throw new RuntimeException("El precio de este proyecto es 0, por lo que no se puede pasar a estapa 'En Evaluacion'.");
		}
	}
	
	public void modificarMargenDeGanancia(int margenGanancia) {
		if (margenGanancia >= 8 && margenGanancia <= 10) {
			this.proyecto.setMargenGanancia(margenGanancia);
		} else {
			super.modificarMargenDeGanancia(margenGanancia);
		}
	}
	
	protected void errorAlModificarMargenDeGanancia() {
		throw new RuntimeException("El valor recibido se encuentra fuera del rango aceptado [8, 10].");
	}
	
}
