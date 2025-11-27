// Schreibe ein Programm welches die Spieler*in dazu auffordert deren Schatz zu vergraben,
// in dem diese die Zeile und Spalte angibt.

import java.lang.String;
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

        System.out.println("Gib die Zeile ein, in der du deinen Schatz vergraben möchtest (1-3):");
        int zeile = scanner.nextInt() - 1;

        System.out.println("Gib die Spalte ein, in der du deinen Schatz vergraben möchtest (1-3):");
        int spalte = scanner.nextInt() - 1;

        treasureMap.get(zeile).set(spalte, baboonFigure);

        scanner.close();
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
