package ar.edu.info.unlp.ejercicio8;

import java.time.Duration;
import java.time.Instant;

public class Paused implements ToDoItemState {
	
	public ToDoItemState start() {
		throw new RuntimeException("La tarea se encuentra pausada, por lo que no puede ejecutar 'start'");
	}
	
	public ToDoItemState togglePause() {
		return new InProgress();
	}
	
	public ToDoItemState finish() {
		return new Finished(Instant.now());
	}

	public Duration workedTime(Instant startTime) {
		return Duration.between(startTime, Instant.now());
	}
	
}
