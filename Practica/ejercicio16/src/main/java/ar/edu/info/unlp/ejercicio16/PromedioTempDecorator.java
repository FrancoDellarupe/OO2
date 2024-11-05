package ar.edu.info.unlp.ejercicio16;

public class PromedioTempDecorator extends WheatherDataDecorator {
	
	public PromedioTempDecorator(WheatherData wd) {
		super(wd);
	}
	
	public String displayData() {
		double tot = 0;
		for (double x :this.wheatherData.getTemperaturas()) {
			tot += x;
		}
		return super.displayData() + "; Promedio temperaturas historicas: " + (tot / this.wheatherData.getTemperaturas().size());
	}

}
