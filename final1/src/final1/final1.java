package final1;
 //@author Jack Daniel Kinne, CIS 36a
// Life is random ; a program that uses census data to predict the course of a life!
 class die { 
    int roll () {        
        int result = randomsWithRange(1, 100);
        return result; //return a d100 dice roll.  
    }    
    int randomsWithRange(int min, int max) {
            int range = (max - min) + 1;
            return (int)(Math.random() * range) + min;
     }
}

class life {
    die chaos = new die(); // d100 is 'chaos' object
    
    int roll(){
        int result = chaos.roll(); //chaos is stored in result
        return result;
    }
        
    boolean death = false; // trigger for game end
    boolean win = false; // trigger for win
    boolean stillbirth = false;
    boolean genetic = false;
    boolean divorced = false;
    boolean married = false;
    boolean parent = false;
    boolean career = false;
    boolean homeowner = false;
    boolean college = false;
    boolean poor, medium, rich;  // original modifying values
    boolean firstWorld, secondWorld, thirdWorld; // original modiying values
    int injuryCount=0;  //start counts at zero
    int traumaCount=0;
    int childCount=0;
    String nationBy;
    
    // percents to pass roll argument values to help modify percentages
    int accidentChance, traumaChance, geneticChance, deathChance;
    int highschoolChance, collegeChance, careerChance, marriedChance, divorcedChance; 
    int homeownerChance, parentChance, criminalChance, novelistChance;
    boolean accident, trauma, highschool; 
    boolean criminal, novelist;
    
    //strings for table rolls for silly descriptions
    String deathBy, accidentBy, traumaBy, geneticBy, careerBy, collegeBy, novelBy;
    
    void welcome(){ //welcome message
        System.out.println("Welcome to the Game of Life!");
        System.out.println("All Percentages are true values, taken from Census Data.");
        System.out.println("....How long will you survive?");
    }
    
    void life(){
        int x = 0;// age
        
        accidentChance = 0;
        traumaChance = 4; // source: national institute of mental health
        geneticChance = 4; // source: consumer health information
        deathChance = 0;
        highschoolChance = 0;
        collegeChance = 0;
        marriedChance = 7; // source; CDC
        divorcedChance = 4; // source; CDC
        parentChance = 0; // source; CIA.  values broken by country below
        homeownerChance = 4;// source: freddiemac Finance

        welcome(); // welcome message
        start(); // beginning values, stillbirth, country.       
        
        do {        
            deathChance =  ((x *2)/16); // source: NPR's Robert Krulwich, Death.
            
            if (x<12){
                accidentChance = 10; //source: CDC public health records
            }
            else if (x<18){
                accidentChance = 20;
            }
            else if (x<45){
                accidentChance = 11;
            }
            else if (x<65){
                accidentChance = 12;
            }
            else if (x<75){
                accidentChance = 14;
            }
            else {
                accidentChance = 21;
            }
             
            if (x < 18){
                accident();
                trauma();
                if (genetic == false) genetic();
                death();
            }
            else if (x==18){
                highschool();
                accident();
                trauma();
                death();
            }
            else if (x < 35){
                accident();
                trauma();
                death();
                if (career == false) career(); // only one career
                if (highschool == true) college(); // can only attend college with highschool diploma.
                if (married == false) married(); // can only be married once. 
                parent();
                if (married == true && divorced == false) divorced(); // can only be divorced if married and not already divorced
                if (career == true && homeowner == false) homeowner(); // must have career, only one house!
                //criminal();
                //novelist();
            }
            else if (x < 50){
                accident();
                death();
                trauma();
                if (career == false) career();
                if (married == false) married();
                parent();
                if (married == true && divorced == false) divorced();
                if (career == true && homeowner == false) homeowner();
                //criminal();
                //novelist();
            }
            else if (x < 80){
                accident();
                death();
                trauma();
                if (married == true && divorced == false) divorced();
                //criminal();
                //novelist();
            }
            else if (x <100){
                accident();
                death();
                trauma();
                //novelist();
            }
            else { //win condition at age 100!
                System.out.println("Wow!  Congratulations, you made it to 100!");
                System.out.println("Your personality was uploaded to an A.I.!");
                System.out.println("PLAYER ONE WiNS.");
                win = true;
                //STATS
                if (accident == true) System.out.println("Number of Accidents: " + injuryCount);
                if (trauma == true) System.out.println("Number of Traumas: " + traumaCount); 
                if (highschool == true) System.out.println("You graduated from Highschool!");
                if (college == true) System.out.println("You graduated from College!");
                if (genetic == true) System.out.println("Genetic condition: " + geneticBy);
                if (married == true) System.out.println("You Married!");
                if (divorced == true) System.out.print("...and then divorced.");
                if (parent == true) System.out.println("You had: " + childCount + " kids.");
                if (homeowner == true) System.out.println("You owned your own house!");
                System.exit(0);
            }
            
            System.out.println("Age: " + x);
            
            x++;
        } while (death == !true); // ends life on boolean death = true.
        
        if (death == true){ //die condition
            System.out.println("Welp, you're dead.  but it was a good run.  Stats below!");
            //STATS
            if (accident == true) System.out.println("Number of Accidents: " + injuryCount);
            if (trauma == true) System.out.println("Number of Traumas: " + traumaCount); 
            if (highschool == true) System.out.println("You graduated from Highschool!");
            if (college == true) System.out.println("You graduated from College!");
            if (genetic == true) System.out.println("Genetic condition: " + geneticBy);
            if (married == true) System.out.println("You Married!");
            if (divorced == true) System.out.print("...and then divorced.");
            if (parent == true) System.out.println("You had: " + childCount + " kids.");
            if (homeowner == true) System.out.println("You owned your own house!");
            
            System.exit(0);
        //TODO: Possible new constructor in main IF they have children and want to continue.
        }
    }
    
