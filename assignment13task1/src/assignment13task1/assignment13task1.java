/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment13task1;

/**
 *
 * @author Jack
 */
public class assignment13task1 {

    
    public class vehicle {
        int passengers;
        int fuelCapacity;
        int mpg;
        
        void rangeOf (){
            int range = fuelCapacity * mpg;
        }
        
    }

    
    
    public void main(String[] args) {
        
        vehicle minivan = new vehicle();
        minivan.passengers = 7;
        minivan.fuelCapacity = 16;
        minivan.mpg = 500;
        
        
    }
    
}
