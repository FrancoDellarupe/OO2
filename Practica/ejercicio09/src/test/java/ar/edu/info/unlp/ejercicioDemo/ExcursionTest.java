package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	private Excursion ex;
	private Usuario u1;
	private Usuario u2;
	private Usuario u3;
	
	@BeforeEach
	public void setUp() {
		ex = new Excursion("Dos días en kayak bajando el Parana", LocalDate.of(2024, 4, 18), LocalDate.of(2024, 4, 20), "Inicio rio Parana", 54800, 1, 2);
		u1 = new Usuario("u1", "ap", "email1");
		u2 = new Usuario("u2", "ap", "email2");
		u3 = new Usuario("u3", "ap", "email3");
	}
	
	@Test
	public void testExcursionKayak() {
		//assertTrue(ex.obtenerInformacion().equals("Nombre: Dos dias en kayak bajando el Parana | Costo: $54800.0 | Fecha de Inicio: 2024-04-18 | Fecha de Fin: 2024-04-20 | Punto de Encuentro: Inicio rio Parana | Usuario faltantes: 1"));
		assertEquals(ex.getCantInscriptos(), 0);
		ex.inscribir(u1);
		//assertTrue(ex.obtenerInformacion().equals("Nombre: Dos dias en kayak bajando el Parana | Costo: $54800.0 | Fecha de Inicio: 2024-04-18 | Fecha de Fin: 2024-04-20 | Punto de Encuentro: Inicio rio Parana | Emails de Usuarios: email1 | Usuario faltantes para cupo maximo: 1"));
		assertEquals(ex.getCantInscriptos(), 1);
		ex.inscribir(u2);
		//assertTrue(ex.obtenerInformacion().equals("Nombre: Dos dias en kayak bajando el Parana | Costo: $54800.0 | Fecha de Inicio: 2024-04-18 | Fecha de Fin: 2024-04-20 | Punto de Encuentro: Inicio rio Parana"));
		assertEquals(ex.getCantInscriptos(), 2);
		ex.inscribir(u3);
		//assertTrue(ex.obtenerInformacion().equals("Nombre: Dos dias en kayak bajando el Parana | Costo: $54800.0 | Fecha de Inicio: 2024-04-18 | Fecha de Fin: 2024-04-20 | Punto de Encuentro: Inicio rio Parana"));
		assertEquals(ex.getCantInscriptos(), 3);
		assertEquals(ex.getCantEnEspera(), 1);
	}

}
