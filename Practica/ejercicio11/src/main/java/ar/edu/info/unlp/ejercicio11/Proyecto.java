package ar.edu.info.unlp.ejercicio11;

import java.time.LocalDate;

public class Proyecto {

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private int margenGanancia;
	private int cantIntegrantes;
	private double montoPorDia;
	
	private ProjectState estado;

	public Proyecto(LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int cantIntegrantes, double montoPorDia) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.cantIntegrantes = cantIntegrantes;
		this.montoPorDia = montoPorDia;
		this.margenGanancia = 7;
		this.estado = new EnConstruccion(this);
	}

	public String getObjetivo() {
		return this.objetivo;
	}
	
	public int getMargenGanancia() {
		return margenGanancia;
	}

	public void setMargenGanancia(int margenGanancia) {
		this.margenGanancia = margenGanancia;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public void setEstado(ProjectState estado) {
		this.estado = estado;
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public int getCantIntegrantes() {
		return cantIntegrantes;
	}

	public double getMontoPorDia() {
		return montoPorDia;
	}

	public void aprobarEtapa() {
		this.estado.aprobarEtapa();
	}
	
	public double costo() {
		return this.estado.costo();
	}
	
	public double precio() {
		return this.estado.precio();
	}
	
	public void modificarMargenDeGanacia(int margenGanancia) {
		this.estado.modificarMargenDeGanancia(margenGanancia);
	}
	
	public void cancelarProyecto() {
		this.estado.cancelarProyecto();
	}
	
}
