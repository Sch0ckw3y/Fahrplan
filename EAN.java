import java.util.Scanner;

public class EAN {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Gebe Sie einen EAN13-Code ein, um deren Gültigkeit zu überprüfen: ");
    String ean13Code = scanner.nextLine();

    // Speicher den Code als eine array aus Zahlen
    int[] digits = new int[ean13Code.length()];
    for (int i = 0; i < ean13Code.length(); i++) {
      digits[i] = Character.getNumericValue(ean13Code.charAt(i));
    }

    // Benutzt den Modulo Operator, um die Richtigkeit des EAN13-Codes herrauszufinden (Rechnung)
    int sum = 0;
    for (int i = 0; i < 12; i++) {
      if (i % 2 == 0) {
        sum += digits[i];
      } else {
        sum += digits[i] * 3;
      }
    }
    int checkDigit = 10 - (sum % 10);

    // Überprüft auf desen Gültigkeit
    if (checkDigit == digits[12]) {
      System.out.println("Der EAN13-Code ist gültig!"); 
    } else {
      System.out.println("Der EAN13-Code ist ungültig!");
    }
  }
}