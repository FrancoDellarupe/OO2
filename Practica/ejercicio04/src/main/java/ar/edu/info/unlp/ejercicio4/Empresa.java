package ar.edu.info.unlp.ejercicio4;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	
	private List<Empleado> empleados;
	
	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void agregarEmpleado(Empleado emp) {
		this.empleados.add(emp);
	}
	
	public void eliminarEmpleado(Empleado emp) {
		this.empleados.remove(emp);
	}
	
	public double pagarSueldos() {
		return this.empleados.stream()
				.mapToDouble(e -> e.sueldo())
				.sum();
	}

}
