package ar.edu.info.unlp.ejercicio22;

public class SandwichDirector {
	
	private SandwichBuilder builder;
	
	public SandwichDirector(SandwichBuilder builder) {
		this.builder = builder;
	}

	public void construct() {
		this.builder.buildPan();
		this.builder.buildAderezo();
		this.builder.buildPrincipal();
		this.builder.buildAdicional();
	}

}
