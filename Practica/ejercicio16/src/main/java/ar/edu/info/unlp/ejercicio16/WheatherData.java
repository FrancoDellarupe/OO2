package ar.edu.info.unlp.ejercicio16;

import java.util.List;

public interface WheatherData {
	
	public double getTemperatura();
	
	public double getPresion();
	
	public double getRadiacionSolar();
	
	public List<Double> getTemperaturas();
	
	public String displayData();

}
