package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ar.edu.info.unlp.ejercicio1.Twitter;

public class TwitterTest {

	public Twitter twitter;
	
	@Test
	public void agregarUsuario() {
		twitter = new Twitter();
		twitter.addUsuario("juanp24");
		assertEquals(1, twitter.getUsuarios().size());
		twitter.addUsuario("lucasrod1");
		twitter.addUsuario("juanp24");
		assertEquals(2, twitter.getUsuarios().size());
	}
	
}
