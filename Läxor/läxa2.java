import java.util.Scanner;

public class läxa2 {

	public static void main(String[] args) {


Scanner input = new Scanner(System.in);

      int tal1 = 0; // Detta är fem heltal som kommer läggas in i beräkningen
      int tal2 = 0;
      int tal3 = 0;
      int tal4 = 0;
      int tal5 = 0;
      
      int highest = 0;
      int lowest = 0;
      double mean;
		
		System.out.println("Skriv fem heltal");
		
		tal1 = input.nextInt(); // Här så får man skriva in fem egna heltal
		tal2 = input.nextInt();
		tal3 = input.nextInt();
		tal4 = input.nextInt();
		tal5 = input.nextInt();
		

		if (tal1 >=tal2 && tal1 >=tal3 && tal1 >=tal4 && tal1 >=tal5) { // Här så räknar datorn ut om tal1 är större en de andra
			System.out.println("Highest Number: "+tal1);
	    }

		if (tal2 >=tal1 && tal2 >=tal3 && tal2 >=tal4 && tal2 >=tal5) {
			System.out.println("Highest Number "+tal2);
			
		}
		
		if (tal3 >=tal1 && tal3 >=tal2 && tal3 >=tal4 && tal3 >=tal5) {
		    System.out.println("Highest Number "+tal3);
		
		}
		
		if (tal4 >=tal1 && tal4 >=tal2 && tal4 >=tal3 && tal4 >=tal5) {
			System.out.println("Highest Number "+tal4);
		
		}
		
		if (tal5 >=tal1 && tal5	>=tal2 && tal5 >=tal3 && tal5 >=tal4) {
			System.out.println("Highest Number "+tal5);
		
	}
		

		if (tal1 <=tal2 && tal1 <=tal3 && tal1 <=tal4 && tal1 <=tal5) { // Här räknar datorn ut om tal1 är större än de andra talen
			System.out.println("Lowest Number: "+tal1);
		}
		
		if (tal2 <=tal1 && tal2 <=tal3 && tal2 <=tal4 && tal2 <=tal5) {
			System.out.println("Lowest Number: "+tal2);
		}
		
		if (tal3 <=tal1 && tal3 <=tal2 && tal3 <=tal4 && tal3 <=tal5) {
			System.out.println("Lowest Number: "+tal3);
		}
		
		if (tal4 <=tal1 && tal4 <=tal2 && tal4 <=tal3 && tal4 <=tal5) {
			System.out.println("Lowest Number: "+tal4);
		}
		
		if (tal5 <=tal1 && tal5 <=tal2 && tal5 <=tal3 && tal5 <=tal4) {
			System.out.println("Lowest Number: "+tal5);
		}
		
		
		
		mean = (tal1 + tal2 + tal3 + tal4 + tal5) / 5.0; // Här så delar datorn alla heltal på fem
		System.out.println("mean value is " + mean);
		
		
		
		
	}

}
