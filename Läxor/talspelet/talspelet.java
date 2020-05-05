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
			//!guess.equals(secretnumber) blir den sur på för att den tycker att man inte får lov att använda .equals() för att jämföra heltal.
			//!guess == secretnumber blir den sur på för att den inte vill först göra guess.equals(secretnumber) och sen göra ! på resultatet.
			//Den är sur och vill att man ska använda !=.
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