    void start(){
        System.out.println("GAME, START:");
        System.out.println("YOU ARE CONCEIVED...");
        System.out.println("...But where were you born, and who were your parents?");
        //set starting conditions and values
        if (chaos.roll() <  50) {
            thirdWorld = true;
            nationBy = "Third World Country.  (50% chance.)";  // third world country
            if (chaos.roll() <= 4) {
                stillbirth = true;
                death = true;
            }
            if (chaos.roll() < 54) {
                poor = true;
                System.out.println("You are poor and living in Africa.");
            }
            else if (chaos.roll() < 94){
                medium = true;
                System.out.println("You are from a medium income household in Mexico.");
            }
            else {
                rich = true;
                System.out.println("You are from a rich household in Tangier.");
            }            
            highschoolChance = 45;
            collegeChance=15;
            parentChance=6;
        }
        else if (chaos.roll() < 80) {
            secondWorld = true;
            nationBy = "Second World Country.   (30% chance.)"; // second world
                if (chaos.roll() <= 2) {
                    stillbirth = true;
                    death = true;
                 }
             if (chaos.roll() < 31) {
                poor = true;
                System.out.println("You are poor and living in Serbia.");
            }
            else if (chaos.roll() < 81){
                medium = true;
                System.out.println("You are from a medium income household in India.");
            }
            else {
                rich = true;
                System.out.println("You are from a rich household and live in Tibet.");
            }               
            highschoolChance = 70;
            collegeChance=20;
            parentChance=4;
        }
        else {
            firstWorld = true;
            nationBy = "First World Country.  Ohhhh, fancy!  (20% chance.)"; // first world
            if (chaos.roll() <= 1) {
                stillbirth = true;
                death = true;
            }

            if (chaos.roll() < 34) {
                poor = true;
                System.out.println("You are poor and living in Florida.");
            }
            else if (chaos.roll() < 68){
                medium = true;
                System.out.println("You are from a medium income household in Suburbia.");
            }
            else {
                rich = true;
                System.out.println("You are from a rich household and live in Orinda.");
            }
            highschoolChance = 85;
            collegeChance=43;
            parentChance=2;            
        }
        
        System.out.printf("You are in a %s %n", nationBy);
        
        if (stillbirth == true) {
            System.out.println("Congratulations!  You were born as a stillbirth!  (GAME OVER).");
            System.exit(0);
        }
       
    }
    
    void accident(){
        if (chaos.roll() <=  accidentChance){
            accident = true;
            injuryCount+=1;
            if (chaos.roll() <  23) {
                accidentBy = "Car Accident, their fault.";
            }
            else if (chaos.roll()< 45) {
                accidentBy = "car accident, YOUR fault.";
            }
            else if (chaos.roll()< 51) {
                accidentBy = "stuck your hand in the wrong thing.";
            }
            else if (chaos.roll()< 56) {
                accidentBy = "walked through the wrong neighborhood.";
            }     
            else if (chaos.roll()< 61) {
                accidentBy = "Mauled by a bear.";
            }
            else if (chaos.roll()< 65) {
                accidentBy = "freak bicycle accident.";
            }
            else if (chaos.roll()< 68) {
                accidentBy = "Ignored safety sign.";
            }
             else if (chaos.roll()< 70) {
                accidentBy = "Jumped into the pool without a lifegaurd.";
            }
            else if (chaos.roll()< 72) {
                accidentBy = "Showing off for a girl.";
            }
            else if (chaos.roll()< 74) {
                accidentBy = "Fell off a ladder.";
            }      
            else {
                accidentBy = "Ran with a sharp object in your hand.";
            }        
            System.out.println("You were in an accident! Cause: " + accidentBy);


        }        
    }
    
