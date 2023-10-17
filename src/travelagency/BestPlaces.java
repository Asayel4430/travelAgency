
package travelagency;
import java.util.Scanner;
public class BestPlaces extends BestService{
  private String description;
   private String dKulaLumpur ="1-Patronas Twin tower\n2-Kula Lumpur Bird Park"; 
    private String dAlexandria = "1- Museums of the Bibliotheca Alexandrina\n2- Corniche"; 
     private String dMuscat="1-Royal Opera House\n2-Yiti Beach";

    public BestPlaces() {
    }

    public BestPlaces(String dKulaLumpur, String dAlexandria, String dMuscat) {
        this.dKulaLumpur = dKulaLumpur;
        this.dAlexandria = dAlexandria;
        this.dMuscat = dMuscat;
    } 
    
    
    
    public String getdKulaLumpur() {
        return dKulaLumpur;
    }

    public void setdKulaLumpur(String dKulaLumpur) {
        this.dKulaLumpur = dKulaLumpur;
    }

    public String getdAlexandria() {
        return dAlexandria;
    }

    public void setdAlexandria(String dAlexandria) {
        this.dAlexandria = dAlexandria;
    }

    public String getdMuscat() {
        return dMuscat;
    }

    public void setdMuscat(String dMuscat) {
        this.dMuscat = dMuscat;
    }
    
    
    @Override
      public void printBest(int x)  {     //method that see best place
       if(x==3) {
         System.out.println("..best place in kula lumpur..");  
         System.out.println(getdKulaLumpur());  
         
       }
       else if(x==1){
           System.out.println("..best place in Muscat..");
             System.out.println(getdMuscat());
       }
       else if(x==2){
           System.out.println("..best place in Alexandria..");
             System.out.println(getdAlexandria());
       }
       else{
           System.out.println(" ");
       }
      }
      
    }

    
    
    
    
    
    
    

