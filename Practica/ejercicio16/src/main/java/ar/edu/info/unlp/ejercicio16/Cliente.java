package ar.edu.info.unlp.ejercicio16;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	
	private List<WheatherData> wheathers;
	
	public Cliente() {
		this.wheathers = new ArrayList<WheatherData>();
	}
	
	public void addWheatherData(WheatherData wd) {
		this.wheathers.add(wd);
	}
	
	public List<WheatherData> getWheathers() {
		return this.wheathers;
	}

}
