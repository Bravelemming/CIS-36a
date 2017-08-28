package assignment8task2;

import java.util.Scanner;

/**
 * @author "Jack" Daniel Kinne
 * Change calculator, list change due.
 */
public class assignment8task2 {

    public static void main(String[] args) {
        
        System.out.println("Please input amount due:");
        Scanner scan = new Scanner(System.in);
        float dueF = scan.nextFloat(); //amount due
        
        int due = (int) (dueF*100); //cast to int to save change

        System.out.println("Please input amount received:");
        float recF = scan.nextFloat(); // amount received
        
        int rec = (int) (recF*100); //cast to int to save change
        
        int dollars, quarters, dimes, nickels, pennies;
        int change = rec-due; // change 
        //math conversions
        dollars = change /100;
        quarters = (change%100)/25;
        dimes = ((change%100)%25)/10;
        nickels = (((change%100)%25)%10)/5;
        pennies = (((change%100)%25)%10)%5;
        //print outputs
        System.out.printf("Amount Due: %.2f%n", dueF);
        System.out.printf("Amount Received: %.2f%n", recF);
        System.out.println();
        System.out.printf("Dollars: %d%n", dollars);
        System.out.printf("Quarters: %d%n", quarters);
        System.out.printf("Dimes: %d%n", dimes);
        System.out.printf("nickels: %d%n", nickels);
        System.out.printf("pennies: %d%n", pennies);
        
        
    }
  
}