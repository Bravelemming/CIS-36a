package assignment11task1;
// cIS 36A
// @author Jack Daniel Kinne
public class assignment11task1 {   
    // Double Array of 12 values.
    // @param args
    public static void main(String[] args) {
        //prototyping array arr
        double arr[];
      
        int size = 12; //size of array
        double i = 1.0; // counter for values
        arr = new double[size]; // array
      
        for (int x = 0; x < size; x++){
            arr[x] = i; // assign values from 1.0 to 12.0
            i++; // counter
        }
      
        System.out.println (arr[1]);
        System.out.println (arr[11]);
          
    }
  
  
}