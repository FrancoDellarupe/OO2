package ar.edu.info.unlp.ejercicio22;

public class Cliente {
	
	private SandwichDirector director;
	private Sandwich miSandwich;
	
	public int facturarClasico() {
		ClasicoBuilder b = new ClasicoBuilder();
		this.director = new SandwichDirector(b);
		this.director.construct();
		this.miSandwich = b.getResult();
		return this.miSandwich.getCosto();
	}
	
	public int facturarVegetariano() {
		VegetarianoBuilder b = new VegetarianoBuilder();
		this.director = new SandwichDirector(b);
		this.director.construct();
		this.miSandwich = b.getResult();
		return this.miSandwich.getCosto();
	}
	
	public int facturarVegano() {
		VeganoBuilder b = new VeganoBuilder();
		this.director = new SandwichDirector(b);
		this.director.construct();
		this.miSandwich = b.getResult();
		return this.miSandwich.getCosto();
	}
	
	public int facturarSinTacc() {
		SinTaccBuilder b = new SinTaccBuilder();
		this.director = new SandwichDirector(b);
		this.director.construct();
		this.miSandwich = b.getResult();
		return this.miSandwich.getCosto();
	}

}
