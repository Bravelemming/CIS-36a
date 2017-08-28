/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4task2;

/**
 *
 * @author Jack
 */
import java.util.Scanner;

public class assignment4task2 {
  
  public static void main(String[] args){
    //task1
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
   
}

