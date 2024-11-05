package ar.edu.info.unlp.ejercicio11;

public abstract class ProjectState {
	
	protected Proyecto proyecto;
	
	public ProjectState(Proyecto p) {
		this.proyecto = p;
	}
	
	public abstract void aprobarEtapa();
	
	public double costo() {
		return (this.proyecto.getMontoPorDia() * this.proyecto.getCantIntegrantes()) * this.proyecto.getFechaFin().compareTo(this.proyecto.getFechaInicio());
	}
	
	public double precio() {
		return (this.costo() + (this.costo() * this.proyecto.getMargenGanancia() / 100));
	}
	
	public void modificarMargenDeGanancia(int margenGanancia) {
		this.errorAlModificarMargenDeGanancia();
	}
	
	public void cancelarProyecto() {
		this.proyecto.setObjetivo("Cancelado");
		this.proyecto.setEstado(new Cancelado(this.proyecto));
	}
	
	protected abstract void errorAlModificarMargenDeGanancia();

}
