import java.util.Scanner;
public class Rabattsystem {

	public static void main(String[] args) {
		double Bestellwert = 0;
		int Rabatt10 = 100;
		int Rabatt15 = 500;
		
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Bitte geben Sie Ihren Bestellwert ein: ");
		Bestellwert = tastatur.nextInt();
		
		if (Rabatt10 >= Bestellwert) {
			Bestellwert = Bestellwert - (Bestellwert * 0.10);
		} else if (Rabatt15 >= Bestellwert && Bestellwert >= Rabatt10) {
			Bestellwert = Bestellwert - (Bestellwert * 0.15);
		} else if (Bestellwert >= Rabatt15) {
			Bestellwert = Bestellwert - (Bestellwert * 0.20);
		}
		
		System.out.println("\nDer Bestellwert abzüglich Rabatt beträgt " + Bestellwert + "€");
		tastatur.close();
		
	}
}