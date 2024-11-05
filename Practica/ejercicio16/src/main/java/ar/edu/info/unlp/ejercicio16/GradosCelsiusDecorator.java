package ar.edu.info.unlp.ejercicio16;

public class GradosCelsiusDecorator extends WheatherDataDecorator {
	
	public GradosCelsiusDecorator(WheatherData wd) {
		super(wd);
	}
	
	public String displayData() {
		return super.displayData() + "; Temperatura C: " + ((this.wheatherData.getTemperatura() - 32) / 1.8);
	}

}
