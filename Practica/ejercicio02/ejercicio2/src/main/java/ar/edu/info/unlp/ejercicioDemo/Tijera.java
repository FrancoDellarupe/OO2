package ar.edu.info.unlp.ejercicioDemo;

public class Tijera extends Jugada{
	
	public String jugarContraPiedra() {
		return "Gana piedra. Pierde tijera";
	}
	
	public String jugarContraTijera() {
		return "Gana tijera. Pierde papel";
	}

}
