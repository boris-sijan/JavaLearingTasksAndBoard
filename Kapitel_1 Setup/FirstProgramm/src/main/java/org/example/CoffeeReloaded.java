package org.example;
import java.util.Scanner;
public class CoffeeReloaded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Benutzer wählt die Kaffee-Zubereitung
        System.out.println("Wähle deinen Kaffee:");
        System.out.println("(1) Kaffee");
        System.out.println("(2) Espresso");
        System.out.println("(3) Americano");
        System.out.println("(x) Andere");

        String wahl = sc.nextLine();
        int fuellmenge;

        // Füllmenge basierend auf der Wahl bestimmen
        switch (wahl) {
            case "1":
                fuellmenge = 140;
                break;
            case "2":
                fuellmenge = 20;
                break;
            case "3":
                fuellmenge = 450;
                break;
            default:
                fuellmenge = 200;
        }

        // Tasse füllen
        System.out.println("Fülle die Tasse mit " + fuellmenge + " ml...");
        System.out.println("Die Tasse ist jetzt gefüllt.");

        // Abfrage, ob Milch hinzugefügt werden soll
        System.out.println("Möchten Sie Milch hinzufügen? (ja/nein)");
        String milch = sc.nextLine();

        // Milch hinzufügen, falls gewünscht
        if (milch.equalsIgnoreCase("ja")) {
            System.out.println("Milch hinzugefügt!");
        }

        // Endnachricht
        System.out.println("Ihr Getränk ist fertig!");
        sc.close();
    }
}
