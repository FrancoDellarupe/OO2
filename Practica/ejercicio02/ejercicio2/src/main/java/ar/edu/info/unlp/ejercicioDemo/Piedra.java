package ar.edu.info.unlp.ejercicioDemo;

public class Piedra extends Jugada {

	public String jugarContraPapel() {
		return "Pierde piedra. Gana papel";
	}
	
	public String jugarContraTijera() {
		return "Gana piedra. Pierde tijera";
	}
	
}
