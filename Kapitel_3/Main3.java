package Kapitel_3;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kinoTickets = 15;

        System.out.print("Geben Sie Ihr Alter ein: ");
        int jahre = scanner.nextInt();
        if (jahre < 0) {
            System.out.println("Nicht richtige Alter eingegeben");
        } else if (jahre <= 12) {
            double rabatt = 0.25; // 25%
            System.out.println("Preis: " + (kinoTickets - (kinoTickets * rabatt)) + " Euro");
        } else {
            System.out.println("Preis: " + (kinoTickets) + " Euro");
        }

        scanner.close();
    }
}