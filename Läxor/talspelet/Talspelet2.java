package talspelet;

import java.util.Scanner;

public class Talspelet2 {

	public static void main(String[] args) {

		{
			System.out.println("V�lkommen till talspelet!"); //Detta skrivs ut i konsolen i b�rjan och l�ter anv�ndaren se niv�erna och l�ta den v�lja mellan dem tre som finns.
			System.out.println("V�lj en niv�!");
			System.out.println("(1) - Easy, gissa numret mellan 1-20");
			System.out.println("(2) - Medium, gissa numret mellan 1-50");
			System.out.println("(3) - Hard, gissa numret mellan 1-100");

			Scanner input = new Scanner(System.in);

			int guesses;      //Deklarerar integer s� att den ligger sparad p� minnen s� att de kan anv�ndas senare i flera cases.
			int randomnumber; //
			int min1;         //
			int max1;         //
			
			int choice = input.nextInt();

			switch (choice) { // Switchen g�r s� att man kan v�lja mellan de olika niv�erna

			case 1:
				System.out.println("Du har valt Easy!");
				
				System.out.println("Gissa p� ett tal fr�n 0 till 20");

				min1 = 0;
				max1 = 20;

				randomnumber = (int) (Math.random() * ((max1 - min1) + 1) + min1); // Denna integer g�r s� att den
																					// slumpar fram ett tal som man //
																					// ska gissa p�

				guesses = 5;

				for (int i = 1; i <= guesses; i++) {
					int tal1 = input.nextInt();
					if (tal1 == randomnumber) {  // Om gissningen �r randomnumber s� printas det ut att du har vunnit (se under), och �ven vilket nummer det slumpade var.
						System.out.println("Du har vunnit! Svaret var:" + randomnumber);
						break;
					} else if (tal1 < randomnumber) { // Kollar om tal1 �r mindre �n det slumpade talet
						System.out.println("Gissa h�gre!");
						System.out.println(" gissningar kvar");
					} else if (tal1 > randomnumber) { //Kollar om tal1 �r st�rre �n det slumpade talet
						System.out.println("Gissa l�gre!");
						System.out.println(guesses - (i) + "gissningar kvar"); //Om man gissar fel s� visas antalet totala gissningar minus det inmatade gissningarna hitills, allts� hur m�nga gissningar man har kvar
					}
				}
				break;   //St�nger casen, allts� st�nger loopen s� att den inte k�rs igen om kraven �r uppfyllda

			case 2:

				System.out.println("Du har valt Medium!");
				
				System.out.println("Gissa p� ett tal fr�n 0 till 50");

				min1 = 0;
				max1 = 50;

				randomnumber = (int) (Math.random() * ((max1 - min1) + 1) + min1); // Denna integer g�r s� att den
																					// slumpar fram ett tal som man
																					// ska gissa p�
				guesses = 10;

				for (int i = 1; i <= guesses; i++) {
					int tal1 = input.nextInt();
					if (tal1 == randomnumber) {
						System.out.println("Du har vunnit! Svaret var:" + randomnumber);
						break;
					} else if (tal1 < randomnumber) { // Kollar om tal1 �r mindre �n det slumpade talet
						System.out.println("Gissa h�gre!");
						System.out.println(" gissningar kvar");
					} else if (tal1 > randomnumber) {
						System.out.println("Gissa l�gre!");
						System.out.println(guesses - (i) + " gisnningar kvar");

					}
				}
				break;
				
			case 3:

				System.out.println("Du har valt Hard!");
				
				System.out.println("Gissa p� ett tal fr�n 0 till 100");

				min1 = 0;
				max1 = 100;

				randomnumber = (int) (Math.random() * ((max1 - min1) + 1) + min1); // Denna integer g�r s� att den
																					// slumpar fram ett tal som man
																					// ska gissa p�
				guesses = 15;

				for (int i = 1; i <= guesses; i++) {
					int tal1 = input.nextInt();
					if (tal1 == randomnumber) {
						System.out.println("Du har vunnit! svaret var:" + randomnumber);
						break;
					} else if (tal1 < randomnumber) { // Kollar om tal1 �r mindre �n det slumpade talet
						System.out.println("Gissa h�gre!");
						System.out.println(" gissningar kvar");
					} else if (tal1 > randomnumber) {
						System.out.println("Gissa l�gre!");
						System.out.println(guesses - (i) + " gissningar kvar");

					}
				}
				break;
			}

		}
	}
}