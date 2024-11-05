package ar.edu.info.unlp.ejercicio8;

import java.time.Duration;
import java.time.Instant;

public interface ToDoItemState {

	public ToDoItemState start();
	
	public ToDoItemState togglePause();
	
	public ToDoItemState finish();
	
	public Duration workedTime(Instant startTime);
}
