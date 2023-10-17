
package travelagency;
import java.util.Scanner;
public class Hotels extends BestService {
     double Hprice;
    public void printBest(int r){       //method that booking hotel
        Scanner input=new Scanner(System.in);
       
        // i use if statment to choose according to the city
          if(r==3){       
           System.out.println("..Hotels in kula lumpur..");
           System.out.println("Best recommended hotels:\n1- Sunway Velocity Hotel 4.4☆\n2- W Kula Lumpur hotel 4.7☆");
           int ww=input.nextInt();
           
           while(ww>2||ww<1){       // if he enter wrong number
               System.out.println("Sorry...you entr wrong number try again");
           }
           
           switch(ww){
               
            case 1:           // if he choose Sunway Velocity Hotel
               System.out.println("you choose Sunway Velocity Hotel "); 
               System.out.println("The location of the hotel in sunway velocity mall\n the price for 2 person for one night is (193 SR) "); 
               System.out.println("Do you want to book this hotel? \n1-yes \nor \n2-no "); 
               
                int gg=input.nextInt();
                
                if(gg==1)
                  System.out.println("Your room number 12 is booked on the second floor ✔️-Sunway Velocity Hotel \n-room number 12 on the second floor \n-price (193 SR)  "); 
                this.Hprice=193;
                
                 if (gg==2)
                   System.out.println("Your reservation failed"); 
                
                break;
            case 2:      //if he choose  W Kula Lumpur Hotel
               System.out.println("you choose W Kula Lumpur Hotel "); 
               System.out.println("The location of the hotel in twin tower\n the price for 2 person for one night is (876 SR) "); 
               System.out.println("Do you want to book this hotel? \n1-yes \nor \n2-no "); 
               
                int tt=input.nextInt();
                
                if(tt==1)
                  System.out.println("Your room number 30 is booked on the 4 floor ✔️- W Kula Lumpur Hotel \n-room number 30 on the 4 floor \n-price (876 SR)  "); 
                 this.Hprice=876;
                
                 if (tt==2)
                   System.out.println("Your reservation failed");   
                     
                
                break;
           }//end switch
              
                   
       }//end if
       
       
       else if (r==1){
         System.out.println("..Hotels in muscat..");
         System.out.println("Best recommended hotels:\n1- Hilton Garden Hotel 4.4☆\n2- The chedi Muscat hotel 4.6☆");
           int ww=input.nextInt();
           
           while(ww>2||ww<1){       // if he enter wrong number
               System.out.println("Sorry...you entr wrong number try again");
           }
           
           switch(ww){
               
            case 1:           // if he choose Hilton Garden Hotel
               System.out.println("you choose Hilton Garden Hotel "); 
               System.out.println("The location of the hotel next to trenity consultants oman\n the price for 2 person for one night is (292 SR) "); 
               System.out.println("Do you want to book this hotel? \n1-yes \nor \n2-no "); 
               
                int gg=input.nextInt();
                
                if(gg==1)
                  System.out.println("Your room number 2 is booked on the first floor ✔️  -Hilton Garden Hotel \n-room number 2 on the first floor \n-price (292 SR)"); 
                  this.Hprice=292;
                
                 if (gg==2)
                   System.out.println("Your reservation failed"); 
                
               break;  
            case 2:      //if he choose The chedi Muscat hotel
               System.out.println("you choose The chedi Muscat hotel "); 
               System.out.println("The location of the hotel is near to ghubrah lake park\n the price for 2 person for one night is (1908 SR) "); 
               System.out.println("Do you want to book this hotel? \n1-yes \nor \n2-no "); 
               
                int tt=input.nextInt();
                
                if(tt==1)
                  System.out.println("Your room number 14 is booked on the second floor ✔️- The chedi Muscat hotel \n-room number 14 on the second floor \n-price (1908 SR)  "); 
                  this.Hprice=1908;
                
                 if (tt==2)
                   System.out.println("Your reservation failed");   
                     
               break;  
               
           }//end switch
              
                   
       }//end if
         
           
       
       else if (r==2){
         System.out.println("..Hotels in alexandria..");  
         System.out.println("Best recommended hotels:\n1- Miramar Boutique Hotel 4.4☆\n2- Four Seasons hotel 4.7☆");
           int ww=input.nextInt();
           
           while(ww>2||ww<1){       // if he enter wrong number
               System.out.println("Sorry...you entr wrong number try again");
           }
           
           switch(ww){
               
            case 1:           // if he choose Sunway Velocity Hotel
               System.out.println("you choose Miramar Boutique Hotel "); 
               System.out.println("The location of the hotel is on EI-Gaish Rd\n the price for 2 person for one night is (120 SR) "); 
               System.out.println("Do you want to book this hotel? \n1-yes \nor \n2-no "); 
               
                int gg=input.nextInt();
                
                if(gg==1)
                  System.out.println("Your room number 44 is booked on the 5 floor ✔️  -Sunway Velocity Hotel \n-room number 44 on the 5 floor \n-price (120 SR)"); 
                  this.Hprice=120;
                
                 if (gg==2)
                   System.out.println("Your reservation failed"); 
                
              break;   
            case 2:      //if he choose  Four Seasons hotel
               System.out.println("you choose Four Seasons hotel "); 
               System.out.println("The location of the hotel at san stefano\n the price for 2 person for one night is (1257 SR) "); 
               System.out.println("Do you want to book this hotel? \n1-yes \nor \n2-no "); 
               
                int tt=input.nextInt();
                
                if(tt==1)
                  System.out.println("Your room number 17 is booked on the second floor ✔️ - Four Seasons hotel \n-room number 17 on the second floor \n-price (1257 SR) "); 
                  this.Hprice=1257;
                
                 if (tt==2)
                   System.out.println("Your reservation failed");   
                     
                
             break;   
           }//end switch
              
                   
       }//end if  
       
       else {
         System.out.println(" ");  
           
       }
     
          
          
    }//end method
    
}//end class






























































