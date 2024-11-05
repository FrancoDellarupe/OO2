package ar.edu.info.unlp.ejercicio4;

import java.util.List;

public class PorcionMixta extends Topografia {
	
	private List<Topografia> topografias;
	
	public PorcionMixta(List<Topografia> topografias) {
		this.topografias = topografias;
	}
	
	public double calcularProporcion() {
		return this.topografias.stream()
				.mapToDouble(t -> t.calcularProporcion())
				.sum() / 4.0;
	}
	
	public boolean esIgual(Topografia otra) {
		if (otra == this) { return true; }
		if (!(otra instanceof Topografia)) { return false; }
		if (this.calcularProporcion() != otra.calcularProporcion()) { return false; }
		else {
			boolean igual = true;
			for (int i = 0; i < this.topografias.size(); i++) {
				if (this.topografias.get(i).calcularProporcion() != otra/*.topografias.get(i)*/) {
					igual = false;
					break;
				}
			}
			return igual;
		}
		
	}

}
