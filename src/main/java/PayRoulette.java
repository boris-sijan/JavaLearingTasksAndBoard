import java.lang.String;
import java.util.Scanner;
import java.util.Random;

public class PayRoulette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Gib die Namen der Gäste ein (mit Leerzeichen getrennt):");
        String eingabe = scanner.nextLine();// Pera Mika Laza

        // String in eine Liste (Array) aufteilen
        String[] gästeListe = eingabe.split(" ");

        // Zufällige Person auswählen
        int zufallsIndex = random.nextInt(gästeListe.length);
        String ausgewählt = gästeListe[zufallsIndex];

        // Ergebnis ausgeben
        System.out.println("Die Person, die heute bezahlt, ist: " + ausgewählt);

        scanner.close();
    }
}
