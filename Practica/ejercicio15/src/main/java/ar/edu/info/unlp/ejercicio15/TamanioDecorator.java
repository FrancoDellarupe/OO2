package ar.edu.info.unlp.ejercicio15;

public class TamanioDecorator extends FileDecorator {
	
	public TamanioDecorator(FileComponent f) {
		super(f);
	}

	public String preettyPrint() {
		return (this.getTamanio() + " - ") + super.preettyPrint();
	}

}
