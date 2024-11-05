package ar.edu.info.unlp.ejercicio1;

public class Tweet implements Publicacion {
	
	private String contenido;
	
	public Tweet(String texto) {
		this.contenido = texto;
	}
	
	public String getContenido() {
		return this.contenido;
	}
	
	public boolean esTweet(Publicacion p) {
		return this.equals(p);
	}

}
