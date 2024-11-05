package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;

public class FileOO2 implements FileComponent {
	
	private String nombre;
	private String extension;
	private String permisos;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private double tamanio;
	
	public FileOO2(String nombre, String extension, String permisos, double tamanio) {
		this.nombre = nombre;
		this.extension = extension;
		this.permisos = permisos;
		this.fechaCreacion = LocalDate.now();
		this.fechaCreacion = LocalDate.now();
		this.tamanio = tamanio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getPermisos() {
		return permisos;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public double getTamanio() {
		return tamanio;
	}
	
	public String preettyPrint() {
		return "";
	}

}
