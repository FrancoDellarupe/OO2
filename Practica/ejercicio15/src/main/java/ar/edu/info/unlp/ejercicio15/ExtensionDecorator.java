package ar.edu.info.unlp.ejercicio15;

public class ExtensionDecorator extends FileDecorator {
	
	public ExtensionDecorator(FileComponent f) {
		super(f);
	}

	public String preettyPrint() {
		return (this.getExtension() + " - ") + super.preettyPrint();
	}

}
