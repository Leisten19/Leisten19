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
		
		//h�mta info fr�n spelaren
		GetInput();
		
		
		//k�r spelet
		//Gissa p� ett hemligt ord
	    String secret_word = "hund";
	    //Lista p� alla bokst�ver som finns att gissa p�
	    
		
		
//		avsluta   //String text = "V�lkommen bla bla bla..."
		
			
	}
	public static void PrintMenu()
	{
		//Display welcome text.
		//visa instruktioner
		//visa menyknappar
		String text = "V�lkommen till h�nga gubbe, f�r att vinna ska du gissa r�tt ord!\n"
				
				+ "Det finns tre olika niv�er: \n\n"
				+ "Niv� 1- Gissa ett ord inneh�llande 5 bokst�ver\n"
				+ "Niv� 2- Gissa ett ord inneh�llande 8 bokst�ver\n"
				+ "Niv� 3- Gissa ett ord inneh�llande 10 bokst�ver \n\n" //"\n" g�r s� att det blir en ny rad.
		        + "V�lj en niv� genom att skriva 1,2 eller 3\n"
		        + "Lycka till!\n";
		
		System.out.print(text);
	}
	
	public static void GetInput()
	{
		java.util.Scanner bertil = new java.util.Scanner (System.in); 
		String avlyssning = bertil.nextLine(); //g�r det m�jligt s� att man kan skriva in till konsolen
		System.out.print(avlyssning); //skriver ut vad du skrivit in till konsolen
	}
	
	
	
	
	


}
