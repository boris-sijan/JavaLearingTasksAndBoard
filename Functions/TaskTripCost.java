// Schreibe eine App, welche mit den Parametern: distance, costPerLiter, literPer100Km,
// Task 1 - Erstelle eine Funktion askUserForData, in welche die Nutzer*in nach den drei Werten fragt
// Task 2 - Erstelle eine Funktion calcCost, welche diese drei Werte annimmt
// Task 3 - Berechnung und Ausgabe der Kosten.
// Task 4 - Rufe aus askUserForData die Funktion calcCost auf und rufe askUserFoData selbst auf
package Functions;

import java.util.Scanner;

public class TaskTripCost {
    public static void main(String[] args) {
        askUserForData();
    }
    public static void askUserForData() {
        //insert data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert distance in km.");
        double distance = scanner.nextDouble();

        System.out.println("Insert the cost per liter");
        double costPerLiter = scanner.nextDouble();

        System.out.println("Insert how many liters are needed per 100km");
        double literPer100km = scanner.nextDouble();

        calcCost(distance, costPerLiter, literPer100km);
        System.out.println("Costs are " + calcCost(distance, costPerLiter, literPer100km));

        scanner.close();
    }
    //calculation
    public static double calcCost(double distance, double costPerLiter, double literPer100km) {
        double LiterNeeded = (distance/100.0) * literPer100km;
        double costs = LiterNeeded * costPerLiter;
        return costs;
    }
}
