package assignment15task1;
import java.util.*;
//@author Jack
public class assignment15task1 {

    static class vehicle {
        static int range;
        static int fuelCap;
        static int mpg;
        static int passengers;
        
        static vehicle minivan = new vehicle();
        static vehicle hybrid = new vehicle();
        static vehicle sportsCar = new vehicle();       

        static void setmpg() {
            Scanner yeap = new Scanner(System.in);
            System.out.println("Please input Miles per Gallon.");
            mpg = yeap.nextInt();
        }
        static void setpass() {
            Scanner yeap = new Scanner(System.in);
            System.out.println("Please input Passenger Max.");
            passengers = yeap.nextInt();
        }                
        static void setrange() {
            Scanner yeap = new Scanner(System.in);
            System.out.println("Please input Fuel Capacity.");
            fuelCap = yeap.nextInt();
            range = fuelCap * mpg;
            System.out.println("Range of vehicle; " + range);
        }
   
        static void minivan() {
            Scanner sc = new Scanner(System.in);        
                    int option;
                    do {
                        System.out.println(
                            "\n*********************************************"+
                            "\n*  Main Menu:                                       *"+
                            "\n*    Enter # to run program or Quit        *"+
                            "\n*    1) Enter Passenger Max                 *"+
                            "\n*    2) Enter Miles per Gallon                *"+
                            "\n*    3) Calculate Range                         *"+
                            "\n*    4) Return to Main Menu                  *"+
                            "\n*********************************************");
                         option = sc.nextInt();
                                switch (option){
                                    case 1:
                                        System.out.println("Option 1: Enter Passenger Max:");
                                        minivan.setpass();                                        
                                        break;
                                    case 2:
                                        System.out.println("Option 2: Enter miles per gallon:");
                                        minivan.setmpg();
                                        break;
                                    case 3:
                                        System.out.println("Option 3: Range:");
                                        minivan.setrange();
                                        break;
                                    case 4:
                                        System.out.println("Exiting.");
                                        break;
                                    default:
                                        System.out.println("not an option.  reselect.");
                                        break;
                                }
                    } while (option !=4);            
       


        }
        
        static void hybrid() {
            Scanner sc = new Scanner(System.in);        
                    int option;
                    do {
                        System.out.println(
                            "\n*********************************************"+
                            "\n*  Main Menu:                                       *"+
                            "\n*    Enter # to run program or Quit        *"+
                            "\n*    1) Enter Passenger Max                 *"+
                            "\n*    2) Enter Miles per Gallon                *"+
                            "\n*    3) Calculate Range                         *"+
                            "\n*    4) Return to Main Menu                  *"+
                            "\n*********************************************");
                         option = sc.nextInt();
                                switch (option){
                                    case 1:
                                        System.out.println("Option 1: Enter Passenger Max:");
                                        hybrid.setpass();                                        
                                        break;
                                    case 2:
                                        System.out.println("Option 2: Enter miles per gallon:");
                                        hybrid.setmpg();
                                        break;
                                    case 3:
                                        System.out.println("Option 3: Range:");
                                        hybrid.setrange();
                                        break;
                                    case 4:
                                        System.out.println("Exiting.");
                                        break;
                                    default:
                                        System.out.println("not an option.  reselect.");
                                        break;
                                }
                    } while (option !=4);            

        }        

        static void sportsCar() {
            Scanner sc = new Scanner(System.in);        
                    int option;
                    do {
                        System.out.println(
                            "\n*********************************************"+
                            "\n*  Main Menu:                                       *"+
                            "\n*    Enter # to run program or Quit        *"+
                            "\n*    1) Enter Passenger Max                 *"+
                            "\n*    2) Enter Miles per Gallon                *"+
                            "\n*    3) Calculate Range                         *"+
                            "\n*    4) Return to Main Menu                  *"+
                            "\n*********************************************");
                         option = sc.nextInt();
                                switch (option){
                                    case 1:
                                        System.out.println("Option 1: Enter Passenger Max:");
                                        sportsCar.setpass();                                        
                                        break;
                                    case 2:
                                        System.out.println("Option 2: Enter miles per gallon:");
                                        sportsCar.setmpg();
                                        break;
                                    case 3:
                                        System.out.println("Option 3: Range:");
                                        sportsCar.setrange();
                                        break;
                                    case 4:
                                        System.out.println("Exiting.");
                                        break;
                                    default:
                                        System.out.println("not an option.  reselect.");
                                        break;
                                }
                    } while (option !=4);             
            
        }       
        
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        
        int option;
        
        do {
            System.out.println(
                "\n*********************************************"+
                "\n*  Main Menu:                                             *"+
                "\n*    Enter # to run program or Quit            *"+
                "\n*    1) Minivan                                             *"+
                "\n*    2) Hybrid                                               *"+
                "\n*    3) Sports Car                                       *"+
                "\n*    4) Quit                                                  *"+
                "\n*********************************************");

             option = sc.nextInt();
                    
                    switch (option){
                        case 1:
                            System.out.println("you selected option 1: Minivan.");
                            vehicle.minivan();
                            break;
                            
                        case 2:
                            System.out.println("You selected option 2: Hybrid.");
                            vehicle.hybrid();
                            break;
                        case 3:
                            System.out.println("You selected option 3: Sports Car.");
                            vehicle.sportsCar();
                            break;
                        case 4:
                            System.out.println("Exiting.");
                            break;
                        default:
                            System.out.println("not an option.  reselect.");
                            break;
                    }
        
        } while (option !=4);
        
        
    }
    
}
