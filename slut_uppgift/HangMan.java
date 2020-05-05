import sun.print.resources.serviceui;

public class HangMan{

	public static class GuessedLetter{
		public char letter;
		public boolean has_been_guessed;
		
		GuessedLetter(){
			has_been_guessed = false;
		}
	}
	
	public static void main(String[] args) {
		
		GuessedLetter blala = new GuessedLetter();
		
		PrintMenu();
		
		//hämta info från spelaren
		GetInput();
		
		
		//kör spelet
		//Gissa på ett hemligt ord
	    String secret_word = "hund";
	    //Lista på alla bokstäver som finns att gissa på
	    
		
		
//		avsluta   //String text = "Välkommen bla bla bla..."
		
			
	}
	public static void PrintMenu()
	{
		//Display welcome text.
		//visa instruktioner
		//visa menyknappar
		String text = "Välkommen till hänga gubbe, för att vinna ska du gissa rätt ord!\n"
				
				+ "Det finns tre olika nivåer: \n\n"
				+ "Nivå 1- Gissa ett ord innehållande 5 bokstäver\n"
				+ "Nivå 2- Gissa ett ord innehållande 8 bokstäver\n"
				+ "Nivå 3- Gissa ett ord innehållande 10 bokstäver \n\n" //"\n" gör så att det blir en ny rad.
		        + "Välj en nivå genom att skriva 1,2 eller 3\n"
		        + "Lycka till!\n";
		
		System.out.print(text);
	}
	
	public static void GetInput()
	{
		java.util.Scanner bertil = new java.util.Scanner (System.in); 
		String avlyssning = bertil.nextLine(); //gör det möjligt så att man kan skriva in till konsolen
		System.out.print(avlyssning); //skriver ut vad du skrivit in till konsolen
	}
	
	
	
	
	


}
