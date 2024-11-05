package ar.edu.info.unlp.ejercicio22;

public class ClasicoBuilder extends SandwichBuilder {

	public void buildPan() {
		this.sandwich.addItem(new Item("brioche", 100));
	}
	
	public void buildAderezo() {
		this.sandwich.addItem(new Item("a base de mayonesa", 20));
	}
	
	public void buildPrincipal() {
		this.sandwich.addItem(new Item("carne de ternera", 300));
	}
	
	public void buildAdicional() {
		this.sandwich.addItem(new Item("tomate", 80));
	}
	
	public Sandwich getResult() {
		return this.sandwich;
	}
	
}
