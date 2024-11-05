package ar.edu.info.unlp.ejercicio24;

public class Purge extends ProcessStep {

	protected boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(0.0) && tank.mixerPower(0.0) && tank.purge());
	}

}
