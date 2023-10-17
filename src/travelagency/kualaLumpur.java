
package travelagency;


public class kualaLumpur extends City {
    String secondAirport = "Sultan Abdul Aziz Shah Airport";
    public kualaLumpur() {
      
       super("Malaysia", "Kuala Lumpur", "+60","International Airport");
    } 
    
    //overriding
    public String toString (){
        
        return(cityName+", "+country+ " - "+ airport);
         }
    
//overloading
    
    public String toString (String secondAirport){
       
        return(cityName+", "+country+ " - "+ secondAirport);
    }
    
    public void bookSeat( ){
    int row=5, colomn=7;
    numberOfSeats= new int[row][colomn];
    int setNumber=1;
    for(int i = 0; i < row ; i++){
           
            for(int r =0 ; r < colomn ;setNumber++, r++){
                 
                System.out.print("[_"+setNumber+"_]");
                
            }System.out.println("");}//end for loop.
    
    System.out.println("The first row is for first class.\n"
            +"The second row is for business class.\n"
            +"The third row is for premium economy class.\n"
            +"The fourth & fifth row is for economy class.\n"
    );
} 

public void getLetterOfSeat(int seatNumber){
    int row1=1,row2=8,row3=15,row4=22,row5=29;
        if(seatNumber==row1 || seatNumber==row2 || seatNumber ==row3 || 
                seatNumber==row4 || seatNumber==row5){
            System.out.print(seatNumber);  
            System.out.print(lettersOfSeats[0]); }
        else if(seatNumber== ++row1 || seatNumber== ++row2 || seatNumber == ++row3 || 
                seatNumber== ++row4 || seatNumber==++row5){
            System.out.print(seatNumber);  
            System.out.print(lettersOfSeats[1]);}
        else if(seatNumber== ++row1 || seatNumber== ++row2 || seatNumber == ++row3 || 
                seatNumber== ++row4 || seatNumber==++row5){
            System.out.print(seatNumber);  
            System.out.print(lettersOfSeats[2]);}    
        else if(seatNumber== ++row1 || seatNumber== ++row2 || seatNumber == ++row3 || 
                seatNumber== ++row4 || seatNumber==++row5){
            System.out.print(seatNumber);  
            System.out.print(lettersOfSeats[3]);}
        else if(seatNumber== ++row1 || seatNumber== ++row2 || seatNumber == ++row3 || 
                seatNumber== ++row4 || seatNumber==++row5){
            System.out.print(seatNumber);  
            System.out.print(lettersOfSeats[4]);}
        else if(seatNumber== ++row1 || seatNumber== ++row2 || seatNumber == ++row3 || 
                seatNumber== ++row4 || seatNumber==++row5){
            System.out.print(seatNumber);  
            System.out.print(lettersOfSeats[5]);}
        else if(seatNumber== ++row1 || seatNumber== ++row2 || seatNumber == ++row3 || 
                seatNumber== ++row4 || seatNumber==++row5){
            System.out.print(seatNumber);  
            System.out.print("your seat is"+lettersOfSeats[6]);
        }
   
}

public char ClassesKU(int seatNumber){
    if (seatNumber>=1||7>=seatNumber)
       return 'A';
    else if (seatNumber>=8||14>=seatNumber)   
        return'C';
    else if(seatNumber>=15||21>=seatNumber)
       return'Y';
    else if(seatNumber>=22||35>=seatNumber)
       return'B';  
    else 
     return '1';
    
    
}






}//end claas

