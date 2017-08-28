/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5task1;

import java.util.Scanner;
/**
 *
 * @author Jack
 */
public class assignment5task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("input your grade points");
        Scanner scan = new Scanner (System.in);
        int grades = scan.nextInt();
        
        char letterGrade;
        
        if (grades > 0 && grades <= 59){
            letterGrade = 'F';
            System.out.println("try harder.");
            System.out.println(letterGrade);
        }
        else if (grades > 59 && grades <70){
            letterGrade = 'D';
            System.out.println("try harder.");
            System.out.println(letterGrade);
        }
        else if (grades >=70 && grades <80){
            letterGrade = 'C';
            System.out.println("ok");
            System.out.println(letterGrade);
        }
        else if (grades >=80 && grades <90){
            letterGrade = 'B';
            System.out.println("good");
            System.out.println(letterGrade);
        }
        else if (grades >90 && grades <101) {
            letterGrade = 'A';
            System.out.println("excellent.");
            System.out.println(letterGrade);
        }
        else {
            System.out.println("Please input a valid integer for your grade.");
        }
        
    }
    
}
