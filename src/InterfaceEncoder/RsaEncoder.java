package InterfaceEncoder;

public class RsaEncoder extends Encoder {

	@Override
	public String encodeString(String str) {
		// TODO Auto-generated method stub
		return new StringBuffer(str).reverse().toString();
	}
	public RsaEncoder(String str) {
		super(str);
	}

}
