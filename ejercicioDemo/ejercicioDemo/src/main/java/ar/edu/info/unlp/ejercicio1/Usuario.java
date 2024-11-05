package ar.edu.info.unlp.ejercicio1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Usuario {

	private String screenName;
	private List<Publicacion> misPublicaciones;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.misPublicaciones = new ArrayList<Publicacion>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}

	public List<Publicacion> getMisPublicaciones() {
		return this.misPublicaciones;
	}

	public Tweet addTweet(String texto) {
		Tweet tw = new Tweet(texto);
		if (texto.length() > 0 && texto.length() <= 280) {
			this.misPublicaciones.add(tw);
		}
		return tw;
	}
	
	public Retweet addRetweet(Tweet tw) {
		Retweet rt = new Retweet(tw);
		this.misPublicaciones.add(rt);
		return rt;
	}

	public void deletePublicaciones(Publicacion aBorrar) {
		List<Publicacion> listaBorrar = this.getMisPublicaciones().stream()
										.filter(p -> p.esTweet(aBorrar))
										.collect(Collectors.toList());
		this.misPublicaciones.removeAll(listaBorrar);
	}
	
}
