package main.java.com.nearsoft.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import main.java.com.nearsoft.factory.factories.CurrencyFactory;
import main.java.com.nearsoft.factory.interfaces.Currency;

public class CurrencyExchangeCalculator {
	public static void main(String[] args) {
		
		while(true) {
			float amount = 0;
			String currencyName = "";
			Currency currentCurrency;
			
			CurrencyFactory factory = new CurrencyFactory();
			
			System.out.println("insert the type of currency to perform the conversion (DOLLAR, EURO, YEN)");  
		    
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		    try {
		    	currencyName = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		    
		    currentCurrency = factory.obtainCurrency(currencyName);
		    
		    
		    System.out.println("Insert the amount of money");  
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); 
		    try {
		    	amount = Float.parseFloat(br2.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			} 
		    
		    DecimalFormat df = new DecimalFormat("$#.00");
		    
		    System.out.println("$"+amount+" MXN "+"converted to "+currencyName+" are: "+ df.format(currentCurrency.convert(amount))+"\n");
		}
	}	
}
