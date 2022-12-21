package factoryPattern;

public class PrimaryButtonFactory extends ButtonFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new PrimaryButton("blue", 0);
	}

}
