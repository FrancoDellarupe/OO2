package ar.edu.info.unlp.ejercicio21;

public class NullMamifero implements AbstractMamifero {
	
	public AbstractMamifero getPadre() {
		return this;
	}
	
	public AbstractMamifero getMadre() {
		return this;
	}

	public AbstractMamifero getAbueloMaterno() {
		return this;
	}

	public AbstractMamifero getAbuelaMaterna() {
		return this;
	}

	public AbstractMamifero getAbueloPaterno() {
		return this;
	}

	public AbstractMamifero getAbuelaPaterna() {
		return this;
	}

	public boolean tieneComoAncestroA(AbstractMamifero unMamifero) {
		return false;
	}

}
