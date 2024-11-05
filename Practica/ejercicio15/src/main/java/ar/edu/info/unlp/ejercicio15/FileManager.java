package ar.edu.info.unlp.ejercicio15;

import java.util.List;
import java.util.ArrayList;

public class FileManager {
	
	private List<FileComponent> archivos;
	
	public FileManager() {
		this.archivos = new ArrayList<FileComponent>();
	}
	
	public void addArchivo(FileComponent a) {
		this.archivos.add(a);
	}
	
	public List<FileComponent> getArchivos() {
		return this.archivos;
	}

}
