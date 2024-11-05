package ar.edu.info.unlp.ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class HomeWheatherStation implements WheatherData {
	
	private double lastTemperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturasHistoricas;
	
	public HomeWheatherStation(double lastTemperatura, double presion, double radiacionSolar) {
		this.lastTemperatura = lastTemperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturasHistoricas = new ArrayList<Double>();
		this.temperaturasHistoricas.add(lastTemperatura);
	}

	public double getTemperatura() {
		return lastTemperatura;
	}

	public double getPresion() {
		return presion;
	}

	public double getRadiacionSolar() {
		return radiacionSolar;
	}

	public List<Double> getTemperaturas() {
		return temperaturasHistoricas;
	}
	
	public void newTemperatura(double t) {
		this.lastTemperatura = t;
		this.temperaturasHistoricas.add(t);
	}
	
	public String displayData(){
		return "Temperatura F: " + this.getTemperatura() +
		   	  "; Presión atmosf: " + this.getPresion() +
		   	  "; Radiación solar: " + this.getRadiacionSolar();
	}

}
