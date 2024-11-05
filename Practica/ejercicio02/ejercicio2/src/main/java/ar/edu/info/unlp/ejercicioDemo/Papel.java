package ar.edu.info.unlp.ejercicioDemo;

public class Papel extends Jugada {

	public String jugarContraPiedra() {
		return "Gana papel. Pierde piedra";
	}
	
	public String jugarContraTijera() {
		return "Pierde papel. Gana tijera";
	}
	
}