    void trauma(){
        if (chaos.roll() <=  traumaChance){
            trauma = true;
            traumaCount+=1;
            if (chaos.roll()<33){
                traumaBy = "Anxiety and Depression.";
            }
            else if (chaos.roll()<43){
                traumaBy = "Psychosis!";
            }
            else if (chaos.roll()<53){
                traumaBy = "Post Traumatic Stress Disorder";
            }            
            else if (chaos.roll()<73){
                traumaBy = "Antisocial and borderline personality disorder.  Fun!";
            }             
            else if (chaos.roll()<83){
                traumaBy = "Eating Disorder.";
            } 
            else {
                traumaBy = "Addict!  misuse and dependence.";
            }             
         System.out.println("You developed a new trauma!: " + traumaBy);   
        }    
    }
    
    void genetic(){
         if (chaos.roll() <=  geneticChance){
            genetic = true;
            
            if (chaos.roll() <  23) {
                geneticBy = "cystic fibrosis";
            }            
            else if (chaos.roll()< 45) {
                geneticBy = "sickle cell anemia";
            }
             else if (chaos.roll()< 65) {
                geneticBy = "down syndrome";
            } 
            else if (chaos.roll()< 75) {
                geneticBy = "Spina bifida";
            }
            else if (chaos.roll()< 85) {
                geneticBy = "sickle cell anemia";
            }  
            else {
                geneticBy = "arthritis";
            }
        System.out.println("You were born with a genetic condition: " + geneticBy); 
         }
    }
    
    void death(){
        if (chaos.roll() <=  deathChance){
            death = true;
        
        
        if (chaos.roll() <  23) {
            deathBy = "heart disease";
        }
        else if (chaos.roll()< 45) {
            deathBy = "cancer";
        }
        else if (chaos.roll()< 51) {
            deathBy = "chronic lower respiratory disease";
        }
        else if (chaos.roll()< 56) {
            deathBy = "stepped in front of a buss with your cell phone in your ear.";
        }     
        else if (chaos.roll()< 61) {
            deathBy = "Massive Stroke.  Everything smells like toast!";
        }
        else if (chaos.roll()< 65) {
            deathBy = "Alzheimer's Disease";
        }
        else if (chaos.roll()< 68) {
            deathBy = "Diabetes.";
        }
         else if (chaos.roll()< 70) {
            deathBy = "Pneumonia.";
        }
        else if (chaos.roll()< 72) {
            deathBy = "Kidney failure.";
        }
        else if (chaos.roll()< 74) {
            deathBy = "suicide, or at least the cops think so.";
        }      
        else {
            deathBy = "Just a random, silly thing.  You swallowed a bee.  Also, you're allergic.";
        }        
        System.out.println("Oh my god!  You died!  Your death was caused by: " + deathBy);
        } 
    }
    
    void highschool(){
        if (chaos.roll() <=  highschoolChance){
            highschool = true;
            System.out.println("You graduated highschool! ");
        }
        else System.out.println("Highschool dropout.");        
    }
    
    void college(){
        if (chaos.roll() <=  collegeChance){
            college = true;
            System.out.println("You graduated COLLEGE! Also, liberal arts was a bad decision.");
        }        
    }
    
    void career(){
        if (chaos.roll() <=  careerChance){
            career = true;
            System.out.println("You've risen high in a corporation.  Enjoy your new career!"); 
        }    
    }
    
    void married(){
        if (chaos.roll() <=  marriedChance){
            married = true;
            System.out.println("You got married! ");
        }
    }
    
    void parent(){
        if (chaos.roll() <=  parentChance){
            System.out.println("You're a parent! ");
            if (parent == true) System.out.print("...again!");
            childCount+=1;
            parent = true;
        }
    }
    
    void divorced(){
        if (chaos.roll() <=  divorcedChance){
            divorced = true;
            System.out.println("Welp, you got divorced.  It happens.");
        }
    }
    
    void homeowner(){
        if (chaos.roll() <=  homeownerChance){
            homeowner = true;
            System.out.println("You bought a house!");
        }
    }
  /*  
    void criminal(){
        
    }
    
    void novelist(){
        
    }
  */
}// end class life

// BEGIN MAIN PROGRAM
public class final1 {

    public static void main(String[] args) {
        
        life pc = new life(); // first life, can make more!  keep values for final score.
        
        pc.life(); //execute main program

    }
}