package ar.edu.info.unlp.ejercicio16;

public class MinMaxDecorator extends WheatherDataDecorator {
	
	public MinMaxDecorator(WheatherData wd) {
		super(wd);
	}
	
	public String displayData() {
		double max = this.wheatherData.getTemperaturas().stream()
				.max((x1, x2) -> Double.compare(x1, x2))
				.orElse(0.0);
		double min = this.wheatherData.getTemperaturas().stream()
				.min((x1, x2) -> Double.compare(x1, x2))
				.orElse(0.0);
		return super.displayData() + "; Temperatura minima historica: " + min + "; Temperatura maxima historica: " + max;
	}

}
