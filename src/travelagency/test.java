//last update
/**
 * @author khadija alajmi 443005840
 * @author Amal saeed 443013140
 * @author teif alhrbi 443010335
 * @author lujain alhebshi 443011980
 * @author asayel Qaid 443011953
 * group 8
 */
package travelagency;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.ImageIcon;
public class test {

    
    
 public static void main(String[] args) {  
      
     
     ImageIcon im = new ImageIcon();
       System.out.println("WELCOME TO KIAZEN AGENCY");
     Scanner input = new Scanner(System.in);
     
    
     
    System.out.println( "_¶¶¶¶¶\n" +
"__¶__¶¶¶\n" +
"__¶¶___¶¶¶\n" +
"___¶¶____¶¶\n" +
"____¶¶_____¶¶\n" +
"______¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
"_______¶¶_______________________________¶¶\n" +
"_________¶¶_____________________________¶¶¶\n" +
"__________¶_______________________¶¶¶¶¶¶¶\n" +
"_________¶___________________¶¶¶¶¶¶¶\n" +
"_________¶______________¶¶¶¶¶¶¶\n" +
"_________¶___________¶¶¶¶¶\n" +
"_________¶____________¶¶\n" +
"________¶¶_______¶¶¶___¶¶¶\n" +
"________¶________¶¶¶¶____¶¶\n" +
"________¶_______¶¶__¶¶¶___¶¶¶\n" +
"________¶______¶¶_____¶¶____¶¶\n" +
"_______¶¶_____¶¶_______¶¶¶___¶¶¶¶¶¶¶¶¶¶¶¶\n" +
"_______¶¶_____¶¶_________¶¶¶___¶________¶¶\n" +
"_______¶_____¶¶___________¶¶¶____________¶¶¶\n" +
"_______¶____¶¶_____________¶¶_____¶¶¶¶¶¶¶¶¶\n" +
"______¶¶____¶______________¶¶____¶¶¶¶\n" +
"______¶¶___¶¶_____________¶¶____¶¶¶¶¶\n" +
"______¶___¶¶______________¶¶___¶¶_¶¶¶¶\n" +
"______¶¶_¶¶_______________¶¶__¶¶\n" +
"_______¶¶¶_________________¶¶_¶¶\n" +
"____________________________¶¶¶\n" +
"_____________________________¶\n" +
""); 
    
    
       //create list of flights
       
        //Reservation Collections
       
        Scanner user=new Scanner(System.in);     
      Customer customer = null;
      Booking booking = new Booking();
      List<Flight> flightList = createListFlights();
        //Reservation Collections
        ArrayList<Reservation> listReservation = new ArrayList<>();
        double price=0;
          BestPrice bestP = new BestPrice();
          BagWeight bag1= new BagWeight();
         double HP1=0.0;
         double totalPrice;
         int bagPr=0;
         char FCls = 0;
         String dateTime = null;
         int seatNumber = 0;
         String IATA="";
         
      System.out.println("1-Book as a visitor 2-Log in 3-Don't have an account? Sign up");
     
     int account =user.nextInt();
     String line=user.nextLine();// take new when the user want to input
     
     do{
              switch(account){
                  
                  case(1):
                    System.out.println("Enter Your Full Name");
                    String FullName=user.nextLine();
                    
                    System.out.println("Enter Your Phone Number");
                    int Phone=user.nextInt();
                  
                     break;  
                  
                  case(2):
                      
                    System.out.println("Enter Your Email or User Name");
                        String Email=user.nextLine();
                    
                    System.out.println("Enter Your password");
                    int password=user.nextInt();
                   
                    line=user.nextLine();
                    
                    System.out.println("Enter Your Verification code");
                    int code=user.nextInt();
                    
                      
                    break;   
          
                   
                  case(3):
                  
                    
                    System.out.println("Enter Your Full Name: ");
                     FullName=user.nextLine();
                    
                    System.out.println("Enter Your User Name: ");
                    String username=user.nextLine();
                    
                    System.out.println("Enter Your Phone Number: ");
                     Phone=user.nextInt();
                    
                    System.out.println("Enter Your Email: ");
                     Email=user.nextLine();
                   
                    System.out.println("Enter Your Password: ");
                     password=user.nextInt();
                    
                    line=user.nextLine();
                    
                    System.out.println("You have received a link in your Email \n open the link to confirm your request to create an account");
                            
                 
                     break; 
                     
                  
                      
                  default:
                      System.err.println("!!You Enterd Wrong number Please Try Again!!");
                     account=4;
              }//switch end
          }//do end
          
      while (account==4)  ;
        
    int choose;
     do {
          System.out.println("choose one of the following");
          System.out.println("1- Flight booking");
          System.out.println("2- Hotel booking");
          System.out.println("3- Complaints ");
          System.out.println("4- lost and found ");
          System.out.println("5- employment");
          choose = input.nextInt();
         
          switch(choose){
          
              case 1:
                   Flight flight = new Flight();//1
        City[] city = {new Muscat(), new Alexandria(),new kualaLumpur()};//2

       
        

         String secondAirportKualaLumpur = ((kualaLumpur) city[2]).secondAirport;
        String secondAirportAlexandria = ((Alexandria) city[1]).secondAirport;

                   
                    System.out.println("Please enter your destination city: \n 1-Muscat \n 2-Alexandria \n 3-kualaLumpur");
                    
                   int destNum = input.nextInt();
                    
                   String destinationCity;
                   
                    if(destNum==1){
                       
                    destinationCity = "Muscat";
                    IATA="MED✈️︎MCT";
             Muscat mu = new Muscat();
                     flight.chooseAirport(destNum);//1
                  System.out.println("choose one of these flights MED✈️︎MCT");
                  System.out.println("1- Date : 22-2-2023 Time : 9:45PM");
                  System.out.println("2- Date : 23-2-2023 Time : 2:23PM");
                  System.out.println("3- Date : 24-2-2023 Time : 12:08AM");
                  int ch=user.nextInt();
                   switch (ch){
                 
              case 1 :
                        dateTime = "22-2-2023"; 
                       
                     getFlights(destinationCity, dateTime, flightList);
                       break;
              case 2 : 
                       dateTime = "23-2-2023"; 
                       getFlights(destinationCity, dateTime, flightList);
                       break;
              case 3 : 
                       dateTime = "24-2-2023"; 
                      getFlights(destinationCity, dateTime, flightList);
                    break;
                                    
                   
                   }                
                             
                    booking.Bookinginfo();
                  
               System.out.println(city[0].toString());
                city[0].bookSeat();
                seatNumber = input.nextInt();
                ((Muscat) city[0]).getLetterOfSeat(seatNumber);
                FCls=mu.ClassesMU(seatNumber);
                  String bag=bag1.BagClass(FCls);
                    price=1335;//MUS price
                  bestP.getCurrencyExchangeform(price);
                if(bag.equals("123")){
                       bagPr=Integer.parseInt(bag);}
                else
                  System.err.println(bag);
                
                    }
                
              
                    
                   else if (destNum==2){
                      
                    destinationCity= "Alexandria"; 
                   IATA="MED✈️︎HBE";
                  Alexandria al = new Alexandria ();
                    flight.chooseAirport(destNum);//1
                    int destination = input.nextInt();            
                    
                     System.out.println("choose one of these flights MED✈️︎HBE");
                  System.out.println("1- Date : 22-2-2023 Time : 9:45PM");
                  System.out.println("2- Date : 23-2-2023 Time : 2:23PM");
                  System.out.println("3- Date : 24-2-2023 Time : 12:08AM");
                    int ch=user.nextInt();
                   switch (ch){
                 
              case 1 :
                        dateTime = "22-2-2023"; 
                    getFlights(destinationCity, dateTime, flightList);
                       break;
              case 2 : 
                       dateTime = "23-2-2023"; 
                       getFlights(destinationCity, dateTime, flightList);
                       break;
              case 3 : 
                       dateTime = "24-2-2023"; 
                      getFlights(destinationCity, dateTime, flightList);
                    break;
                   }                 
                   
                    booking.Bookinginfo();
                    
                    
                     
                    switch (destination) {
            case 1:
                System.out.println(city[1].toString());
                city[1].bookSeat();
                seatNumber = input.nextInt();
                ((Alexandria) city[1]).getLetterOfSeat(seatNumber);     
                
                    FCls=al.ClassesAS(seatNumber);
                  
                     price=2680; //HBE price
                  bestP.getCurrencyExchangefora(price);
                  String  bag=bag1.BagClass(FCls);
                  if(bag.equals("123"))
                       bagPr=Integer.parseInt(bag); 
                  
                  else
                  System.err.println(bag);
                break;
                
            case 2:
            
                System.out.println(((Alexandria) city[1]).toString(secondAirportAlexandria));
                city[1].bookSeat();
                seatNumber = input.nextInt();
                ((Alexandria) city[1]).getLetterOfSeat(seatNumber);
                    FCls=al.ClassesAS(seatNumber);
                   bag=bag1.BagClass(FCls);
                     price=2680; //HBE price
                     bestP.getCurrencyExchangefora(price);
               if(bag.equals("123")){
                       bagPr=Integer.parseInt(bag); }
               else
                  System.err.println(bag);
                break;
                
                   
                   }
                   
   
                   }
                  

                   else if (destNum==3){
                    destinationCity= "kualaLumpur"; 
                    IATA="MED✈️︎KUL";
                     kualaLumpur ku = new kualaLumpur(); 
                     flight.chooseAirport(destNum);
                    int destination = input.nextInt();
                     System.out.println("choose one of these flights MED✈️︎KUL");
                  System.out.println("1- Date : 22-2-2023 Time : 9:45PM");
                  System.out.println("2- Date : 23-2-2023 Time : 2:23PM");
                  System.out.println("3- Date : 24-2-2023 Time : 12:08AM");
                  int ch=user.nextInt();
                   switch (ch){
                 
              case 1 :
                      dateTime = "22-2-2023"; 
                     getFlights(destinationCity, dateTime, flightList);
                       break;
              case 2 : 
                       dateTime = "23-2-2023"; 
                       getFlights(destinationCity, dateTime, flightList);
                       break;
              case 3 : 
                       dateTime = "24-2-2023"; 
                      getFlights(destinationCity, dateTime, flightList);
                    break;
                   }                 
                   
            
                    booking.Bookinginfo();
                    
                      switch (destination) {
            case 1:
                System.out.println(city[2].toString());
                city[2].bookSeat();
                System.out.println("Enter number of set you want:");
                seatNumber = input.nextInt();
                ((kualaLumpur) city[2]).getLetterOfSeat(seatNumber);
                 FCls=ku.ClassesKU(seatNumber);
                  String bag=bag1.BagClass(FCls);
                   price=4378; //KUL price
                  bestP.getCurrencyExchangefork(price); 
                  if(bag.equals("123")){
                       bagPr=Integer.parseInt(bag);}
                  else
                  System.err.println(bag);
                break;
            case 2:
                
                System.out.println(((kualaLumpur) city[2]).toString(secondAirportKualaLumpur));
                city[2].bookSeat();
                seatNumber = input.nextInt();
                ((kualaLumpur) city[2]).getLetterOfSeat(seatNumber);
                  FCls=ku.ClassesKU(seatNumber);
                   bag=bag1.BagClass(FCls);
                   price=4378; //KUL price
                  bestP.getCurrencyExchangefork(price);  
                  if(bag.equals("123")){
                       bagPr=Integer.parseInt(bag);}
                  else
                  System.err.println(bag);
                break;

                   }
                   }
                   
                  
                   else{
                        System.err.println("!!!You Entered wrong Number!!!");
                        break;
                   }
                     
                 
                  System.out.println("\ndo you want to book a hotel? \n 1-yes\n 2-no");
                   int book=user.nextInt();
                   
                   if (book==1){
                       Hotels hotel = new Hotels();
                             
                hotel.printBest(destNum); 
               
                  HP1=hotel.Hprice;
                   }
                   totalPrice=HP1+price+bagPr;
                   
                   System.err.println("YOUR TOTAL PRICE IS: "+totalPrice);
                   
                   System.out.println("Do you have discount code?\n1-Yes\n2-No");
                
                   int dis=user.nextInt();  //code is FEB22
                   if(dis==1) {
                       System.out.println("Enter Your Discount code:");
                
                   String code=user.next();
                       
                  totalPrice= bestP.discount(totalPrice, code);
                  System.err.println("Your New Price Is:"+totalPrice);
                  
                 
                          }
                   
                   Reservation res=new Reservation();
                    res.BoardingPass(booking.customer.getFullName(),IATA, dateTime, FCls,seatNumber);

                   System.out.println("we offer two services to give you best places and best food:");

                   System.out.println("do you want to know best plases in your destenation? \n 1-Yes 2-No");
                   int besP=user.nextInt();
                   if(besP==1){
                   BestPlaces Bp = new BestPlaces();
                     Bp.printBest(destNum);
                     
                   }
                  
                   System.out.println("do you want to know best Food in your destenation? \n 1-Yes 2-No");
                  int besF=user.nextInt();
                   if(besF==1){
                       Food food = new Food ();
                       food.printBest(destNum);
                   }
                   
                  
                  break;
        //____________________________________________________________________________________________________________          
              case 2 :
                  Hotels hotel = new Hotels();
                  System.out.println("choose one of the following");
                  System.out.println("1-Hotel in muscat ");
                  System.out.println("2-Hotel in Alexandria");
                  System.out.println("3-Hotel in kula lumpur");
                  int ch=user.nextInt();              
                  hotel.printBest(ch);
                  break;
        //____________________________________________________________________________________________________________   
              case 3 :
                 System.out.println("What is your Complaint About? \n 1-Services \n 2-Employee \n 3-Delay in time \n 4-food \n 5-Theft and Fraud \n 6-Other");
                  int Complaint =user.nextInt();
                  String i =user.nextLine();
                       
                  switch(Complaint){
                           
                      case 1:
                   System.out.println("please can you specify the exact Service Complaint? ");
                   String specify =user.nextLine();
                   break;
                       
                      case 2:
                   System.out.println("please can you mention the Employee's Name? \n if you don't Know his/her name please write his position ");
                   String  ComplaintEN=user.nextLine();
                   break;
                      
                      
                     case 3:
                   System.out.println("please can you tell us what the delay you faced? ");
                   String  delay=user.nextLine();
                   break;
                   
                     case 4:
                   System.out.println("What the Meal that do you want to Complain About? ");
                   String foodC=user.nextLine();
                   break;
                   
                     case 5:
                   System.out.println("Can you tell us Any information do You know About the person who defraduded you? ");
                   String fraudInfo=user.nextLine();
                   break;
                   
                   
                     default:
                   System.out.println("Can you tell us what You Complaint? ");
                   String other=user.nextLine();
  
                   System.out.println("enter the exsact day of your Complaint? ");
                   String ComDay=user.nextLine();
                   
                   System.out.println("Can you tell us the exsact time of your Complaint if you remmber ? ");
                   String ComTime=user.nextLine();
                   
                   
                    System.out.println("if you have more notes please mention it here: ");
                   String noteCom= user.nextLine();
                     
                   System.out.println("Enter Your number to receive everything related to your Complaint");
                   long numCom= user.nextLong();
                   i =user.nextLine();
                   System.out.println("Thank You \nWe will contact with you as Soon as Possible");

                  }
                 
                  break;
        //____________________________________________________________________________________________________________   
             case 4:
                   System.out.println("Can you tell us what You Lost ? ");
                   String Lost =user.nextLine();
                   
                   System.out.println("Can you tell us the exsact Day of your lost? ");
                   int lostDay=user.nextInt();
                 
                   System.out.println("Enter Your number to receive everything related to your Lost");
                 
                   long numLost= user.nextLong();
                   i =user.nextLine();
                   
                   System.out.println("Thank You \nWe will contact with you as Soon as Possible");
                  break;
        //____________________________________________________________________________________________________________   
               case 5 :
                   employment employe = new employment();
                 employe.employee();
        //____________________________________________________________________________________________________________   
              default:
                 System.err.println("!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!"); 
                 System.err.println(" wrong choice, please enter the correct choice");
                 System.err.println("!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!");
                 
                 choose=5; //incorrect number equle 5
                 break;
          
          }
        
        } while (choose==5);//if choose equle 5 go to the loop 
    
    
       
    
      System.out.println("-------------------------- ");  
      System.out.println ("You booked a flight in: ");
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();  
      System.out.println(dtf.format(now));  
    

     
    int evulation; 
  do {  
        System.out.println("Please  evaluating the quality of services, using the scale (1-5) stars as the following: ");
            System.out.println("1 star  → strongly unsatisfied ( ͡❛ ︹ ͡❛)");
            System.out.println("2 stars → unsatisfied (❛︣ ︹ ❛︣)");
            System.out.println("3 stars → satisfied ( ͡❛ - ͡❛)");
            System.out.println( "4 stars → strongly satisfied ( ͡❛ ͜ʖ ͡❛)");
            System.out.println("5 stars → outstanding ( ͡❛ ‿ ͡❛)");
            System.out.print(" > Enter your choice:  ");
        evulation = input.nextInt();
        
              switch (evulation)  {
            
              case 1: //When evaluating the user 1 star
                String customerEvulation = "strongly unsatisfied";
        System.out.println("we regret that, Tell us how we can improve by sharing your thoughts\nyou will get reimbursed with a discount coupon 40% for your next flight");
        input.next();
              break;
          
              case 2 : //When evaluating the user 2 stars
                  customerEvulation = "unsatisfied";
        System.out.println("we regret that, Tell us how we can improve by sharing your thoughts\nyou will get reimbursed with a discount coupon 30% for your next flight");  
        input.next();
              break; 
        
             case 3: //When evaluating the user 3 stars
                  customerEvulation = "satisfied";
        System.out.println("we regret that, Tell us how we can improve by sharing your thoughts\nyou will get reimbursed with a discount coupon 20% for your next flight");
        input.next();
             break;
        
             case 4: //When evaluating the user 4 stars
           customerEvulation = "strongly satisfied";
        System.out.println("we regret that, Tell us how we can improve by sharing your thoughts\\nyou will get reimbursed with a discount coupon 40% for your next flight");
        input.next();
             break;
        
            case 5: //When evaluating the user 5 stars
            customerEvulation = "outstanding";
        System.out.println("We enjoy it! Our utmost goal is to ensure customer satisfaction and provide the best quality of services\nTell us about your experience with our suggestions");
        input.next(); 
            break; 
        
        default:
              System.out.println("__________________________________________________\n");
              System.err.println("You Enter Wrong choice please enter correct choice");  
              System.out.println("__________________________________________________");
             evulation = 6;
             break;
        }
            
   } while (evulation ==6 );
    
    
    System.out.println("THANK YOU FOR CHOOSING KIAZEN");  
    
  
}//end main
 
