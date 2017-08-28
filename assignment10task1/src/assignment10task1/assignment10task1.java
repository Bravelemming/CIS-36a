
package assignment10task1;

import java.util.Scanner;

/**
 * cIS 36A
 * @author Jack Daniel Kinne
 */
public class assignment10task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter the month (1-12) in number format: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        
        while (month < 1 || month >12){
            System.out.println("Invalid entry.  Pleae input in this format: 1 (for January)");
            System.out.println("Please enter the month (1-12) in number format: ");
            sc= new Scanner(System.in);
            month = sc.nextInt();
        }
        
        String monthName;
        int days;
        
        switch (month) {
            case 1:  
                monthName = "January";
                days = 31;
                break;
            case 2:
                boolean year = Leap();
                if (year) {
                    days = 29;
                }
                else {
                    days = 28;
                }
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;                
            case 5:
                monthName = "May";
                days = 31;
                break;                
            case 6:
                monthName = "June";
                days = 30;
                break;                
            case 7:
                monthName = "July";
                days = 31;
                break;                
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;                
            case 11:
                monthName = "November";
                days = 30;
                break;                
            case 12:
                monthName = "December";
                days = 31;
                break;                
                
            default:
                System.out.println("Unexpected input.");
                return;                
        }
       
        System.out.println("It is " + monthName + ".  There are "+ days + " days in the month.");
        
    }

    public static boolean Leap() {
 
        System.out.println("Is it a leap year?  Enter the year now: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        boolean leapyear = (year % 4 == 0 && year % 100 != 0); 
        // (year % 400 = 0);
        
        System.out.println(leapyear);
        
    return leapyear;
    }

}