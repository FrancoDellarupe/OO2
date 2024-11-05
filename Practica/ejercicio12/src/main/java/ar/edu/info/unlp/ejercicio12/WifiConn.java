package ar.edu.info.unlp.ejercicio12;

public class WifiConn implements ConnectionStrategy {

	private String pict;
	
	public WifiConn(String pict) {
		this.pict = pict;
	}
	
	public String sendData(String data, long crc) {
		return ("Data: " + data + "\n CRC: " + crc);
	}
	
	public String pict() {
		return this.pict;
	}
	
}
