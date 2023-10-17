
package travelagency;

public class Muscat extends City {

    public Muscat() {
        super("Oman", "Muscat", "+968", "Seeb International Airport");
    }

    public String toString (){
        
        return(cityName+", "+country+ " - "+ airport);
         }
     public void bookSeat( ){
   int row=5, colomn=6;
    numberOfSeats= new int[row][colomn];
    int setNumber=1;
    for(int i = 0; i < row ; i++){
           
            for(int r =0 ; r < colomn ;setNumber++, r++){
                 
                System.out.print("[_"+setNumber+"_]"+"  ");
                
            }System.out.println("");}//end for loop.
    System.out.println("The first row is for first class.\n"
            +"The second row is for business class.\n"
            +"The third row is for premium economy class.\n"
            +"The fourth & fifth row is for economy class.\n"
    );}
     public void getLetterOfSeat(int seatNumber){
    int row1=1,row2=7,row3=13,row4=19,row5=25;
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
            System.out.print(" your seat is"+lettersOfSeats[6]);
        }
   
}
     
     
 public char ClassesMU(int seatNumber){
    if (seatNumber>=1||6>=seatNumber)
       return 'A';
    else if (seatNumber>=7||12>=seatNumber)   
        return'C';
    else if(seatNumber>=13||18>=seatNumber)
       return'Y';
    else if(seatNumber>=19||30>=seatNumber)
       return'B';  
    else 
        return '1';

     
 } 
     
     
     
}
    
    
    
    
    
    
    
    
    
    
    
    
    

