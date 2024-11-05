package ar.edu.info.unlp.ejercicio22;

public class VeganoBuilder extends SandwichBuilder {

	public void buildPan() {
		this.sandwich.addItem(new Item("integral", 100));
	}
	
	public void buildAderezo() {
		this.sandwich.addItem(new Item("salsa criolla", 20));
	}
	
	public void buildPrincipal() {
		this.sandwich.addItem(new Item("milanesa de grigolas", 500));
	}
	
	public void buildAdicional() {
		this.sandwich.addItem(new Item("vacio", 0));
	}
	
	public Sandwich getResult() {
		return this.sandwich;
	}
	
}