 public static List<Flight> createListFlights() {//HBE
        
        List<Flight> flightsList = new ArrayList<>();

        //MED✈️︎KUL
        //(02h 20m)MED✈️︎MCT  مسقط
        //MED✈️︎HBE(02h 10m)  الاسكندرية
        flightsList.add(new Flight("(MH 153)", "22-2-2023", "MED✈️︎KUL", "09h 20m", 35,"9:45PM", new kualaLumpur()));
        flightsList.add(new Flight("(MH 159)", "23-2-2023", "MED✈️︎KUL", "09h 20m", 35,"2:23PM", new kualaLumpur()));
        flightsList.add(new Flight("(MH 159)", "24-2-2023", "MED✈️︎KUL", "09h 20m", 35,"12:08AM" , new kualaLumpur()));
        
        flightsList.add(new Flight("(SM 2444)", "22-2-2023", "MED✈️︎HBE", "(02h 10m)", 28,"9:45PM" , new Alexandria()));
        flightsList.add(new Flight("(SM 680)", "23-2-2023", "MED✈️︎HBE", "(02h 10m)", 28,"2:23PM", new Alexandria()));
        flightsList.add(new Flight("(SM 2444)", "24-2-2023", "MED✈️︎HBE", "(02h 10m)", 28,"12:08AM", new Alexandria()));
        
        
        flightsList.add(new Flight("(WY 678)", "22-2-2023", "MED✈️︎MCT", "(02h 20m)", 30,"9:45PM" , new Muscat()));
        flightsList.add(new Flight("(WY 678)", "23-2-2023", "MED✈️︎MCT", "(02h 20m)", 30,"2:23PM", new Muscat()));
        flightsList.add(new Flight("(WY 823)", "24-2-2023", "MED✈️︎MCT", "(02h 20m)", 30,"12:08AM" , new Muscat()));

        return flightsList;
    }
  
 
 
 
 
 private static void getFlights(String destinationCity, String dateTime, List<Flight> flights) {

        List<Flight> flightResult = new ArrayList<>();
        for (int i = 0; i < flights.size(); i++) {
            //flights=flights.get(0).destination
            if (flights.get(i).destination.getCityName().equals(destinationCity) && flights.get(i).getFlightTime().equals(dateTime)) {
                flightResult.add(flights.get(i));
            }

        }
        for (int i = 0; i < flightResult.size(); i++) {
            System.out.println(flightResult.get(i).toString());

        }

    }
 
 
 
}//end class
       
      
      
      
 
   
    

