package ar.edu.info.unlp.ejercicio15;

public class FechaModificacionDecorator extends FileDecorator {
	
	public FechaModificacionDecorator(FileComponent f) {
		super(f);
	}

	public String preettyPrint() {
		return (this.getFechaModificacion() + " - ") + super.preettyPrint();
	}

}
