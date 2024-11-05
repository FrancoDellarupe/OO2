package ar.edu.info.unlp.ejercicio12;

public class Adapter4G implements ConnectionStrategy {

	private Connection4G connection;
	
	public Adapter4G() {
		this.connection = new Connection4G("Soy un symb");
	}
	
	public String sendData(String data, long crc) {
		return this.connection.transmit(data, crc);
	}
	
	public String pict() {
		return this.connection.symb();
	}
	
}
