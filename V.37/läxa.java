
import java.util.Scanner;

public class läxa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); // behövs om man vill ha input
		
		String namn1 = "David Leisten";
        String namn2 = "Johan Simonsen";
        String namn3 = "Kalle Favoryt";
      
        System.out.println("Skriv ett namn");
        
        String namn4 = input.nextLine(); // läser in ett namn från konsolen
       
        System.out.println("Skriv ett namn");
        
        String namn5 = input.nextLine();
        
        System.out.println("\n\tNAmn:");
	
	    System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "\n" + namn5 + "\n");
	    
	}

}
