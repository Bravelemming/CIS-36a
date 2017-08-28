package assignment16task1;
import java.util.Scanner;
//Jack Kinne CIS 36a
    class mass {
        public double height;
        public double weight;
        public double bmi;     
        public String result;     
        
        public void mass(){
            bmi =  (weight * 0.45) / ((height * 0.025) * (height * 0.025)) ; // bmi calc
            System.out.println("Your BMI is : " + bmi); //bmi output
            if (bmi > 0 && bmi < 16) result = "severe thinness"; // translation
            else if (bmi < 17.1) result = "moderate thinness";
            else if (bmi < 18.6) result = "mild thinness";
            else if (bmi < 26.1) result = "normal";
            else if (bmi < 30.1) result = "overweight";
            else if (bmi < 35.1) result = "obese class I";
            else if (bmi < 40.1) result = "obese class II";
            else if (bmi >= 40.1) result = "obese class III";
            else result = "Please enter a valid (positive) weight";   //error catching
            System.out.println("Your result is: " + result); // output
        }
        public void userh () {
            Scanner yeap = new Scanner(System.in);
            System.out.println("Please input height in inches:"); //user height in
            height = yeap.nextDouble();
        }
          public void userw () {
            Scanner yeap = new Scanner(System.in);
            System.out.println("Please input weight in pounds:"); //user weight in
            weight = yeap.nextDouble();
        }      
    }
    
public class assignment16task1 {
    public static void main(String[] args) {
        mass body = new mass(); // object is body
        body.userh(); // height user
        body.userw();  //  weight user
        body.mass(); // bmi output        
    }
}
