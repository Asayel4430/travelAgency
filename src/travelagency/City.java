
package travelagency;


public class City {

     String country;
     String cityName;
     String countryCod;
     String airport;
     protected int [ ][ ] numberOfSeats; 
     protected char[ ] lettersOfSeats={'A','B','C','D','E','F','G'}; 
     
    public City() {
    }

 public City(String country, String cityName, String countryCod,String airport) {
        this.country = country;
        this.cityName = cityName;
        this.countryCod = countryCod;
        this.airport = airport;
    }
     //---------------------------
    public void setCountry(String country) {
        this.country = country;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCountryCod(String countryCod) {
        this.countryCod = countryCod;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getCountry() {
        return country;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryCod() {
        return countryCod;
    }

    public String getAirport() {
        return airport;
    }
    //-------------------------
    //method overriding.
public String toString () {
        return(cityName+", "+country+ " - "+ airport);
    }
public void bookSet( ){
    int row=0, colomn=0;
    numberOfSeats= new int[row][colomn];
    int setNumber=1;
    for(int i = 0; i < row ; i++){
           
            for(int r =0 ; r < colomn ;setNumber++, r++){
                 
                System.out.print("[_" +setNumber+ "_]"+"  ");
                
            }System.out.println("");}//end for loop.
   
//    lettersOfSeats=new char[row];
//    for(int i = 0; i < row ; i++){
//        
//    }
           
   
}

    void bookSeat() {
       
    }
   
}//end class