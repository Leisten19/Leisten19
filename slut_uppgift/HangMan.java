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
		
		

		// h�mta info fr�n spelaren
		// GetInput();

		// k�r spelet
		// Gissa p� ett hemligt ord
		String secret_word = "hund";
		// Lista p� alla bokst�ver som finns att gissa p�

		String guessed_letters = "";

		boolean game_is_running = true;

		

		while (game_is_running) {

			// Spelaren ska gissa p� en bokstav
			String avlyssning = bertil.nextLine();
			guessed_letters = guessed_letters+avlyssning.charAt(0);
			// Om spelaren gissar r�tt s� skrivs det ut att det var r�tt samt vilken bokstav
			// det var
			boolean gissat_correct = secret_word.contains(avlyssning) && !avlyssning.isEmpty();
			

			if (gissat_correct) {
				System.out.print("R�tt! " + "\n");
			}

			// Om spelaren gissar fel s� skrivs det ut att det var fel samt vilken bokstav
			// det var + hur m�nga f�rs�k kvar.
			else {
				guess_count = guess_count - 1;
				System.out.print("Fel! "  + "\n");
			}
			System.out.print("Du har " + guess_count + " gissningar kvar\n");

			// Man vinner spelet om man gissar r�tt ord p� sina f�rs�k

			// Man f�rlorar spelet om man inte klarar att gissa r�tt ord p� sina f�rs�k.
			game_is_running = printProgress(guessed_letters, secret_word); //G�r det m�jligt att sluta loopen i gameisrunning
		}

		
//		avsluta   //String text = "V�lkommen bla bla bla..."

	}
public static void printInstructionsV1() {
	System.out.println("V�lkommen till h�nga gubben v.1, Gissa p� en bokstav tills du gissar r�tt p� det hemliga ordet!"); 
	System.out.println("Det �r bara att b�rja med att gissa p� en bokstav!\n");
	
}
	
public static void PrintMenu() {
		// Display welcome text.
		// visa instruktioner
		// visa menyknappar
		String text = "V�lkommen till h�nga gubbe, f�r att vinna ska du gissa r�tt ord!\n"

				+ "Det finns tre olika niv�er: \n\n" + "Niv� 1- Gissa ett ord inneh�llande 5 bokst�ver\n"
				+ "Niv� 2- Gissa ett ord inneh�llande 8 bokst�ver\n"
				+ "Niv� 3- Gissa ett ord inneh�llande 10 bokst�ver \n\n" // "\n" g�r s� att det blir en ny rad.
				+ "V�lj en niv� genom att skriva 1,2 eller 3\n" + "Lycka till!\n";

		System.out.print(text);
	}

	public static void GetInput() {
		java.util.Scanner bertil = new java.util.Scanner(System.in);
		String avlyssning = bertil.nextLine(); // g�r det m�jligt s� att man kan skriva in till konsolen
		System.out.print(avlyssning); // skriver ut vad du skrivit in till konsolen
	}

	public static boolean printProgress(String guessed_letters, String secret_word) {

		// Stega igenom det hemliga ordet och j�mf�r med bokst�verna som spelaren har
		// gissat r�tt p�.
		String print_out_text = "";

		for (int i = 0; i < secret_word.length(); i++) {
			// H�mta bokstav fr�n hemliga ordet p� position i
			char letter = secret_word.charAt(i);
			boolean guessed_correctly = guessed_letters.contains(letter + "");
			// Skriv ut bokstaven om r�tt annars ett underscore
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
		
		//Kollar om man har f�rlorat
		boolean take_the_lose = guess_count < 0;
		if(take_the_lose) {
			System.out.println("Take the mdfkn L");
			return false; //Avslutar spelet
		}
		return true; //skickar om spelet ska forts�tta, detta pga boolean
	}

}
