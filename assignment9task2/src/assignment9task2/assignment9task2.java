
package assignment9task2;

/**
 *
 * @author Jack Daniel Kinne
 */
public class assignment9task2 {

    /**
     * multiplication table 1-9
     * @param args
     */
    public static void main(String[] args) {
        
        //variables
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int seven = 7;
        int eight = 8;
        int nine = 9;
        
                
        //initial two lines
        System.out.printf("     %-4d%-2d  %-2d  %-2d  %-2d  %-2d  %-2d  %-2d  %-2d%n", one, two, three, four, five, six, seven, eight, nine);
        System.out.println("---------------------------------------");
        
        //first for loop, setup x.
        for (int x= 1; x<10;x++) {
            
            //output inital part of line
            System.out.printf("%-2d|  " ,  x );
            
            //second for loop, setup y
            for (int y =1; y<10; y++){
                
                
                int ans = x*y;
                 
                //output nine multiplications, formatted.
                System.out.printf(  "%-2d  " ,  ans );
                
                
            }
         //jump to newline before repeating for loop
        System.out.println();
            
            
            
        }
        
        
    }
    
}
