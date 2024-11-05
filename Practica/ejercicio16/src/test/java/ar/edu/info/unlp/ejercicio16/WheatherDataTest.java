package ar.edu.info.unlp.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WheatherDataTest {
	
	private Cliente c;
	private HomeWheatherStation wd;
	
	@BeforeEach
	public void setUp() {
		c = new Cliente();
		wd = new HomeWheatherStation(78.8, 1008.0, 200);
		wd.newTemperatura(66.2);
		wd.newTemperatura(86);
	}
	
	@Test
	public void testEjemploCinco() {
		c.addWheatherData(new MinMaxDecorator(new PromedioTempDecorator(new GradosCelsiusDecorator(wd))));
		System.out.println(c.getWheathers().get(0).displayData());
	}

}
