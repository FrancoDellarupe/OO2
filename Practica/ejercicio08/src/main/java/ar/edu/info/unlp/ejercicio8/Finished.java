package ar.edu.info.unlp.ejercicio8;

import java.time.Duration;
import java.time.Instant;

public class Finished implements ToDoItemState {
	
	private Instant finishTime;
	
	public Finished(Instant finishTime) {
		this.finishTime = finishTime;
	}
	
	public ToDoItemState start() {
		throw new RuntimeException("La tarea se encuentra finalizada, por lo que no puede ejecutar 'start'");
	}
	
	public ToDoItemState togglePause() {
		throw new RuntimeException("La tarea se encuentra finalizada, por lo que no puede ejecutar 'togglePause'");
	}
	
	public ToDoItemState finish() {
		throw new RuntimeException("La tarea se encuentra finalizada, por lo que no puede ejecutar 'finish'");
	}
	
	public Duration workedTime(Instant startTime) {
		return Duration.between(startTime, this.finishTime);
	}
	
}
