package assignment12task1;
import java.util.Scanner;
 /* cIS 36A
 * @author Jack Daniel Kinne */
public class assignment12task1 {

    public static void main(String[] args) {
        String check = userInput();
        int size = check.length() - 1;
      
        for (int x = 0, y = size; x<size; x++, y--){
            if (check.charAt(x) != check.charAt(y)) {
                System.out.println ("Not a palindrome!");
            return;
            }
        }
        System.out.println ("Yes; A palindrome!");            
    }
  
    static String userInput() {
        System.out.println ("Palindrome checker!");
        System.out.println ("please input a word to check:");
        Scanner jacks = new Scanner(System.in);
        String user = jacks.next();
    return user;
   }
    
}
