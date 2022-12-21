package factoryPattern;

public class RoundButtonFactory extends ButtonFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new RoundButton(1);
	}

}
