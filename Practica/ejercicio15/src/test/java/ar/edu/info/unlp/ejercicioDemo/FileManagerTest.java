package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicio15.*;

public class FileManagerTest {
	
	private FileManager fm;
	private FileOO2 file;

	@BeforeEach
	public void setUp() {
		fm = new FileManager();
		file = new FileOO2("archivo original", ".docx", "UGO: 317", 32.6);
	}
	
	@Test
	public void testEjemplosPreettyPrint() {
		fm.addArchivo(new NombreDecorator(new ExtensionDecorator(file)));
		fm.addArchivo(new NombreDecorator(new ExtensionDecorator(new FechaCreacionDecorator(file))));
		fm.addArchivo(new PermisosDecorator(new NombreDecorator(new ExtensionDecorator(new TamanioDecorator(file)))));
		
		List<String> resultados = fm.getArchivos().stream()
									.map(f -> f.preettyPrint())
									.collect(Collectors.toList());
		
		assertEquals("archivo original - .docx - ", resultados.get(0));
		assertEquals("archivo original - .docx - 2024-04-20 - ", resultados.get(1));
		assertEquals("UGO: 317 - archivo original - .docx - 32.6 - ", resultados.get(2));	
	}
	
}
