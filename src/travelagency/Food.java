
package travelagency;
  
   import java.util.Scanner;

public class Food extends BestService{


   
   private String ktybe;
   private String mtybe;
   private String atybe;

    public String getKtybe() {
        return ktybe;
    }

    public void setKtybe(String ktybe) {
        this.ktybe = ktybe;
    }

    public String getMtybe() {
        return mtybe;
    }

    public void setMtybe(String mtybe) {
        this.mtybe = mtybe;
    }

    public String getAtybe() {
        return atybe;
    }

    public void setAtybe(String atybe) {
        this.atybe = atybe;
    }
  
 
    
    
 
@Override
   public void printBest(int s){              //method that print best food
     
       switch(s){
          
           case 1:
               System.out.println(".best food traditional food in muscat: \n 1-Majboos 2-Mushaltat");
                 break;
           case 2: 
                System.out.println(".best food traditional food in alexandria:\n 1-Alexandrian foul 2-Sayadeya rice 3-Tamiya");
                 break;   
           case 3:
            System.out.println(".best food traditional food in kula lumpur: \n 1-Nasi lemak 2-cendol");
                 break;   
            
       }
   }

    @Override
    public String toString() {
        return "Food{" + "ktybe=" + ktybe + ", mtybe=" + mtybe + ", atybe=" + atybe + '}';
    }

    
}

  
    
    
    
    

