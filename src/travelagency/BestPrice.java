
package travelagency;

public class BestPrice extends BestService {

    public BestPrice() {
    }
 
public  void getCurrencyExchangefork(double x){   //method that calculate Currency Exchange for kula lumpur
      
    System.out.println("\nThe Price Of Your Flight is"+x+"SR");
    System.out.println("Convert from Saudi Riyal to Malaysian Ringgit:");
    System.out.println(x*1.15+"MYR");  
     
  }         
 
public  void getCurrencyExchangeform(double x){    //method that calculate Currency Exchange for muscat
    
   System.out.println("\nThe Price Of Your Flight is"+x+"SR");
   System.out.println("Convert from Saudi Riyal to Omani Rial:");
   System.out.println(x*0.10+"OMR");
}
  
public  void getCurrencyExchangefora(double x){    //method that calculate Currency Exchange for alexandria
     
    System.out.println("\nThe Price Of Your Flight is"+x+"SR");
    System.out.println("Convert from Saudi Riyal to Egyptian Pound:");
    System.out.println(x*8.13+"LE");
}

    @Override
    public void printBest(int x) {
          }
  

public double discount(double x,String code){
   double price=x;
    if(code.equals("FEB22")){
         price=x-(x/100*30);
        System.err.println("Congratulations, you have successfully received the discount");
        
    }
        return price;

}






}    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

