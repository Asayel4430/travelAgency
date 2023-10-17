
package travelagency;

import java.util.Scanner;

  
 public class BagWeight {

 
    public int Backbag;      ////BAGS DETAILS 
    public int handbag;
    public int ChildBag;
    
   
   public BagWeight(int Backbag, int handbag, int ChildBag) {
        this.Backbag = Backbag;
        this.handbag = handbag;
        this.ChildBag = ChildBag;
    }

    BagWeight() {
        
    }

    public int getBackbag() {
        return Backbag;
    }

    public void setBackbag(int Backbag) {
        this.Backbag = Backbag;
    }

    public int getHandbag() {
        return handbag;
    }

    public void setHandbag(int handbag) {
        this.handbag = handbag;
    }

    public int getChildBag() {
        return ChildBag;
    }

    public void setChildBag(int ChildBag) {
        this.ChildBag = ChildBag;
    }
    ////////FLIGHT CLASSES METHODS
  public String businessClass( )     
{
int totalWeight= Backbag+ handbag+ ChildBag;   ///// BUSINESS CLASS WEIGHT CONDITION
  if( totalWeight>32)
       return "PAY  132 SR FOR EXRA WEIGHT";
else
       return "Weight Accepted";
}
  public String economicClass( )      ////////ECONOMIC CLASS WEIGHT CONDITION
{
int totalWeight= Backbag+ handbag+ ChildBag;   ////
  if( totalWeight>23)
       return "PAY  132 SR FOR EXRA WEIGHT";
else
       return "Weight Accepted";
}
  
   public String firstClass( )      ////////FIRST CLASS WEIGHT CONDITION
{
int totalWeight= Backbag+ handbag+ ChildBag;   ////
  if( totalWeight>32)
       return "PAY  132 SR FOR EVERY EXRA WEIGHT";
else
       return "Weight Accepted";
}
  
   
 public String BagClass(char x )     
{
    Scanner user=new Scanner(System.in);
     System.out.println("\nEnter Backbag weight");
     double Backbag1=user.nextInt();
    
     System.out.println("\nEnter handbag weight");
     double Handbag1=user.nextInt();
     
    System.out.println("\nEnter ChildBag weight");
     double ChildBag1=user.nextInt();
     
double totalWeight= Backbag1+ Handbag1 + ChildBag1;  ///// BUSINESS CLASS WEIGHT CONDITION

if(x=='A'||x=='C'){
  if( totalWeight>32)
      
       return "132";
else
       return "Weight Accepted"; 
}
else
{
      if( totalWeight>23)
       return "132";
else
       return "Weight Accepted";
      
}
}
 }  
   
   
   
   
   
   
   
   
   
  
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

