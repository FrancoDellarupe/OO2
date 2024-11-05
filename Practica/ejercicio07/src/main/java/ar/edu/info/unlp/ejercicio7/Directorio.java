package ar.edu.info.unlp.ejercicio7;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Directorio extends Elemento {

	private List<Elemento> elementos;
	private int tamanio = 32768;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		this.elementos = new ArrayList<Elemento>();
	}
	
	public int getTamanio() {
		return this.elementos.stream()
				.mapToInt(e -> e.getTamanio())
				.sum() + this.tamanio;
	}
	
	public void add(Elemento e) {
		this.elementos.add(e);
	}
	
	public void remove(Elemento e) {
		this.elementos.remove(e);
	}
	
	public Elemento getChild(int i) {
		return this.elementos.get(i);
	}
	
	public String listar(String path) {
		String res = "";
		for (Elemento e: this.elementos) {
			res += e.listar(path + this.nombre + "/");
		}
		res += super.listar(path);
		return res;
	}
	
	public Archivo archivoMasGrande() {
		return this.elementos.stream()
				.map(e -> e.archivoMasGrande())
				.max((a1, a2) -> Integer.compare(a1.getTamanio(), a2.getTamanio()))
				.orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return this.elementos.stream()
				.map(e -> e.archivoMasNuevo())
				.min((a1, a2) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
				.orElse(null);
	}
	
	public Elemento buscar(String nombre) {
		Elemento e = this.soyEse(nombre);
		int i = 0;
		while (e == null && i < this.elementos.size()) {
			e = this.getChild(i).buscar(nombre);
		}
		return e;
	}
	
	public void buscarTodos(String nombre, List<Elemento> lista) {
		for (Elemento e: this.elementos) {
			e.buscarTodos(nombre, lista);
		}
		super.buscarTodos(nombre, lista);
	}

}
