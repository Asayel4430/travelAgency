
  package travelagency;

import java.util.ArrayList;
import java.util.Collection;

public class Reservation {

    private Customer customer;
    private Flight flight;
    
    private String SeatType;
    private String SeatNo;

    public void printtcket() {

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getSeatType() {
        return SeatType;
    }

    public void setSeatType(String SeatType) {
        this.SeatType = SeatType;
    }

    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo = SeatNo;
    }
    public void BoardingPass(String name,String IATA,String date,char clases,int seat){
    System.out.println("---------------------------------------------");    
    System.err.println("    BOARDING PASS           KIAZEN AGENCY    ");
    
    System.out.println(" "+name+"                                   "+seat     );
    
    System.err.println("\nNAME OF PASSENGER                    seat"   );
    
    System.out.println("\n"+IATA+"                             "+clases );
    
    System.err.println("\nIATA CODE                           CLASS");
    
    System.out.println("\n                DATE "+date);
    System.out.println("---------------------------------------------"); 
    
                    
        
    }

}
    
    
    

