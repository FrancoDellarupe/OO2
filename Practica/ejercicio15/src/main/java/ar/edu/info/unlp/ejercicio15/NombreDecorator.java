package ar.edu.info.unlp.ejercicio15;

public class NombreDecorator extends FileDecorator {
	
	public NombreDecorator(FileComponent f) {
		super(f);
	}

	public String preettyPrint() {
		return (this.getNombre() + " - ") + super.preettyPrint();
	}
	
}
