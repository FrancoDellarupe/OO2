package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicio8.*;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class ToDoItemTest {
	
	ToDoItem task1;
	
	@BeforeEach
	void setUp() {
		task1 = new ToDoItem("t1");
	}
	
}
