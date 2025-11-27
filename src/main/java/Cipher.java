import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cipher {

    static ArrayList<String> alphabet = new ArrayList<>(Arrays.asList(
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z", "ä", "ö", "ü", "ß", " "
    ));

    public static void main(String[] args) {
        askForData();
    }

    // -------------------- TASK 1 --------------------
    public static void askForData() {
        Scanner scanner = new Scanner(System.in);
        boolean weiter = true;

        while (weiter) {
            System.out.print("Möchtest du (V)erschlüsseln oder (E)ntschlüsseln? ");
            String mode = scanner.nextLine().toLowerCase();

            System.out.print("Um wie viele Zeichen soll verschoben werden? ");
            int shift = Integer.parseInt(scanner.nextLine());

            System.out.print("Wie lautet die Nachricht? ");
            String message = scanner.nextLine().toLowerCase();

            crypt(mode, shift, message);

            System.out.print("Noch einmal? (ja/nein): ");
            String again = scanner.nextLine().toLowerCase();

            if (!again.equals("ja")) {
                weiter = false;
                System.out.println("Programm beendet.");
            }
        }

        scanner.close();
    }

    // -------------------- TASK 2 --------------------
    public static void crypt(String mode, int shift, String message) {

        String[] chars = message.split(""); // String → Zeichenliste
        StringBuilder result = new StringBuilder();

        for (String ch : chars) {
            int index = alphabet.indexOf(ch);

            if (index == -1) {
                result.append(ch); // Unbekanntes Zeichen → direkt übernehmen
                continue;
            }

            int newIndex;

            if (mode.equals("v")) { // Verschlüsseln
                newIndex = (index + shift) % alphabet.size();
            } else { // Entschlüsseln
                newIndex = (index - shift) % alphabet.size();
                if (newIndex < 0) newIndex += alphabet.size();
            }

            result.append(alphabet.get(newIndex));
        }

        System.out.println("Ergebnis: " + result.toString());
    }
}
