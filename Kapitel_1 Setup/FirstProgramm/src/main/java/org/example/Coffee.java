package org.example;
// Erstelle einen Kaffeeautomaten welches aufhört die Tasse zu befüllen,
// wenn der Tassenfüllstand 150ml erreicht ist.
// Gebe dann "Der Kaffee ist fertig" aus. Gebe andernfalls "Fülle auf..." aus.

import java.util.Scanner;
public class Coffee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib den aktuellen Tassenfüllstand in ml ein:");
        int tasse = sc.nextInt();

        int maximaleFuellstand = 150;  // max ml

        // Ternärer Operator: Überprüfen, ob die Tasse bereits voll ist
        String nachricht = (tasse >= maximaleFuellstand) ?
                "Der Kaffee ist fertig" :
                "Fülle auf...";

        // Nachricht ausgeben0
        System.out.println(nachricht);

        sc.close();
    }
}