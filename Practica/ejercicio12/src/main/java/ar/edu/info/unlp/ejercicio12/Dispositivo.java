package ar.edu.info.unlp.ejercicio12;

public class Dispositivo {
	
	private Ringer ringer;
	private Display display;
	private CRCStrategy crcCalculator;
	private ConnectionStrategy connection;
	
	public Dispositivo() {
		this.ringer = new Ringer();
		this.display = new Display();
		this.crcCalculator = new CRC16_Calculator();
		this.connection = new WifiConn("Soy una pict");
	}
	
	public String send(String data) {
		return this.connection.sendData(data, this.crcCalculator.crcFor(data));
	}
	
	public void configurarCRC(CRCStrategy crc) {
		this.crcCalculator = crc;
	}
	
	public String conectarCon(ConnectionStrategy connection) {
		this.connection = connection;
		return this.connection.pict();
	}

}
