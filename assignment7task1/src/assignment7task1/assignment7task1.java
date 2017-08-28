/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7task1;

import java.util.Scanner;

/**
 * @author "Jack" Daniel Kinne / Nina Orellana
 */
public class assignment7task1 {

    public static void main(String[] args) {
        System.out.println("Conversion of Kilometers to miles.  Input how many miles to list (1-100): ");  // grabs x from user
        Scanner scan = new Scanner(System.in);
        int xkilo = scan.nextInt();
        double kilo;
        int miles = 1;
        
        if (xkilo <=0 || xkilo >=101) {
            System.out.println("input not allowed.  please re run this application and enter a valid number.");
            System.exit(0);
         }
        
        System.out.println("Miles\tKilometers\n");
        
        for (int i=xkilo; i>0; i--){
            kilo = miles * 1.609;
            System.out.format("%d\t" + "%.3f\n", miles, kilo);
            
            if (miles % 5==0){  // print a blank line every fifth space
                System.out.println(" ");
            }
            
            miles++;            
        }
        
        
        /*
                PROCESS PUSEDOCODE:
        setup variables for miles, kilometers, input value x.
        use scanner to grab input.  check input to verify number.
        apply for loop to iterate x number of times.
        in for loop:
            modify output format per table.  align left and right.  precision to three decimals.
            output miles and kilometers, incrementing by 1 the kilometers
            include an if loop:
                if iteration is divisable by 5, print a blank line and use continue statement.
        
        */
        
    }
    
}
