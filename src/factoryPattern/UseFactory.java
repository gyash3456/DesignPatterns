package factoryPattern;

public class UseFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonFactory primaryfactory =FactoryofFactory.createFactory(ButtonType.Primary);
		Button primaryButton=primaryfactory.createButton();
		ButtonFactory roundFactory = FactoryofFactory.createFactory(ButtonType.Round);
		RoundButton round = (RoundButton)roundFactory.createButton();
		round.setSize(5);
		System.out.print(round.getSize());
	
	}

}
