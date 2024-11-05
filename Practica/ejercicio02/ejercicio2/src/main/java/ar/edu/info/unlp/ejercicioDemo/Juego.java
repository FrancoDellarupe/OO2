package ar.edu.info.unlp.ejercicioDemo;

public class Juego {

	private Jugador j1;
	private Jugador j2;
	
	public Juego(Jugada jugadaJ1, Jugada jugadaJ2) {
		j1 = new Jugador(jugadaJ1);
		j2 = new Jugador(jugadaJ2);
	}
	
	
}
