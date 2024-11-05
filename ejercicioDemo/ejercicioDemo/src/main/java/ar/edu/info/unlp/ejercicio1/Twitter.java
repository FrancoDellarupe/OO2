package ar.edu.info.unlp.ejercicio1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Twitter {

	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	
	public List<Publicacion> getPublicaciones() {
		List<Publicacion> publicaciones = new ArrayList<Publicacion>();
		for (Usuario user : this.usuarios) {
			publicaciones.addAll(user.getMisPublicaciones());
		}
		return publicaciones;
	}
	
	public Usuario addUsuario(String screenName) {
		Usuario user;
		if (this.usuarios.stream().noneMatch(u -> u.getScreenName().equals(screenName))) {	
			user = new Usuario(screenName);
			this.usuarios.add(user);
		} else {
			user = new Usuario("ERROR");
		}
		return user;
	}
	
	public void deleteUsuario(Usuario user) {
		for (Publicacion p : user.getMisPublicaciones()) {
			for (Usuario u : this.usuarios) {
				u.deletePublicaciones(p);						//Ver si elimina el propio tweet
			}
		}
		this.usuarios.remove(user);
	}
	
}
