
//imports
import java.util.Scanner;

//class BizzBuzz
public class BizzBuzz {
	
	/*This method determines if a number is a bizz, a buzz or a bizzbuzz.
	 * If a number is divisible by 3 it returns a Bizz, if a number is divisible
	 * by 5 it outputs a Buzz and if a number is divisible by both numbers (3 and 5)
	 * it outputs a BizzBuzz. Cases where a number is not a Bizz or a Buzz or a BizzBuzz
	 * it outputs the number itself.*/
	private static void bizzBuzzDeterminant(int limitNumber) {
		/*set variables to hold the number of Bizz,Buzz or BizzBuzz.
		 Initial values is zero*/
		    int numberOfbizzes = 0;
	        int numberOfbuzzes = 0;
	        int numberOfbizzbuzzes= 0;
	        
	        /*iterate through the numbers less or equal to the set number
	         * if number is divisible by 3 and not divisible by 5, then the 
	         * number is a Bizz. If the number is divisible by 5 and not divisible 
	         * by 3, then the number is a Buzz. If the number is divisible by both
	         * then it is a BizzBuzz. The count of bizzbuzzes,bizzes and buzzes is 
	         * stored int the above declared variables.*/
	        for (int num = 1; num <= limitNumber; num++) {
	            if ((num % 3 == 0) && (num % 5 != 0)) {
	                System.out.println("Bizz");
	                numberOfbizzes ++;
	            } else if ((num % 5 == 0) && (num % 3 != 0)){
	                System.out.println("Buzz");
	                numberOfbuzzes ++;
	            } else if ((num % 3 == 0) && (num % 5 == 0)){
	                System.out.println("BizzBuzz");
	                numberOfbizzbuzzes ++;
	            } else{
	                System.out.println(num);
	            }
	        }
	        //end for
	        
	        //print out Bizzes
	        System.out.println("The number of Bizzes was " + numberOfbizzes);
	        //print Buzzes
	        System.out.println("The number of Buzzes was " + numberOfbuzzes);
	        //print BizzBuzzes
	        System.out.println("The number of BizzeBuzzes was " + numberOfbizzbuzzes);
	        //end
	        System.out.println("\nThank you for playing BizzBuzz with me.");
		
	}

	  /**
     * @param args the command line arguments
     */
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 //show welcome message
		 System.out.println("Welcome to BizzBuzz game. This program will be used to play BizzBuzz"
	                + "The game is made up of multiple players\nseated in a circle. The first player mentions a "
	                + "one and the next player picks on. The game is played upto\na specific number of times "
	                + "and if a player hesitates to give a number,they forfeit the game or are served\na penalty. "
	                + "If any given number is divisible by 3 it becomes a bizz, divisible by 5 it becomes a buzz"
	                + "and if\nit's divisible by both 3 and 5 it becomes a bizzbuzz. Let's play!");
		
		 //prompt the user to enter a number
	        System.out.print("\n\n\nTo Continue, Enter a positive number upto which you want the game to be played:");
	        int limitNumber = input.nextInt();
	        //validate the entered number
	        if (limitNumber < 0) {
	            throw new IllegalArgumentException("The given number must be positive");
	        }
	        
	        input.nextLine();
	        //call the method to process the entered number
	        bizzBuzzDeterminant(limitNumber);

	}//end main

}

//end
