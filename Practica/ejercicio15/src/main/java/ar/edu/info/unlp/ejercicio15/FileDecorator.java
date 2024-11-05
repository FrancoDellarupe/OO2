package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent {

	protected FileComponent file;
	
	public FileDecorator(FileComponent f) {
		this.file = f;
	}
	
	public String getNombre() {
		return this.file.getNombre();
	}
	
	public String getExtension() {
		return this.file.getExtension();
	}
	
	public String getPermisos() {
		return this.file.getPermisos();
	}
	
	public LocalDate getFechaCreacion() {
		return this.file.getFechaCreacion();
	}
	
	public LocalDate getFechaModificacion() {
		return this.file.getFechaModificacion();
	}
	
	public double getTamanio() {
		return this.file.getTamanio();
	}
	
	public String preettyPrint() {
		return this.file.preettyPrint();
	}
	
}
