package assignment9task3;

/**
 * CIS 36 A
 * @author Jack Daniel Kinne
 */
public class assignment9task3 {


    public static void main(String[] args) {
        //switch between a and b for the "FOR WHILE" and "FOR FOR" versions.
        task3a();
        //task3b();
    }
       
    //FOR WHILE version
    public static void task3a(){    
        //star will be output for A, B, and C.
        String star = "*";
        
        System.out.println("A.");
        
        for (int x=5; x>0; x--) {
            
            int a = 0;
            while (a<x) { 
                System.out.print(star);
                a++; //output stars 5, 4, 3, 2,  1, exit
            }
      
         System.out.println();
         }
        
         System.out.println();
            
          System.out.print("B.");
          int count = 5;
          int b = 4;

          for (; count>=0; count--, b--){

              int echo = count;
              int bEcho=b;
              
              while (echo>0){
                  System.out.print(" ");
                  echo--;  // output spaces 4, 3, 2, 1, exit
              }
              
              
              while (bEcho<4) {
                  System.out.print( star );
                  bEcho++;  // output stars 1, 2, 3, 4, 5, exit
              }
                        
              System.out.println();
          }
          
          System.out.println();
            
        System.out.println("C.");
        //variables pulled outside of for loop to preserve values
        int c= 10;
        
        for (; c>=0; c = c-2) {
        //c will be 10, 8, 6, 4, 2, 0, exit.

         int a = 0; // control variable for stars
         
         // switch statement to handle spacing formatting.
         switch (c) {
             case 8: System.out.print(" ");
                          break;
             case 6: System.out.print("  ");
                          break;
             case 4: System.out.print("   ");
                          break;
             case 2: System.out.print("    ");
                          break;
         }
         
         while (a<c) { 
                System.out.print(star);
                a++; //print stars of 10, 8, 6, 4, 2 exit
         }
            
         System.out.println();
         }        

    }
    
    //FOR FOR version
    
    public static void task3b(){    
        //star will be output for A, B, and C.
        String star = "*";
        
        System.out.println("A.");
        
        for (int x=5; x>0; x--) {
            

            for (int a = 0; a<x; a++ ) { 
                System.out.print(star);
                //output stars 5, 4, 3, 2,  1, exit
            }
      
         System.out.println();
         }
        
         System.out.println();
            
          System.out.print("B.");
          int count = 5;
          int b = 4;

          for (; count>=0; count--, b--){


              int bEcho=b;
              
              for (int echo = count;echo>0;echo--){
                  System.out.print(" ");
                  // output spaces 4, 3, 2, 1, exit
              }
              
              
              for (;bEcho<4;bEcho++) {
                  System.out.print( star );
                  // output stars 1, 2, 3, 4, 5, exit
              }
                        
              System.out.println();
          }
          
          System.out.println();
            
        System.out.println("C.");
        //variables pulled outside of for loop to preserve values
        int c= 10;
        
        for (; c>=0; c = c-2) {
        //c will be 10, 8, 6, 4, 2, 0, exit.

         int a = 0; // control variable for stars
         
         // switch statement to handle spacing formatting.
         switch (c) {
             case 8: System.out.print(" ");
                          break;
             case 6: System.out.print("  ");
                          break;
             case 4: System.out.print("   ");
                          break;
             case 2: System.out.print("    ");
                          break;
         }
         
         for (;a<c;a++) { 
                System.out.print(star);
                //print stars of 10, 8, 6, 4, 2 exit
         }
            
         System.out.println();
         }        

    }     



}
