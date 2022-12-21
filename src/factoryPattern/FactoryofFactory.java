package factoryPattern;

public class FactoryofFactory {
	public static ButtonFactory createFactory(ButtonType type) {
		switch (type) {
		case Round: {
		return new RoundButtonFactory();	
		
		}
		case Primary:{
			return new PrimaryButtonFactory();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
