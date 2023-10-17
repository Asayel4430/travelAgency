
package travelagency;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Booking {
    
int nationality;
int NationalNumber = 0;
private int visa;    
private LocalDate bookDate;
private Date flightDate;
private double totalPrice; 
private String bookType; 
Customer customer=new Customer();

    public Booking() {
        
    }

   
    public void setBookDate() {
     
   this.bookDate= LocalDate.now(); 
 
 }  

    

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

   

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public LocalDate getBookDate() {
        return bookDate;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public String getBookType() {
        return bookType;
    }

   public double calculateTotalPrice(){
       
    return 0;
       
   }
   
      public Date getFlightDate() {
        return flightDate;
    }

    public int getVisa() {
        return visa;
    }
      
   public void addBookTicket(){
       
   }
    
   
    public void printTicket(){
        
    }

   
   
     
    
       
    public static boolean IsVisaValid(int visa)
{
if(visa>=2023){
 return true;
}

else {
return false;
}
}
    
   
    
  public void Bookinginfo () {
    Scanner s = new Scanner(System.in);   
     
                   customer.add();
                    
                        System.out.println("1-Saudi"); 
                        System.out.println("2-not Saudi"); 
                        System.out.print(" > Enter your choice:  "); 
                        nationality = s.nextInt(); 
                        if (nationality == 1) { 
                            System.out.println("enter your national ID number please"); 
                            NationalNumber = s.nextInt(); 
                           String UserNationality = "Saudi"; 
                         
                        } 
                        else if (nationality == 2) { 
                          System.out.println("enter your nationality please"); 
                          String Cusnationality=s.next();
                          
                          System.out.println("enter your iqama number please"); 
                            int iqama = s.nextInt(); 
                        System.out.println("enter year of expiration"); 
                            int enddate = s.nextInt(); 
                           boolean i = IsVisaValid(enddate);  
                            if (i ==false) { 
                                System.out.println("sorry. The valid iqama is only 2023 or after.");  
                              System.exit(0);
                            }
                        }
  
                         System.out.println("enter your visa number please"); 
                            int visa = s.nextInt(); 
                           
                            System.out.println("enter year of expiration"); 
                            int enddate = s.nextInt(); 
                                boolean v = IsVisaValid(enddate);  
                              
                             if (v ==false) { 
                                System.out.println("sorry. The valid visa is only 2023 or after.");  
                               System.exit(0);
    
  }
   
      
    
  
    
}//class end   
    
}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

