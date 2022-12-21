package behaviourDesignPattern.interfaces;

public interface Subject {
	void notifyObserver();
	void registerObserver(Observer o);
	void removeObserver(Observer o);
}
