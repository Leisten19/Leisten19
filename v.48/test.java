import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };
		sevens(numbers);
		System.out.println(NumberOfToms);
		System.out.println(mostnumbers(numbers));
		System.out.println(mostPopAndLeastPop(numbers));
		System.out.println(indexOfDrusilla(names));
		System.out.println(sumOfEvenNumbers(numbers));
		System.out.println(amountOfIndividualNumbers(numbers));
		System.out.println(numberOfNamesThatStartWithL(names));
		System.out.println(amountOfFiveLetterNames(names));
		System.out.println(numberOfUniqueNames(names));
		System.out.println(mostPopularName(names));
		
		String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
	}

	/** Söker igenom ett antal siffror och letar efter 7. När den hittar 7 så adderar den AmoutOfSevens med 1.
	 * 
	 * 
	 */
	
	private static int mostnumbers(int[] numbers) {
		int most;
		int amount=0;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			amount=0;
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[j] == i) {
					amount++;
					 
			}
		} 
			max= amount;
			if(amount > max) {
				most = i;
			}
	}
}
	public static void sevens(int[] numbers) {

		int AmountOfSevens = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 7) {
				AmountOfSevens++;
			}

		}
		System.out.println(AmountOfSevens);


	}
	
	public static int NumberOfToms(String[] Names) {
		int HowManyToms=0;

		for (int i = 0; i < Names.length; i++) {
				if (Names[i].equals("Tom")) ; {
					HowManyToms++;
			}
				return HowManyToms;
				
	}
		/**
		 
		 * @param numbers
		 * @return mostAndLeast
		 */
		public static String mostPopAndLeastPop(int[]numbers){ //Hittar den mest och minst populäraste numret och skriuver ut vardera
			
			int most = 0;
			int least = numbers.length;
			int counter = 0;
			int mostItem = 0;
			int leastItem = 0;

			Arrays.sort(numbers);

			for (int i = 0; i < numbers.length; i++) {

				for (int j = 0; j < numbers.length; j++) {

					if (numbers[i] == numbers[j]) {
						counter++;
					}
					
					if (most < counter) {
						most = counter;
						mostItem = numbers[i];
					}
				}
				
				if (counter <= least) {
					least = counter;
					leastItem = numbers[i];
				}
				
				counter = 0;
			}

			String mostItemS = Integer.toString(mostItem);
			String leastItemS = Integer.toString(leastItem);
			String mostAndLeast ="Most popular number: " + mostItemS + "\n" + "Least popular number: " + leastItemS + "\n";
			return mostAndLeast;
			
			
			
			
		}


		/**
		 
		 * @param names
		 * @return result
		 */
		public static String indexOfDrusilla(String[]names){ //Hittar indexet av Drussila

			int index = 0;
			String result = "";

			for (int i = 0; i < names.length; i++) {

				if(names[i].contains("Drusilla")) {
					index = i;
				}
			}
			result = "Index of \"Drusilla\": " + index + "\n";
			return result;

		}


		/**
		 * @param numbers
		 * @return result
		 */
		public static String sumOfEvenNumbers(int[]numbers) { //Räknar ut summan av alla nummer

			int sum = 0;
			String result = "";
		
			for (int i = 0; i < numbers.length; i++) {
				
					if(numbers[i] % 2 == 0) {
						sum = sum + numbers[i];
					}
			}
			result = "Sum of even numbers: " + sum + "\n";
			return result;				//0 (7)
										//2 (6)
										//4 (14)
										//6 (8)
										//8 (12)
										// summa = 212
		}
		
		
		/**
		 
		 * @param numbers
		 * @return result
		 */
		public static String amountOfIndividualNumbers(int[]numbers) { //Visar summan av varje nummer
			
			int counter = 0;
			String result = "Number \tAmount \n";
			
			Arrays.sort(numbers);


			for (int i = 0; i < numbers.length; i++) {

				for (int j = 0; j < numbers.length; j++) {

					if (numbers[i] == numbers[j]) {
						counter++;
					}
					
					
				}
				result = result + numbers[i] + "\t" + counter + "\n";
				i = i + counter;
				counter = 0;
			}
				
			return result;
		}
		
		
	
		}
	

		
		
	}
	
	



