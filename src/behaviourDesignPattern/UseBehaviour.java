package behaviourDesignPattern;

import behaviourDesignPattern.interfaces.Observer;
import behaviourDesignPattern.interfaces.Subject;

public class UseBehaviour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject wdObj = new WeatherData();
		WeatherDisplay o1 = new WeatherDisplay(wdObj);
		WeatherData a =(WeatherData)wdObj;
		HeatIndexDisplay ht= new HeatIndexDisplay(wdObj);
		a.measurementsChanged(50,60,70.0f);
		o1.display();
		a.measurementsChanged(40,90,10.0f);
		o1.display();
		
		ht.display();
	}

}
