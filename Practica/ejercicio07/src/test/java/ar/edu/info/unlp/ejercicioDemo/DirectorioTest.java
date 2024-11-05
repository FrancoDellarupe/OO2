package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicio7.*;

public class DirectorioTest {
	
	private Directorio d1;
	private Archivo a1;
	private Archivo a2;
	private Archivo a3;
	private Directorio d2;
	private Archivo a4;
	
	@BeforeEach
	public void setUp() {
		a1 = new Archivo("a1", LocalDate.of(2024, 3, 14), 24);
		a2 = new Archivo("a2", LocalDate.of(2024, 1, 30), 532);
		a3 = new Archivo("a3", LocalDate.of(2023, 11, 10), 245);
		a4 = new Archivo("a4", LocalDate.of(2024, 7, 26), 1045);
		
		d1 = new Directorio("d1", LocalDate.now());
		d2 = new Directorio("d2", LocalDate.now());
		
		d2.add(a4);
		
		d1.add(a1);
		d1.add(a2);
		d1.add(a3);
		d1.add(d2);
	}
	
	@Test
	public void testArchivoMasGrande() {
		assertEquals(d1.archivoMasGrande(), a4);
	}
	
	@Test
	public void testArchivoMasNuevo() {
		assertEquals(d1.archivoMasNuevo(), a3);
	}

}
