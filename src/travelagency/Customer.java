
package travelagency;

import java.util.Scanner;

public class Customer {
 private String FullName;
 private int Phone;
 private  String Email;
 private String gender;
 private int PassportNo;

    public Customer() {
    }

    public Customer(String FullName, int Phone, String Email) {
        this.FullName = FullName;
        this.Phone = Phone;
       
        this.Email = Email;
    }

    public Customer(String FullName, int Phone, String Email, String gender) {
        this.FullName = FullName;
        this.Phone = Phone;
        this.Email = Email;
        this.gender = gender;
    }

    
    Customer(String FullName, int Phone) {
     
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

  

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassportNo(int PassportNo) {
        this.PassportNo = PassportNo;
    }
 
    
    
  
    void add() {
        Scanner input = new Scanner (System.in);
        try {
            System.out.println("Enter your Name:");//The user is asked to enter his name
            String Name = input.next();//Take the entered value
            setFullName(Name);
             System.out.println("Enter Your gender: male or famale");
            String gen = input.next();
            setGender(gen);
             System.out.println("Enter year of Birth:");
            int Byear = input.nextInt(); 
            System.out.println("Enter month of Birth:");
            int Bmonth = input.nextInt();
            System.out.println("Enter day of Birth:");
            int Bday = input.nextInt();
            System.out.println("Enter your MobileNumber(first the country code followed by the full phone number)");//Request to enter the number
            int Phone1 = input.nextInt(); //Take the entered value
            setPhone(Phone1);
            System.out.println("Enter your Passwport Number:");
            int Passport = input.nextInt();
            setPassportNo(Passport);
            System.out.println("Enter your Email:");   
            String Emailt = input.next();
            setEmail(Emailt);
            System.out.println("");
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //To change body of generated methods, choose Tools | Templates.
    }

}
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

