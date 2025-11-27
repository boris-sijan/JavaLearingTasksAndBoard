package Kapitel_5;

// Schreibe eine App, welche mit den Parametern: distance, costPerLiter, literPer100Km,
// Task 1 - Erstelle eine Funktion askUserForData, in welche die Nutzer*in nach den drei Werten fragt
// Task 2 - Erstelle eine Funktion calcCost, welche diese drei Werte annimmt
// Task 3 - Berechnung und Ausgabe der Kosten.
// Task 4 - Rufe aus askUserForData die Funktion calcCost auf und rufe askUserFoData selbst auf

import java.util.Scanner;

public class TripCost {
    
    public static void main(String[] args) {
        askUserForData();
    }

    public static void askUserForData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte die Entfernung in Kilometern angeben: Beispiel 150 ");
        double distance = scanner.nextDouble();

        System.out.print("Bitte die Kosten pro Liter Benzin angeben: Beispiel 1.60 ");
        double costPerLiter = scanner.nextDouble();

        System.out.print("Bitte den Verbrauch in Litern pro 100 Kilometer angeben: Beispiel 8 ");
        double literPer100Km = scanner.nextDouble();

        calcCost(distance, costPerLiter, literPer100Km);
    }

    public static void calcCost(double distance, double costPerLiter, double literPer100Km) {
        double litersNeeded = (distance / 100) * literPer100Km;
        double totalCost = litersNeeded * costPerLiter;

        System.out.printf("Die Totalkosten: %.2f Euro\n", totalCost);//%f за број са децималама
    }
   
}