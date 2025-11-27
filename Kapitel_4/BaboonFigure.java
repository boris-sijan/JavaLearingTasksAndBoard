package Kapitel_4;

// Schreibe ein Programm welches die Spieler*in dazu auffordert deren Schatz zu vergraben,
// in dem diese die Zeile und Spalte angibt.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaboonFigure {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> treasureMap = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList("🟫", "🟫", "🟫")),
            new ArrayList<>(Arrays.asList("🟫", "🟫", "🟫")),
            new ArrayList<>(Arrays.asList("🟫", "🟫", "🟫"))
        ));
        String baboonFigure = "🐒";
        printMap(treasureMap);

       // Dein Code hier:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Zeile ein (1-3): ");
        int zeile = scanner.nextInt();

        System.out.print("Gib die Spalte ein (1-3): ");
        int spalte = scanner.nextInt();

        if (zeile < 1 || zeile > 3 ) {
            System.out.println("Ungültige Eingabe. Bitte wähle eine Zeile zwischen 1 und 3.");
            return;
        }

        if (spalte < 1 || spalte > 3) {
            System.out.println("Ungültige Eingabe. Bitte wähle eine Spalte zwischen 1 und 3.");
            return;
        }

        treasureMap.get(zeile - 1).set(spalte - 1, baboonFigure);

       // Ende deines Codes

        printMap(treasureMap);
    }

    private static void printMap(ArrayList<ArrayList<String>> treasureMap) {
        System.out.println("1️⃣ " + String.join("", treasureMap.get(0)));
        System.out.println("2️⃣ " + String.join("", treasureMap.get(1)));
        System.out.println("3️⃣ " + String.join("", treasureMap.get(2)));
        System.out.println("  1️⃣ 2️⃣ 3️⃣");
    }
}