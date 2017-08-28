package finaltask2;
//Jack Daniel Kinne
class recursion {
    
    int recursion(int n){ // taking n from main
        System.out.println(n); // output n
        n++;       //iterate +1
        if (n==101){
            return 0; // end on 101
        }
        recursion(n); //recursive call
        return 0; // mandatory return line
    }    
}

public class finaltask2 {

    public static void main(String[] args) {
        int n = 89; // start from 'n'
        recursion freddie = new recursion();
        freddie.recursion(n); // begin madness
    }   
}//end
