package talspelet;

import java.util.Scanner;

public class Talspelet2 {

	public static void main(String[] args) {

		{
			System.out.println("Välkommen till talspelet!"); //Detta skrivs ut i konsolen i början och låter användaren se nivåerna och låta den välja mellan dem tre som finns.
			System.out.println("Välj en nivå!");
			System.out.println("(1) - Easy, gissa numret mellan 1-20");
			System.out.println("(2) - Medium, gissa numret mellan 1-50");
			System.out.println("(3) - Hard, gissa numret mellan 1-100");

			Scanner input = new Scanner(System.in);

			int guesses;      //Deklarerar integer så att den ligger sparad på minnen så att de kan användas senare i flera cases.
			int randomnumber; //
			int min1;         //
			int max1;         //
			
			int choice = input.nextInt();

			switch (choice) { // Switchen gör så att man kan välja mellan de olika nivåerna

			case 1:
				System.out.println("Du har valt Easy!");
				
				System.out.println("Gissa på ett tal från 0 till 20");

				min1 = 0;
				max1 = 20;

				randomnumber = (int) (Math.random() * ((max1 - min1) + 1) + min1); // Denna integer gör så att den
																					// slumpar fram ett tal som man //
																					// ska gissa på

				guesses = 5;

				for (int i = 1; i <= guesses; i++) {
					int tal1 = input.nextInt();
					if (tal1 == randomnumber) {  // Om gissningen är randomnumber så printas det ut att du har vunnit (se under), och även vilket nummer det slumpade var.
						System.out.println("Du har vunnit! Svaret var:" + randomnumber);
						break;
					} else if (tal1 < randomnumber) { // Kollar om tal1 är mindre än det slumpade talet
						System.out.println("Gissa högre!");
						System.out.println(" gissningar kvar");
					} else if (tal1 > randomnumber) { //Kollar om tal1 är större än det slumpade talet
						System.out.println("Gissa lägre!");
						System.out.println(guesses - (i) + "gissningar kvar"); //Om man gissar fel så visas antalet totala gissningar minus det inmatade gissningarna hitills, alltså hur många gissningar man har kvar
					}
				}
				break;   //Stänger casen, alltså stänger loopen så att den inte körs igen om kraven är uppfyllda

			case 2:

				System.out.println("Du har valt Medium!");
				
				System.out.println("Gissa på ett tal från 0 till 50");

				min1 = 0;
				max1 = 50;

				randomnumber = (int) (Math.random() * ((max1 - min1) + 1) + min1); // Denna integer gör så att den
																					// slumpar fram ett tal som man
																					// ska gissa på
				guesses = 10;

				for (int i = 1; i <= guesses; i++) {
					int tal1 = input.nextInt();
					if (tal1 == randomnumber) {
						System.out.println("Du har vunnit! Svaret var:" + randomnumber);
						break;
					} else if (tal1 < randomnumber) { // Kollar om tal1 är mindre än det slumpade talet
						System.out.println("Gissa högre!");
						System.out.println(" gissningar kvar");
					} else if (tal1 > randomnumber) {
						System.out.println("Gissa lägre!");
						System.out.println(guesses - (i) + " gisnningar kvar");

					}
				}
				break;
				
			case 3:

				System.out.println("Du har valt Hard!");
				
				System.out.println("Gissa på ett tal från 0 till 100");

				min1 = 0;
				max1 = 100;

				randomnumber = (int) (Math.random() * ((max1 - min1) + 1) + min1); // Denna integer gör så att den
																					// slumpar fram ett tal som man
																					// ska gissa på
				guesses = 15;

				for (int i = 1; i <= guesses; i++) {
					int tal1 = input.nextInt();
					if (tal1 == randomnumber) {
						System.out.println("Du har vunnit! svaret var:" + randomnumber);
						break;
					} else if (tal1 < randomnumber) { // Kollar om tal1 är mindre än det slumpade talet
						System.out.println("Gissa högre!");
						System.out.println(" gissningar kvar");
					} else if (tal1 > randomnumber) {
						System.out.println("Gissa lägre!");
						System.out.println(guesses - (i) + " gissningar kvar");

					}
				}
				break;
			}

		}
	}
}