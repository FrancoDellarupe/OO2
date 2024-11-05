package ar.edu.info.unlp.ejercicio1;

public class Retweet implements Publicacion {
	
	private Tweet tweetAsociado;
	
	public Retweet(Tweet tweet) {
		this.tweetAsociado = tweet;
	}
	
	public Tweet getTweet() {
		return this.tweetAsociado;
	}
	
	public String getContenido() {
		return this.getTweet().getContenido();
	}
	
	public boolean esTweet(Publicacion p) {
		return this.getTweet().equals(p);
	}

}
