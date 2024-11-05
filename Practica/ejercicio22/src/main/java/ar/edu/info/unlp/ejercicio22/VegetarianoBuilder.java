package ar.edu.info.unlp.ejercicio22;

public class VegetarianoBuilder extends SandwichBuilder {

	public void buildPan() {
		this.sandwich.addItem(new Item("con semillas", 120));
	}
	
	public void buildAderezo() {
		this.sandwich.addItem(new Item("vacio", 0));
	}
	
	public void buildPrincipal() {
		this.sandwich.addItem(new Item("provoleta grillada", 200));
	}
	
	public void buildAdicional() {
		this.sandwich.addItem(new Item("berenjenas al escabeche", 100));
	}
	
	public Sandwich getResult() {
		return this.sandwich;
	}
	
}
