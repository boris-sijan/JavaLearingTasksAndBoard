import java.util.Scanner;

public class CoffeeReloaded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kaffee-Auswahl
        System.out.println("Wähle deine Kaffee-Zubereitung:");
        System.out.println("(1) Kaffee");
        System.out.println("(2) Espresso");
        System.out.println("(3) Americano");
        System.out.println("Andere Taste: Standard (200 ml)");
        System.out.print("Deine Wahl: ");
        int auswahl = scanner.nextInt();

        int fuellmenge;

        switch (auswahl) {
            case 1:
                fuellmenge = 140;
                break;
            case 2:
                fuellmenge = 20;
                break;
            case 3:
                fuellmenge = 450;
                break;
            default:
                fuellmenge = 200;
                break;
        }

        int fuellstand = 0;

        // Befüllen der Tasse
        while (fuellstand < fuellmenge) {
            System.out.println("Fülle auf...");
            fuellstand += 10;
         }

        System.out.println("Der Kaffee ist fertig!");

        // Milchoption
        System.out.print("Möchtest du Milch hinzufügen? (j/n): ");
        char milch = scanner.next().toLowerCase().charAt(0);

        if (milch == 'j') {
            System.out.println("Füge Milch hinzu...");
            System.out.println("Milch hinzugefügt!");
        }

        System.out.println("Geniesse dein Getränk!");
    }
}