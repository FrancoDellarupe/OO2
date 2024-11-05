package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;

public interface FileComponent {
	
	public String getNombre();
	
	public String getExtension();
	
	public String getPermisos();
	
	public LocalDate getFechaCreacion();
	
	public LocalDate getFechaModificacion();
	
	public double getTamanio();
	
	public String preettyPrint();
}
