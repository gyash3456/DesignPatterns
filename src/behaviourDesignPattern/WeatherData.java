package behaviourDesignPattern;

import java.util.ArrayList;

import behaviourDesignPattern.interfaces.Observer;
import behaviourDesignPattern.interfaces.Subject;

public class WeatherData implements Subject{
	ArrayList<Observer> obsList;
	int temp;
	int pressure;
	float humidity;
	
	public WeatherData() {
		obsList = new ArrayList<Observer>();
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o:obsList) {
			System.out.print(o.getClass());
			o.update(temp,pressure,humidity);
		}
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		obsList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		ArrayList<Observer> newObsList=new ArrayList<Observer>();
		for(int i=0;i<obsList.size();i++) {
			if(obsList.get(i)!=o) {
				newObsList.add(o);
			}
			this.obsList=newObsList;
		}
	}
	public void measurementsChanged(int temp,int pressure,float humidity) {
		this.temp=temp;
		this.pressure=pressure;
		this.humidity=humidity;
		notifyObserver();
		
	}

}
