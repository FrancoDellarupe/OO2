package ar.edu.info.unlp.ejercicio11;

public class Confirmado extends ProjectState {

	public Confirmado(Proyecto p) {
		super(p);
	}
	
	public void aprobarEtapa() {
		throw new RuntimeException("El proyecto se encuentra 'Confirmado' por lo que la etapa no puede ser aprobada.");
	}
	
	protected void errorAlModificarMargenDeGanancia() {
		throw new RuntimeException("El proyecto se encuentra 'Confirmado' por lo que el margen de ganancia no puede ser modificado.");
	}
	
}
