
package travelagency;

import java.util.Scanner;

public class employment {
    
    
     String name;
     int PhoneNumber;
     String address;
     String email; 
     int age; 
     String academic_qualification; 
     String Languages; 

    
   
    
 public void employee () {
       Scanner user=new Scanner(System.in);
 
 System.out.println("We are an integrated team in the kaizen office.\n We take good treatment among ourselves as a basic value, \nwith what characterizes most of our employees with wisdom and good behavior in management,\n which meets the needs of our valued customers in a way \nthat makes them extremely comfortable and satisfied since \nleaving their country until their arrival at the expected destination and even during their stay in hotels.  \nTo continue this path we need employees like you who are energetic,\n creative and value initiative.\n" +
"\n" +
" Our valued customers and visitors are at the heart of our interests in everything\n we do and our goal is to exceed their expectations every day. \n To achieve this, we need team members who are creative and committed to providing outstanding service.\n" +
"\n" +
" If you see in yourself the ability to make a difference by being part of our team, \nwe will be happy to communicate with you to learn more about your ideas.\n" +
"\n" +
" Please email your resume to HR@kaizen.com if you are interested in joining.\nConnect with the kaizen office on LinkedIn to see a range of jobs currently available");
               
                    System.out.println("\nEnter Your Full Name");
                    this.name=user.nextLine();                  
                    
                    System.out.println("Enter Your Phone Number");
                     this.PhoneNumber=user.nextInt();
                     
                    System.out.println("Enter Your Email");
                    this.email=user.nextLine();
                    
                    System.out.println("Enter Your adress");
                    this.address=user.nextLine();
                    
                    System.out.println("Enter Your age");
                    this.age=user.nextInt();
                    
                    System.out.println("Enter Your academic qualification");
                    this.academic_qualification=user.nextLine();
                    
                    System.out.println("your Languages");
                    this.Languages=user.nextLine();
                    
                    System.out.println("Please send your CV to the e-mail HR@kaizen.com");
                    
                    System.out.println("Thank you!  Your request will be reviewed and responded to as soon as possible");
 
 
 
 }
    
    
}

