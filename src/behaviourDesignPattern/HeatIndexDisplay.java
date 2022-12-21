package behaviourDesignPattern;

import behaviourDesignPattern.interfaces.Display;
import behaviourDesignPattern.interfaces.Observer;
import behaviourDesignPattern.interfaces.Subject;

public class HeatIndexDisplay implements Observer, Display {
	private int heatIndex;

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Heat index=" +heatIndex);
	}
	public HeatIndexDisplay(Subject s) {
		System.out.println("you are in costructor");
		s.registerObserver(this);
	}

	@Override
	public void update(int temp, int pressure, float humidity) {
		// TODO Auto-generated method stub
		System.out.println(temp+" "+pressure);
		this.heatIndex=temp-pressure;
	}

}
