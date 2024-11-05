package ar.edu.info.unlp.ejercicio7;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends Elemento {
	
	private int tamanio;

	public Archivo(String nombre, LocalDate fechaCreacion, int tamanio) {
		super(nombre, fechaCreacion);
		this.tamanio = tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public Elemento buscar(String nombre) {
		return this.soyEse(nombre);
	}

}
