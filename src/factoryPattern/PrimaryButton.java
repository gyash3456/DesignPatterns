package factoryPattern;

public class PrimaryButton extends Button {
	private String color;
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
	public PrimaryButton(String color,int id) {
		super(id);
		this.color=color;
	}
	

}
