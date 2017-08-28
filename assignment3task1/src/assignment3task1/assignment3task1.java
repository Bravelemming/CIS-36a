/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3task1;

/**
 *
 * @author Jack
 */
import java.util.Scanner;

public class assignment3task1 {

    public static void main(String[] args) {

        double MOONG = .17;
        double EARTHG = 1.00;
        double weight;
        double moonWeight;

        System.out.println("How much would you weigh on the moon?");
        System.out.println("Let's find out!  Input your weight:");
        
        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        
        if (weight > 0){moonWeight = weight * MOONG;
            System.out.print("You would weight " + moonWeight );
            System.out.println("...if you were on the moon!");
        
        
        }
        else {
            System.out.println("Your weight cannot be zero or negative. Re-enter.");
            
        }
    }
}