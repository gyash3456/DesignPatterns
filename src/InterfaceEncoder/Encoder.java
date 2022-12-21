package InterfaceEncoder;

public abstract class Encoder {
	private String publickey;
	public Encoder(String publickey) {
		this.publickey=publickey;
	}
	public abstract String encodeString(String str);
	

}
