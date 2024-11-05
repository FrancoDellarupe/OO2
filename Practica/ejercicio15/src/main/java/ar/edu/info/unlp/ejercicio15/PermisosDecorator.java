package ar.edu.info.unlp.ejercicio15;

public class PermisosDecorator extends FileDecorator {
	
	public PermisosDecorator(FileComponent f) {
		super(f);
	}

	public String preettyPrint() {
		return (this.getPermisos() + " - ") + super.preettyPrint();
	}

}
