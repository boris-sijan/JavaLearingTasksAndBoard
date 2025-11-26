import java.lang.String;
import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib den aktuellen Tassenfüllstand in ml ein: ");
        int tasse = scanner.nextInt();

        // Prüfen, ob die Tasse voll ist
        if (tasse >= 150) {
            System.out.println("Der Kaffee ist fertig");
        } else {
            System.out.println("Fülle auf...");
        }

        scanner.close();
    }
}
