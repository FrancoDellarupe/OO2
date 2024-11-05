package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	
	private ExcursionState state;
	private List<Usuario> inscriptos;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		
		this.state = new Provisoria(this);
		this.inscriptos = new ArrayList<Usuario>();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}
	
	public void setState(ExcursionState state) {
		this.state = state;
	}
	
	public int getCantInscriptos() {
		return this.inscriptos.size();
	}
	
	public int getCantEnEspera() {
		return this.inscriptos.size() - this.cupoMaximo;
	}
	
	public List<String> getEmailsInscriptos() {
		return this.inscriptos.stream()
				.map(u -> u.getEmail())
				.collect(Collectors.toList());
	}
	
	public void inscribir(Usuario unUsuario) {
		this.inscriptos.add(unUsuario);
		if (this.inscriptos.size() == this.cupoMinimo) { this.state.alcanzoCupoMinimo(); }
		else if (this.inscriptos.size() == this.cupoMaximo) { this.state.alcanzoCupoMaximo(); }
	}
	
	public String obtenerInformacion() {
		return this.state.toString();
	}
	
}
