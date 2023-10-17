
package travelagency;

public class Madinah extends City {
     //cosructer City(String country, String cityName,
    //String countryCod, String cityCode, String airport)

   
    public Madinah() {
        super("Saudi Arabian", "Madinah", "+966", "Prince Mohammad Bin Abdulaziz International Airport");
        
    }

    
    
    public String toString () {
        return(cityName+", "+country+ " - "+ airport);
    }
public void bookSeat( ){
    int row=0, colomn=0;
    numberOfSeats= new int[row][colomn];
    int setNumber=0;
    for(int i = 0; i < row ; i++){
           
            for(int r =0 ; r < colomn ;setNumber++, r++){
                 
                System.out.print("[_"+setNumber+"_]"+"  ");
                
            }System.out.println("");}//end for loop.
   
}
    
}//end
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

