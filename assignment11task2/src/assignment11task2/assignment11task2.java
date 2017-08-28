package assignment11task2;
// CIS 36a Jack Daniel Kinne
import java.lang.Math;
public class assignment11task2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // find the average of 10 double values
        
        double arr[]; // prototyping
        int size = 10; // size of array
        double combo = 0.0;
        arr = new double[size];
        
        for (int i = 0; i < size; i++){
            arr[i] = Math.random(); // arr with randoms
        }
                for (int i = 0; i < size; i++) {
            combo = arr[i] + combo; // aggregate
        }
        
        combo = (double) combo / size; // average 
        System.out.format("%.2f ...is the average of: %n", combo);
        for (int i = 0; i < size; i++){
            System.out.format(" %.2f , ", arr[i]);
        }
    }
    
}
