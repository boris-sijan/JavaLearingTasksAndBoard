import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cipher {

    // Alphabet mit Umlauten, ß und Leerzeichen
    static ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList(
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z", "ä", "ö", "ü", "ß", " "
    ));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean again = true; // Kontrollvariable für Wiederholung

        while (again) {
            askForData(scanner); // Task-3: Funktion aufrufen

            // Task-4: Nachfrage für weiteren Durchlauf
            System.out.print("Möchten Sie eine weitere Nachricht (V/E) verarbeiten? (ja/nein): ");
            String answer = scanner.nextLine().toLowerCase();
            if (!answer.equals("ja")) {
                again = false;
            }
        }

        scanner.close();
        System.out.println("Programm beendet.");
    }

    // Task-1: Funktion zum Abfragen der Daten
    public static void askForData(Scanner scanner) {
        // Verschlüsseln oder Entschlüsseln?
        System.out.print("Möchten Sie (V)erschlüsseln oder (E)ntschlüsseln? ");
        String mode = scanner.nextLine().toUpperCase();

        // Anzahl Stellen für Verschiebung
        System.out.print("Um wie viele Zeichen soll verschoben werden? ");
        int shift = Integer.parseInt(scanner.nextLine());

        // Nachricht eingeben zB: Schleifen sind eine grundlegende Steuerungsstruktur in der Programmierung.
        System.out.print("Bitte geben Sie die Nachricht ein: ");
        String message = scanner.nextLine().toLowerCase();

        // crypt-Funktion aufrufen
        String result = crypt(mode, shift, message);
        System.out.println("Ergebnis: " + result);
    }

    // Task-2: Verschlüsselungs-/Entschlüsselungsfunktion
    public static String crypt(String mode, int shift, String message) {
        String[] chars = message.split(""); // Nachricht in einzelne Zeichen zerlegen
        StringBuilder result = new StringBuilder();

        for (String ch : chars) {
            int index = alphabet.indexOf(ch);

            if (index == -1) {
                // Zeichen nicht im Alphabet (z. B. Zahl, Sonderzeichen)
                result.append(ch);
            } else {
                int newIndex;
                if (mode.equals("V")) {
                    // Verschlüsseln: nach rechts verschieben
                    newIndex = (index + shift) % alphabet.size();
                } else {
                    // Entschlüsseln: nach links verschieben
                    newIndex = (index - shift) % alphabet.size();
                    if (newIndex < 0) {
                        newIndex += alphabet.size();
                    }
                }
                result.append(alphabet.get(newIndex));
            }
        }
        return result.toString();
    }
}