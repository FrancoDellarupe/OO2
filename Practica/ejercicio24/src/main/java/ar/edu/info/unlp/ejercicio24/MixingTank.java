package ar.edu.info.unlp.ejercicio24;

public class MixingTank {
	
	private double fuenteDeCalor;
	private double potenciaMezcladora;
	
	public MixingTank() {
		this.fuenteDeCalor = 0.0;
		this.potenciaMezcladora = 0.0;
	}

	public boolean heatPower(double percentage) {
		if (0.0 <= percentage && percentage <= 100.0) { 
			this.fuenteDeCalor = percentage;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean mixerPower(double percentage) {
		if (0.0 <= percentage && percentage <= 100.0) { 
			this.fuenteDeCalor = percentage;
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
