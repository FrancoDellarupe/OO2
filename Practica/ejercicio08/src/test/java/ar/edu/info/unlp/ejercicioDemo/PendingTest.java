package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicio8.InProgress;
import ar.edu.info.unlp.ejercicio8.ToDoItem;

public class PendingTest {
	
ToDoItem task1;
	
	@BeforeEach
	void setUp() {
		task1 = new ToDoItem("t1");
	}
	
    @Test
    public void testPendingWorkedTime() {
        assertEquals(task1.workedTime(), Duration.ZERO);
    }
    
    @Test
    public void testPendingStart() {
    //	assertEquals(task1.start().class.getClass(), InProgress.class.getClass());
    }

}
