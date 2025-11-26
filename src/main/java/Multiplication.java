import java.lang.String;
import java.util.Scanner;

class Multiplication1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zwei ganze Zahlen einlesen
        System.out.print("Gib die erste Zahl ein: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Gib die zweite Zahl ein: ");
        int zahl2 = scanner.nextInt();

        // Multiplikation
        int ergebnis = zahl1 * zahl2;

        // Ergebnis ausgeben
        System.out.println("Das Ergebnis der Multiplikation ist: " + ergebnis);

        scanner.close();
    }
}
