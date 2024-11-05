package ar.edu.info.unlp.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VacacionesDeInviernoTest {

	private Proyecto vacacionesDeInvierno;
	
	@BeforeEach
	public void setUp() {
		vacacionesDeInvierno = new Proyecto(LocalDate.of(2024, 7, 15), LocalDate.of(2024, 7, 22), "Salir con amigos.", 3, 25000.0);
	}
	
	@Test
	public void testVacacionesDeInvierno() {
		assertEquals(this.vacacionesDeInvierno.getMargenGanancia(), 7);
		assertEquals(this.vacacionesDeInvierno.costo(), 525000.0);
		assertEquals(this.vacacionesDeInvierno.precio(), 561750.0);		
		this.vacacionesDeInvierno.setMargenGanancia(10);
		assertEquals(this.vacacionesDeInvierno.getMargenGanancia(), 10);
		assertEquals(this.vacacionesDeInvierno.precio(), 577500.0);
		
		this.vacacionesDeInvierno.aprobarEtapa();
		
		this.vacacionesDeInvierno.setMargenGanancia(15);
		assertEquals(this.vacacionesDeInvierno.getMargenGanancia(), 15);
		assertEquals(this.vacacionesDeInvierno.precio(), 603750.0);
		
		this.vacacionesDeInvierno.aprobarEtapa();
		
		this.vacacionesDeInvierno.cancelarProyecto();
		assertTrue(this.vacacionesDeInvierno.getObjetivo().equals("Cancelado"));
	}
	
}
