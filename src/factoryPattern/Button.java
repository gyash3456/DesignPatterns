package factoryPattern;

public abstract class Button {
	private int id;
	public abstract void onClick();
	public abstract void render();
	public Button(int id) {
		this.id=id;
	}
}
