package ar.edu.info.unlp.ejercicio16;

import java.util.List;

public abstract class WheatherDataDecorator implements WheatherData {
	
	protected WheatherData wheatherData;
	
	public WheatherDataDecorator(WheatherData wd) {
		this.wheatherData = wd;
	}
	
	public double getTemperatura() {
		return this.wheatherData.getTemperatura();
	}
	
	public double getPresion() {
		return this.wheatherData.getPresion();
	}
	
	public double getRadiacionSolar() {
		return this.wheatherData.getRadiacionSolar();
	}
	
	public List<Double> getTemperaturas() {
		return this.wheatherData.getTemperaturas();
	}
	
	public String displayData() {
		return this.wheatherData.displayData();
	}

}
