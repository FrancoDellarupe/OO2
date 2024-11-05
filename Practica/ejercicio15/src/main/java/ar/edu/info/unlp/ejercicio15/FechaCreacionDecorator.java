package ar.edu.info.unlp.ejercicio15;

public class FechaCreacionDecorator extends FileDecorator {
	
	public FechaCreacionDecorator(FileComponent f) {
		super(f);
	}

	public String preettyPrint() {
		return (this.getFechaCreacion() + " - ") + super.preettyPrint();
	}

}
