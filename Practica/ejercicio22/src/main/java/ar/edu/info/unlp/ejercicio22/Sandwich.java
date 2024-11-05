package ar.edu.info.unlp.ejercicio22;

import java.util.List;
import java.util.ArrayList;

public class Sandwich {
	
	private List<Item> items;
	
	public Sandwich() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public int getCosto() {
		return this.items.stream()
				.mapToInt(i -> i.getCosto())
				.sum();
	}

}
