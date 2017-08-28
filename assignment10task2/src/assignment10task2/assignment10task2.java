package assignment10task2;

import java.util.Scanner;

/**
 *
 * @author Jack Kinne
 *  CIS 36A
 */
public class assignment10task2 {


    public static void main(String[] args) {
        //grab input from user for menu
        Scanner sc = new Scanner(System.in);        
        
        int option;
        
        do {
            System.out.println(
                "\n****************************************************"+
                "\n*  Main Menu:                                                 *"+
                "\n*    Enter # to run program or Quit                  *"+
                "\n*    1) Moon Weight Calculator                       *"+
                "\n*    2) Seconds conversion to mins and hours*"+
                "\n*    3) Grade Range                                        *"+
                "\n*    4) Quit                                                       *"+
                "\n****************************************************");

             option = sc.nextInt();
                    
                    switch (option){
                        case 1:
                            System.out.println("you selected option 1: running.");
                            moon();
                            break;
                            
                        case 2:
                            System.out.println("You selected option 2: running.");
                            time();
                            break;
                        case 3:
                            System.out.println("You selected option 3: running.");
                            grade();
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

static void moon() {
        // assignment 3 task 1
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

  static void time(){
    // assignment 4 task2
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

static void grade() {
        // assignment 5 task  1
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
//end program  
}
