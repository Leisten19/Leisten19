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
				
		while(!guess.equals(secretnumber) && !outOfGuesses) {
		     
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
    
    

