package ar.edu.info.unlp.ejercicio8;

import java.time.Duration;
import java.time.Instant;

public class Pending implements ToDoItemState {
	
	public ToDoItemState start() {
		return new InProgress();
	}
	
	public ToDoItemState togglePause() {
		throw new RuntimeException("La tarea no fue iniciada, por lo que no puede ejecutar 'togglePause'");
	}
	
	public ToDoItemState finish() {
		throw new RuntimeException("La tarea no fue iniciada, por lo que no puede ejecutar 'finish'");
	}
	
	public Duration workedTime(Instant startTime) {
		return Duration.ZERO;
	}
	
}
