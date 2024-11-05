package ar.edu.info.unlp.ejercicio21;

public interface AbstractMamifero {
	
	public AbstractMamifero getPadre();
	
	public AbstractMamifero getMadre();

	public AbstractMamifero getAbueloMaterno();

	public AbstractMamifero getAbuelaMaterna();

	public AbstractMamifero getAbueloPaterno();

	public AbstractMamifero getAbuelaPaterna();

	public boolean tieneComoAncestroA(AbstractMamifero unMamifero);

}
