import java.util.Scanner;
public class metoder {

	public static void main(String[] args) {
		
		int tal1;
		int tal2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("v�nligen skriv in tv� tal, med ett enter imellan");
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		if (tal1 <= tal2) {
			System.out.println("minsta talet �r: " + tal1);

		}
			else {
				System.out.println("minsta talet: " + tal2);
			}

	}
}