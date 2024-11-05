package ar.edu.info.unlp.ejercicio11;

public class Cancelado extends ProjectState {
	
	public Cancelado(Proyecto p) {
		super(p);
	}
	
	public void aprobarEtapa() {
		this.error();
	}
	
	public double costo() {
		this.error();
		return 0.0;
	}
	
	public double precio() {
		this.error();
		return 0.0;
	}
	
	protected void errorAlModificarMargenDeGanancia() {
		this.error();
	}
	
	public void cancelarProyecto() {
		this.error();
	}
	
	private void error() {
		throw new RuntimeException("El proyecto se encuentra 'CANCELADO'");
	}

}
