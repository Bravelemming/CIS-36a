package finaltask1;
/**
 * @author Jack Daniel Kinne
 */
import java.util.Scanner;

class time {

    void time(){ // full conversion
        System.out.println("Please input number of seconds to convert up to one day: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hours = a / 3600;
        int minutes = (a / 60 ) % 60;
        int leftsec = a % 60;        

        if (a <= 86400 && a>= 1) {
          System.out.println("Seconds input: " + a);
          System.out.println("Hours Remaining: " + hours);
          System.out.println("Minutes: " + minutes);
          System.out.println("Remaining seconds: " + leftsec);
        }
        else {
          System.out.println("Please input a value, maximum of 86,400 seconds.");
        }  
    
    }
    
    void timeMinutes(){ // minutes conversation, and seconds only.
        System.out.println("Please input number of seconds to convert up to one day: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int hours = a / 3600;
        int minutes = (a / 60 ) ;
        int leftsec = a % 60;        

        if (a <= 86400 && a>= 1) {
          System.out.println("Seconds input: " + a);
          System.out.println("Minutes: " + minutes);
          System.out.println("Remaining seconds: " + leftsec);
        }
        else {
          System.out.println("Please input a value, maximum of 86,400 seconds.");
        }          
    }
    
}

public class finaltask1 {
  
  public static void main(String[] args){
    //task1
    time riley = new time(); //time object
    System.out.println("time converter.  Please input 1 for conversion of hours, minutes, seconds: ");
    System.out.println("time converter.  Please input 2 for conversion of minutes, seconds: ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    switch(x){
    case(1):
        riley.time();
        break;
    case(2):
        riley.timeMinutes();
        break;
    default: 
        System.out.println("Please input '1' or '2' only. ");
    }

  }   
}