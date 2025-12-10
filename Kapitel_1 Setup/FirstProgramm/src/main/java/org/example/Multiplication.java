package org.example;

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

        int a;
        int b;
        int result;

        System.out.println("Bitte geben Sie eine Ganzzahl ein:");
        a = scanner.nextInt();
        System.out.println("Eingegebene Zahl a: " + a);


        System.out.println("Bitte geben Sie eine weitere ganze Zahl ein.");
        b = scanner.nextInt();
        System.out.println("Eingegebene Zahl b: " + b);

        result = a * b;
        System.out.println("Result: " + result);
        // Schließe den Scanner
        scanner.close();


    }
}