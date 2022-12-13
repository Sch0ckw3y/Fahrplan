import java.util.Scanner;

public class Rom {
  public static void main(String[] args) {
    // Create a Scanner to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a Roman numeral
    System.out.print("Enter a Roman numeral: ");
    String romanNumeral = scanner.nextLine();

    // Convert the Roman numeral to its decimal equivalent and print it
    int decimal = toDecimal(romanNumeral);
    System.out.println(decimal);
  }

  public static int toDecimal(String romanNumeral) {
    // Create a mapping of Roman numeral to decimal value
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    // Convert the Roman numeral to its decimal equivalent
    int decimal = 0;
    for (int i = 0; i < romanNumeral.length(); i++) {
      char c = romanNumeral.charAt(i);
      int value = map.get(c);

      // If the next character has a greater value, subtract the current value
      // from the total
      if (i < romanNumeral.length() - 1) {
        char next = romanNumeral.charAt(i + 1);
        if (map.get(next) > value) {
          decimal -= value;
        } else {
          decimal += value;
        }
      } else {
        // This is the last character, so add its value to the total
        decimal += value;
      }
    }

    // Return the decimal equivalent of the Roman numeral
    return decimal;
  }
}