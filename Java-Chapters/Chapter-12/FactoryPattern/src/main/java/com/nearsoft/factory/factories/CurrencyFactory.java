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