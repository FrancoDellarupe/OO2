package ar.edu.info.unlp.ejercicio12;

public class Connection4G {
	
	private String symb;
	
	public Connection4G(String symb) {
		this.symb = symb;
	}
	
	public String transmit(String data, long crc) {
		return ("Data: " + data + "\n CRC: " + crc);
	}

	public String symb() {
		return this.symb;
	}
	
}
