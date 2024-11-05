package ar.edu.info.unlp.ejercicio4;

public abstract class NoPasante extends Empleado {

	protected boolean casado;
	protected int cantHijos;
	
	public NoPasante(String nombre, boolean casado, int cantHijos) {
		super(nombre);
		this.casado = casado;
		this.cantHijos = cantHijos;
	}
	
	protected double adicional() {
		double ad = 0.0;
		if (this.casado) { ad+= 5000.0; }
		ad+= this.cantHijos * 2000.0;
		return ad;
	}
	
}
