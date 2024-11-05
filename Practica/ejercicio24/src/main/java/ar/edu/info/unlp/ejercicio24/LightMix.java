package ar.edu.info.unlp.ejercicio24;

public class LightMix extends ProcessStep {

	protected boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(0.20) && tank.mixerPower(0.05));
	}
	
}
