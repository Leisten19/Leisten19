
public class methodlibraryv2 {

	public static void main(String[] args) {
		

		System.out.println((fahrenheitToKelvin(5))); // Fh till kelvin, skriver ut kelvin
	    System.out.println((KelvinToCelsius(200))); //kelvin till celsius, skriver ut celsius
	    System.out.println((km(80))); //Km till m/s
	    System.out.println(energi(10, 9.82)); //Massa och hastighet
	    System.out.println((9, 4)); //Vikt och h�jd
	    System.out.println(smallletters("PaParaZZi")); // g�r alla till sm� bokst�ver
	    System.out.println(bigletters("Jag vill bli godk�nd i programmering!")); //Och tv�rtom
	    System.out.println(v�rden(2, 5, 3)); // detta �r d� potentiell energi
	    System.out.println(arbete(10, 2)); // arbete inom den fysiska v�rlden
	    System.out.println();
	    
	
	}
	public static double fahrenheitToKelvin(double fahrenheit) {
		return (fahrenheit + 459.67) * 5/9;
	}
	public static double KelvinToCelsius(double Kelvin) {
		return Kelvin-273.15;
	}
	
	public static double km(double m) {
	    return (m) /3.6;
	}
	
	public static double energi(double a, double b) {
		return a / b;
	}
	
	public static double bmi(double v, double l) {
		return v/(l*l);
		
	}

	public static String smallletters(String ord) {
		return ord.toLowerCase();
	}
 
	public static String bigletters(String meaning) {
		String lowerMeanig = meaning.toLowerCase();
		return lowerMeanig.replace('o', '0');
	}

	public static double arbete(double a, double b) {
		return a * b; // ger ut svar med Nm
	}
}



