package ar.edu.info.unlp.ejercicio7;

import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
	
	protected String nombre;
	protected LocalDate fechaCreacion;
	
	public Elemento(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	public abstract int getTamanio();
	
	public String listar(String path) {
		return (path + this.nombre + "\n");
	}
	
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();
	
	public abstract Elemento buscar(String nombre);
	
	public Elemento soyEse(String nombre) {
		if (this.nombre.equals(nombre)) { return this; }
		else { return null; }
	}
	
	public void buscarTodos(String nombre, List<Elemento> lista) {
		if (this.nombre.equals(nombre)) {
			lista.add(this);
		}
	}

}
