import java.util.Scanner;

package talspelet;

public class talspelet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int secretnumber = 58;
		int guess = 0;
		int guessCount = 0;
		int guessLimit = 5;
		boolean outOfGuesses = false;
				
		while(guess != secretnumber && !outOfGuesses) {
		    //d09magli 
			//!guess.equals(secretnumber) blir den sur p� f�r att den tycker att man inte f�r lov att anv�nda .equals() f�r att j�mf�ra heltal.
			//!guess == secretnumber blir den sur p� f�r att den inte vill f�rst g�ra guess.equals(secretnumber) och sen g�ra ! p� resultatet.
			//Den �r sur och vill att man ska anv�nda !=.
			if(guessCount < guessLimit){
				System.out.println("Enter a guess: ");
			     guess = input.hasNextLine();
	             guessCount++;
			} else {
				outOfGuesses = true;
			}
				
	}
		if(outOfGuesses) {
			System.out.println("You lose!");
		} else {
		    System.out.println("You win!");
		}

		
			
		}
