 package travelagency;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;

public class Flight {

    private String flightNumber;
    private String flightTime;
    private String IATACode;  //اضافي
    private String durationTime;  //اضافي
    private int capacity;
    private int numberOfSeatsLeft;
     private String takeoff;

    //------------------------
   City[] city=new City[3];
    Madinah depature = new Madinah();
    City destination;
// City[ ] city= {new kualaLumpur(), new Alexandria() ,new Muscat()};

    public Flight(String flightNumber, String flightTime, String IATACode, String durationTime, int capacity, String takeoff, City destination) {
        this.flightNumber = flightNumber;
        this.flightTime = flightTime;
        this.IATACode = IATACode;
        this.durationTime = durationTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft=capacity;
        this.takeoff = takeoff;
        this.destination = destination;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    //enum;  
    public Flight() {
    }

    //set
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepature(Madinah depature) {
        this.depature = depature;
    }

    public String getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }

    

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime;
    }

    //get
    public String getFlightNumber() {
        return flightNumber;
    }

    public Madinah getDepature() {
        return depature;
    }


    public String getFlightTime() {
        return flightTime;
    }

    public String getIATACode() {
        return IATACode;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public void bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft--;
        } else {
            System.out.println("No more seats left!");
        }
    }

//method
   public void chooseAirport(int desNum){
       
       
      if(desNum==1){
          city [0]=new Muscat();
          System.out.println(city[ 0 ].toString());
      } else if (desNum==2){
          city [1]=new Alexandria();
           String secondAirportAlexandria = ((Alexandria)city[ 1 ]).secondAirport; 
          System.out.println("Choose airport:");
           System.out.println( "1- "+city[ 1 ].toString());
           System.out.println("2- "+((Alexandria)city[ 1 ]).toString(secondAirportAlexandria)); 
      }  else if (desNum==3){
           city [2]=new kualaLumpur();
           String secondAirportKualaLumpur = ((kualaLumpur)city[ 2 ]).secondAirport;
          System.out.println("Choose airport:");
           System.out.println( "1- "+city[ 2 ].toString());
           System.out.println("2- "+((kualaLumpur)city[ 2 ]).toString(secondAirportKualaLumpur));     
      }
}

//flight Date.
    public String chooseFlightDate() {
      
        Scanner input = new Scanner (System.in);
        System.out.println("Enter year:");
    int year= input.nextInt();
    System.out.println("Enter month:");
    int month= input.nextInt();
    System.out.println("Enter day:");
   int day = input.nextInt();
  
      LocalDate flightDate = LocalDate.of(year, month, day);
        System.out.println(flightDate);
        return ""+flightDate;
    }
    
    
    

    @Override
    public String toString() {
        return  ("flightNumber = " + flightNumber + "\n flightTime = " + flightTime + "\n IATACode = " + IATACode + "\n durationTime = " + durationTime + "\n capacity = " + capacity + "\n numberOfSeatsLeft = " + numberOfSeatsLeft + "\n takeoff = " + takeoff + "\n depature = " + depature + "\n destination = " + destination);
    }

    
}//end class Flight
    
    
    
    
    
    
    
    
