import java.util.Scanner;
public class tvaheltal {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int tal1 = 0;
		int tal2 = 0;
		
	    int lowest = 0;
	   
	    
	    System.out.println("Skriv tv� heltal");
		
		tal1 = input.nextInt(); 
		tal2 = input.nextInt();
		
		if (tal1 < tal2) {
			System.out.println("L�gsta talet" + tal1);
			
		}
		else {
			System.out.println("L�gsta talet:" + tal2);
		}
		

	}

}
