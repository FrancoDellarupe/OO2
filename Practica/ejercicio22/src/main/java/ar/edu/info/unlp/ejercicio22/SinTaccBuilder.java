package ar.edu.info.unlp.ejercicio22;

public class SinTaccBuilder extends SandwichBuilder {

	public void buildPan() {
		this.sandwich.addItem(new Item("chipa", 150));
	}
	
	public void buildAderezo() {
		this.sandwich.addItem(new Item("salsa tartara", 18));
	}
	
	public void buildPrincipal() {
		this.sandwich.addItem(new Item("carne de pollo", 250));
	}
	
	public void buildAdicional() {
		this.sandwich.addItem(new Item("verduras grilladas", 200));
	}
	
	public Sandwich getResult() {
		return this.sandwich;
	}
	
}
