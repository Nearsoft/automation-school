# Chapter 12 - Design Patterns

## Factory Pattern

## Example

**Currency Interface**

```java
package main.java.com.nearsoft.factory.interfaces;

public interface Currency {
	
	public double convert(float amount);

}
```

**Dollar implementation**

```java
package main.java.com.nearsoft.factory.implementations;

import main.java.com.nearsoft.factory.interfaces.Currency;

public class Dolar implements Currency{

	@Override
	public double convert(float amount) {
		return amount * .041;
		
	}

}
```

**Euro implementation**

```java
package main.java.com.nearsoft.factory.implementations;

import main.java.com.nearsoft.factory.interfaces.Currency;

public class Euro implements Currency{

	@Override
	public double convert(float amount) {
		return amount * .038;
		
	}

}
```

**Yen implementation**

```java
package main.java.com.nearsoft.factory.implementations;

import main.java.com.nearsoft.factory.interfaces.Currency;

public class Yen implements Currency{

	@Override
	public double convert(float amount) {
		return amount * 4.41;
		
	}

}
```

**Currency Type enum**

```java
package main.java.com.nearsoft.factory.enums;

public enum currencyType {
	DOLLAR,
	EURO,
	YEN
}
```

**Currency Factory**

```java
package main.java.com.nearsoft.factory.factories;

import main.java.com.nearsoft.factory.enums.currencyType;
import main.java.com.nearsoft.factory.implementations.Dolar;
import main.java.com.nearsoft.factory.implementations.Euro;
import main.java.com.nearsoft.factory.implementations.Yen;
import main.java.com.nearsoft.factory.interfaces.Currency;

public class CurrencyFactory {
   
    public Currency obtainCurrency(String currencyName){  
         if(currencyName == null){  
          return null;  
         }  
       if(currencyName.equalsIgnoreCase(currencyType.DOLLAR.toString())) {  
              return new Dolar();  
            }   
        else if(currencyName.equalsIgnoreCase(currencyType.EURO.toString())){  
             return new Euro();  
         }   
       else if(currencyName.equalsIgnoreCase(currencyType.YEN.toString())) {  
             return new Yen();  
       }  
    return null;  
    }  
}
```

**Currency Exchange Calculator**

```java
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
```


