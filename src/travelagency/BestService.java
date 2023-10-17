
package travelagency;
import java.util.Scanner;
 public abstract class BestService {
    
    
    
    public abstract void printBest(int x);

  public  double getCurrencyExchangefork(int x){   //method that calculate Currency Exchange for kula lumpur
       System.out.println("Convert from Saudi Riyal to Malaysian Ringgit:");
           return x*1.15;
     
  }         
 
public  double getCurrencyExchangeform(int x){    //method that calculate Currency Exchange for muscat
     System.out.println("Convert from Saudi Riyal to Omani Rial:");
    return x*0.10;
}
  
public  double getCurrencyExchangefora(int x){    //method that calculate Currency Exchange for alexandria
     System.out.println("Convert from Saudi Riyal to Egyptian Pound:");
    return x*8.13;
}


}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

