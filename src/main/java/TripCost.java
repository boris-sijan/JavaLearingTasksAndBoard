import java.lang.String;
import java.util.Scanner;

public class TripCost {

    public static void main(String[] args) {
        askUserForData();
    }

    // -------------------- TASK 1 --------------------
    public static void askUserForData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Strecke in km ein: ");
        double distance = scanner.nextDouble();

        System.out.print("Gib den Preis pro Liter ein (€): ");
        double costPerLiter = scanner.nextDouble();

        System.out.print("Gib den Verbrauch pro 100 km ein (Liter): ");
        double literPer100Km = scanner.nextDouble();

        // TASK 4 → calcCost aufrufen
        calcCost(distance, costPerLiter, literPer100Km);

        scanner.close();
    }

    // -------------------- TASK 2 + 3 --------------------
    public static void calcCost(double distance, double costPerLiter, double literPer100Km) {

        // Formel:
        // Kosten = (Strecke / 100) * Verbrauch * Preis-pro-Liter
        double totalCost = (distance / 100) * literPer100Km * costPerLiter;

        System.out.println("Die Fahrtkosten betragen: " + totalCost + " €");
    }

}
