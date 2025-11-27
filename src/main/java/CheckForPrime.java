// Schreibe eine App, die die Nutzer*in dazu auffordert eine Zahl einzugeben
// Schreibe eine Funktion names checkForPrime, welche ausgibt, ob es eine Primzahl ist oder nicht
// Tipps:
// Du kannst mit Modulo arbeiten
// Primzahlen sind nur durch 1 und sich selbst teilbar

import java.lang.String;
import java.util.Scanner;

public class CheckForPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gib eine Zahl ein: ");
        int zahl = scanner.nextInt();

        checkForPrime(zahl);

        scanner.close();
    }

    public static void checkForPrime(int zahl) {
        if (zahl <= 1) {
            System.out.println(zahl + " ist keine Primzahl.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(zahl); i++) {
            if (zahl % i == 0) {
                System.out.println(zahl + " ist keine Primzahl.");
                return;
            }
        }

        System.out.println(zahl + " ist eine Primzahl!");
    }
}
