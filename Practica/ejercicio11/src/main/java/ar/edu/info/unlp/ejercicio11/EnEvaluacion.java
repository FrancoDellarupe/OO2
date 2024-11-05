package ar.edu.info.unlp.ejercicio11;

public class EnEvaluacion extends ProjectState {
	
	public EnEvaluacion(Proyecto p) {
		super(p);
	}
	
	public void aprobarEtapa() {
		this.proyecto.setEstado(new Confirmado(this.proyecto));
	}
	
	public void modificarMargenDeGanancia(int margenGanancia) {
		if (margenGanancia >= 11 && margenGanancia <= 15) {
			this.proyecto.setMargenGanancia(margenGanancia);
		} else {
			super.modificarMargenDeGanancia(margenGanancia);
		}
	}
	
	protected void errorAlModificarMargenDeGanancia() {
		throw new RuntimeException("El valor recibido se encuentra fuera del rango aceptado [11, 15].");
	}

}
