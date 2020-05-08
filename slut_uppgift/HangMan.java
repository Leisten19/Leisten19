import sun.print.resources.serviceui;
import java.util.ArrayList;

public class HangMan {
	/*
	 * public static class GuessedLetter{ public char letter; public boolean
	 * has_been_guessed;
	 * 
	 * GuessedLetter(){ has_been_guessed = false; } }
	 */
	static int guess_count = 11;
	public static void main(String[] args) {

		java.util.Scanner bertil = new java.util.Scanner(System.in);
		printInstructionsV1();
		
		

		// hämta info från spelaren
		// GetInput();

		// kör spelet
		// Gissa på ett hemligt ord
		String secret_word = "hund";
		// Lista på alla bokstäver som finns att gissa på

		String guessed_letters = "";

		boolean game_is_running = true;

		

		while (game_is_running) {

			// Spelaren ska gissa på en bokstav
			String avlyssning = bertil.nextLine();
			guessed_letters = guessed_letters+avlyssning.charAt(0);
			// Om spelaren gissar rätt så skrivs det ut att det var rätt samt vilken bokstav
			// det var
			boolean gissat_correct = secret_word.contains(avlyssning) && !avlyssning.isEmpty();
			

			if (gissat_correct) {
				System.out.print("Rätt! " + "\n");
			}

			// Om spelaren gissar fel så skrivs det ut att det var fel samt vilken bokstav
			// det var + hur många försök kvar.
			else {
				guess_count = guess_count - 1;
				System.out.print("Fel! "  + "\n");
			}
			System.out.print("Du har " + guess_count + " gissningar kvar\n");

			// Man vinner spelet om man gissar rätt ord på sina försök

			// Man förlorar spelet om man inte klarar att gissa rätt ord på sina försök.
			game_is_running = printProgress(guessed_letters, secret_word); //Gör det möjligt att sluta loopen i gameisrunning
		}

		
//		avsluta   //String text = "Välkommen bla bla bla..."

	}
public static void printInstructionsV1() {
	System.out.println("Välkommen till hänga gubben v.1, Gissa på en bokstav tills du gissar rätt på det hemliga ordet!"); 
	System.out.println("Det är bara att börja med att gissa på en bokstav!\n");
	
}
	
public static void PrintMenu() {
		// Display welcome text.
		// visa instruktioner
		// visa menyknappar
		String text = "Välkommen till hänga gubbe, för att vinna ska du gissa rätt ord!\n"

				+ "Det finns tre olika nivåer: \n\n" + "Nivå 1- Gissa ett ord innehållande 5 bokstäver\n"
				+ "Nivå 2- Gissa ett ord innehållande 8 bokstäver\n"
				+ "Nivå 3- Gissa ett ord innehållande 10 bokstäver \n\n" // "\n" gör så att det blir en ny rad.
				+ "Välj en nivå genom att skriva 1,2 eller 3\n" + "Lycka till!\n";

		System.out.print(text);
	}

	public static void GetInput() {
		java.util.Scanner bertil = new java.util.Scanner(System.in);
		String avlyssning = bertil.nextLine(); // gör det möjligt så att man kan skriva in till konsolen
		System.out.print(avlyssning); // skriver ut vad du skrivit in till konsolen
	}

	public static boolean printProgress(String guessed_letters, String secret_word) {

		// Stega igenom det hemliga ordet och jämför med bokstäverna som spelaren har
		// gissat rätt på.
		String print_out_text = "";

		for (int i = 0; i < secret_word.length(); i++) {
			// Hämta bokstav från hemliga ordet på position i
			char letter = secret_word.charAt(i);
			boolean guessed_correctly = guessed_letters.contains(letter + "");
			// Skriv ut bokstaven om rätt annars ett underscore
			if (guessed_correctly) {
				print_out_text = print_out_text + letter;

			} else if (guessed_correctly == false) {
				print_out_text = print_out_text + "_";
			}
		}
		System.out.println(print_out_text);
		
		//Kollar om man har vunnit
		boolean take_the_win = secret_word.contentEquals(print_out_text);
	
		if(take_the_win) {
			System.out.println("Grattis! Du har vunnit!");
			return false; //Avslutar spelet
		}
		
		//Kollar om man har förlorat
		boolean take_the_lose = guess_count < 0;
		if(take_the_lose) {
			System.out.println("Take the mdfkn L");
			return false; //Avslutar spelet
		}
		return true; //skickar om spelet ska fortsätta, detta pga boolean
	}

}
