/*
 * Erstelle ein Programm das:
 * 1. Zwei ganze Zahlen einliest
 * 2. Beide Zahlen multipliziert und in einer Variable speichert
 * 3. Das Ergebnis ausgibt.
 */
import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach einer Ganzzahl a
        System.out.println("Bitte geben Sie eine Ganzzahl 1 ein:");
        int a = scanner.nextInt();
        System.out.println("Eingegebene Zahl 1: " + a);

        // Frage den Benutzer noch einer Ganzzahl b
        System.out.println("Bitte geben Sie eine Ganzzahl 2 ein:");
        int b = scanner.nextInt();
        System.out.println("Eingegebene Zahl 2: " + b);

        int resultat = a * b;

        System.out.println("Resultat: " + resultat);
    }
}
