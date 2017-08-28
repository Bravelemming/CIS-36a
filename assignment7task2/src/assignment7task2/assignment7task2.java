/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7task2;

/**
 * @author Nina Orellana/ Jack Daniel Kinne
 */
public class assignment7task2 {

   
    public static void main(String[] args) {
        int x = 1;
        int xSquared;
     
        for (int i = 1; i<=20; i++){
            xSquared = x * x;
            System.out.println(x+" squared = "+ xSquared);
            if (x %5==0){
                System.out.println();
            } 
            x++;
        }
    }
    
}


/*

PROCESS PUSEDOCODE:
set up variables for x, xsquared, 
set up for loop:
    x times x equals our xsqaured variable.  increment x by one.
    setup if loop:
        check for five lines, output empty line (modulus)

*/