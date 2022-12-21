package behaviourDesignPattern;

import behaviourDesignPattern.interfaces.Display;
import behaviourDesignPattern.interfaces.Observer;
import behaviourDesignPattern.interfaces.Subject;

public class WeatherDisplay implements Observer, Display {
	int temp;
	int pressure;
	float humidity;
	Subject s;
	public WeatherDisplay(Subject s) {
		s.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this object "+temp +" "+pressure+" "+humidity);

	}

	@Override
	public void update(int temp, int pressure, float humidity) {
		this.temp=temp;
		this.pressure=pressure;
		this.humidity=humidity;
		// TODO Auto-generated method stub

	}

}
