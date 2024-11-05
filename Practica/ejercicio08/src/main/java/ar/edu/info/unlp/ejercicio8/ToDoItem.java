package ar.edu.info.unlp.ejercicio8;

import java.util.List;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class ToDoItem {

	private String name;
	private ToDoItemState state;
	private List<Comment> comments;
	private Instant startTime;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.comments = new ArrayList<Comment>();
	}
	
	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
    public void start() {
    	this.state.start();
    	this.startTime = Instant.now();
    }

		/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
    public void togglePause() {
    	this.state.togglePause();
    }


		/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
    public void finish() {
    	this.state.finish();
    }


		/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
    public Duration workedTime() {
    	return this.state.workedTime(this.startTime);
    }


	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
    public void addComment(String comment) {
    	this.comments.add(new Comment(comment));
    }

}
