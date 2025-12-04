// Schreibe eine App, welche mit den Parametern: distance, costPerLiter, literPer100Km,
// Task 1 - Erstelle eine Funktion askUserForData, in welche die Nutzer*in nach den drei Werten fragt
// Task 2 - Erstelle eine Funktion calcCost, welche diese drei Werte annimmt
// Task 3 - Berechnung und Ausgabe der Kosten.
// Task 4 - Rufe aus askUserForData die Funktion calcCost auf und rufe askUserFoData selbst auf

import java.util.Scanner;

public class TripCost {

    public static void main(String[] args) {
        askUserForData();   // Task 4
    }

    // Task 1
    public static void askUserForData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Distanz ein (km): ");
        double distance = scanner.nextDouble();

        System.out.print("Gib die Kosten pro Liter ein (€): ");
        double costPerLiter = scanner.nextDouble();

        System.out.print("Gib den Verbrauch pro 100 km ein (Liter): ");
        double literPer100Km = scanner.nextDouble();

        // Task 4
        calcCost(distance, costPerLiter, literPer100Km);
    }

    // Task 2
    public static void calcCost(double distance, double costPerLiter, double literPer100Km) {

        // Task 3 – Berechnung und Ausgabe der Kosten
        double litersUsed = (distance / 100) * literPer100Km;
        double totalCost = litersUsed * costPerLiter;

        System.out.println("Gesamtkosten der Reise: " + totalCost + " €");
    }
}
