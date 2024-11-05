package ar.edu.info.unlp.ejercicio8;

import java.time.Duration;
import java.time.Instant;

public class InProgress implements ToDoItemState {
	
	public ToDoItemState start() {
		throw new RuntimeException("La tarea se encuentra en progreso, por lo que no puede ejecutar 'start'");
	}
	
	public ToDoItemState togglePause() {
		return new Paused();
	}
	
	public ToDoItemState finish() {
		return new Finished(Instant.now());
	}

	public Duration workedTime(Instant startTime) {
		return Duration.between(startTime, Instant.now());
	}
	
}
