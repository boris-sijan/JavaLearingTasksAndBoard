package Conditions;

// Erweitere das Programm so, das je nach gewählter Kaffee-Zubereitung eine andere Füllmenge gewählt wird:
//   - (1) Kaffee       = 140 ml
//   - (2) Espresso     =  20 ml
//   - (3) Americano    = 450 ml
//   - (x) Alle anderen = 200 ml
// Erweitere das Kaffeeprogramm so, dass nach dem die Tasse gefüllt wurde,
// Milch hinzugegeben wird, so dies vom Kunden gewünscht ist.


import java.util.Scanner;

public class TaskCoffeeReloaded {
    public static void main(String[] args) {
        int cup = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Coffee preparation (1=Coffee, 2=Espresso, 3=Americano, x=Others.");
        int coffee = scanner.nextInt();
        System.out.println("Do you want milk? (true=Yes, false=No):");
        boolean milk = scanner.nextBoolean();

        int cupMax = switch (coffee) {
            case 1 -> 140;
            case 2 -> 20;
            case 3 -> 450;
            default -> 200;
        };
        while (cup < cupMax) {
            cup += 5;
            System.out.println("Fill up: " + cup + "ml");
            // Try - allows you to define a block of code to be tested for errors while it is being executed
            // Catch - allows you to define a block of code to be executed, if an error occurs in the try block
            // The try and catch keywords come in pairs:
            try {
                Thread.sleep(50); //50 millis waiting
            } catch (InterruptedException e) {
                System.out.println("Error when filling the cup");
            }
        }
        System.out.println("Coffee is ready.");
        if(milk){
            System.out.println("Fill up milk");
        }
        System.out.println("done");
    }
}
