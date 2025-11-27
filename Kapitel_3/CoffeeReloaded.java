package Kapitel_3;
import java.util.Scanner;

//Erweitere das Programm so, das je nach gewählter Kaffee-Zubereitung eine andere Füllmenge gewählt wird:
//   - (1) Kaffee       = 140 ml
//   - (2) Espresso     =  20 ml
//   - (3) Americano    = 450 ml
//   - (x) Alle anderen = 200 ml
// Erweitere das Kaffeeprogramm so, dass nach dem die Tasse gefüllt wurde,
// Milch hinzugegeben wird, so dies vom Kunden gewünscht ist.
    
public class CoffeeReloaded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startmenge = 0;
        int menge = 0;

        System.out.println("Wählen Sie die Kaffee-Zubereitung:");
        System.out.println("1: Kaffee = 140 ml");
        System.out.println("2: Espresso =  20 ml");
        System.out.println("3: Americano = 450 ml");
        System.out.println("x: Alle anderen = 200 ml");
        String auswahl = scanner.nextLine();

        switch (auswahl) {
            case "1":
                menge = 140;
                break;
            case "2":
                menge = 20;
                break;
            case "3":
                menge = 450;
                break;
            default:
                menge = 200;
                break;
        }

        while (startmenge < menge) {
            startmenge += 50;
            System.out.println("Fülle auf");
        }

        System.out.println("Der Kaffee ist fertig! Möchten Sie Milch hinzufügen? (ja/nein):");
        String milchWunsch = scanner.nextLine();
        if (milchWunsch.equalsIgnoreCase("ja")) {
            System.out.println("Milch wird hinzugefügt.");
        } else {
            System.out.println("Keine Milch hinzugefügt.");
        }
        scanner.close();
    }
}
