package main.java.com.nearsoft.factory.implementations;

import main.java.com.nearsoft.factory.interfaces.Currency;

public class Dolar implements Currency{

	@Override
	public double convert(float amount) {
		return amount * .041;
		
	}

}
