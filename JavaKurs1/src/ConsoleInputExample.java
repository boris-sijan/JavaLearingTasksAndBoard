import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        // Erstelle ein Scanner-Objekt
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach einer Zeichenkette
        System.out.println("Bitte geben Sie eine Zeichenkette ein:");
        String inputString = scanner.nextLine();
        System.out.println("Eingegebene Zeichenkette: " + inputString);

        // Frage den Benutzer nach einer Ganzzahl
        System.out.println("Bitte geben Sie eine Ganzzahl ein:");
        int inputInt = scanner.nextInt();
        System.out.println("Eingegebene Zahl: " + inputInt);

        // Schließe den Scanner
        scanner.close();
    }
}
