import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
		// t ex en meny för användare

		Scanner input = new Scanner(System.in);

		System.out.println("Välkommen till klädaffären, välj en klädstil");
		System.out.println("(1) - High end");
		System.out.println("(2) - Skate-stil");
		System.out.println("(3) - Snobb");
		System.out.println("(4) - Hypebeast");
		System.out.println("(5) - Low.budget");
		System.out.println();

		int choice = input.nextInt();

		String genre;

		switch (choice) {
		case 1:
			genre = "High end";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. A quit place, av John Krasinski");
			System.out.println("2. The dark night, av Christopher Nolan");
			System.out.println("3. The silence of the lamb, av Jonathan Demme");
			System.out.println();
			break;
		case 2:
			genre = "Comedy";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. Deadpool 2, av David Leitch");
			System.out.println("2. Dum och dummare, av Peter Farelly");
			System.out.println("3. Bridesmaid, av Paul Feig");
			System.out.println();
			break;
		case 3:
			genre = "Romance";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. The notebook, av Nick Cassavetes");
			System.out.println("2. The holidays, av Nancy Meyrs");
			System.out.println("3. Love Simon, av Greg Berlanti");
			System.out.println();
			break;
		case 4:
			genre = "Fantasy";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. Lord of the rings - Sagan om ringen, av Peter Jackson");
			System.out.println("2. Aquaman, av James Wan");
			System.out.println("3. Avengers - Infinity war, av Anthony & Joe Russo");
			System.out.println();
			break;
		case 5:
			System.out.println("Thank you for today!");
			break;
		default:
			genre = "invalid";
			System.out.println("You have made a " + genre + " choice! Too bad for you!");
			System.out.println();
			break;
		}

		input.close();
	}

}
