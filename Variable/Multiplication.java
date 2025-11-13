package Variable;/*
 * Erstelle ein Programm das:
 * 1. Zwei ganze Zahlen einliest
 * 2. Beide Zahlen multipliziert und in einer Variable speichert
 * 3. Das Ergebnis ausgibt.
 */

import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Erste Zahl eingeben: ");
        int first = sc.nextInt();
        System.out.println("Zweite Zahl eingeben: ");
        int second = sc.nextInt();

        int result = first*second;
        System.out.println("Ergebnis ist: " + result);
        sc.close();
    }
}