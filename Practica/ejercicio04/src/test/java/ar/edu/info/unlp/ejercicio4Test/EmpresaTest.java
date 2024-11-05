package ar.edu.info.unlp.ejercicio4Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicio4.*;

public class EmpresaTest {
	
	private Empresa smartech;
	
	@Test
	public void pagarSueldosTest() {
		smartech = new Empresa();
		
		Empleado emp1 = new Pasante("Pedrito", 3);
		Empleado emp2 = new Temporario("Gregorio", true, 2, 34);
		Empleado emp3 = new Planta("Leandro", false, 1, 4);
		Empleado emp4 = new Temporario("Franco", true, 3, 42);
		
		smartech.agregarEmpleado(emp1);
		smartech.agregarEmpleado(emp2);
		smartech.agregarEmpleado(emp3);
		smartech.agregarEmpleado(emp4);
		
		assertEquals(smartech.pagarSueldos(), 149736.0);
	}

}
