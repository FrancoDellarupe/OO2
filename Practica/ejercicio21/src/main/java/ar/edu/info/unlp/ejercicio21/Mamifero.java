package ar.edu.info.unlp.ejercicio21;

import java.time.LocalDate;

public class Mamifero implements AbstractMamifero {
	private String identificador = null;
	private String especie = null;
	private LocalDate fechaNacimiento = null;
	private Mamifero padre = null;
	private Mamifero madre = null;

	public Mamifero() {
	}

	public Mamifero(String identificador) {
		this.identificador = identificador;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public AbstractMamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public AbstractMamifero getAbueloMaterno() {
			return this.getMadre().getPadre();
	}

	public AbstractMamifero getAbuelaMaterna() {
			return this.getMadre().getMadre();
	}

	public AbstractMamifero getAbueloPaterno() {
			return this.getPadre().getPadre();
	}

	public AbstractMamifero getAbuelaPaterna() {
			return this.getPadre().getMadre();
	}

	public boolean tieneComoAncestroA(AbstractMamifero unMamifero) {
		return tieneComoAncestroMaternoA(unMamifero) || tieneComoAncestroPaternoA(unMamifero);
	}

	private boolean tieneComoAncestroMaternoA(AbstractMamifero unMamifero) {
		return madre == unMamifero || (madre.tieneComoAncestroA(unMamifero));
	}

	private boolean tieneComoAncestroPaternoA(AbstractMamifero unMamifero) {
		return padre == unMamifero || (padre.tieneComoAncestroA(unMamifero));
	}
}
