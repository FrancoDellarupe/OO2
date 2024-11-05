package ar.edu.info.unlp.ejercicio12;

public interface ConnectionStrategy {
	
	public String sendData(String data, long crc);
	
	public String pict();

}
