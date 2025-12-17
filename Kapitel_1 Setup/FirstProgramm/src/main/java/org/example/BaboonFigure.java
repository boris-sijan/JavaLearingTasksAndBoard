// Schreibe ein Programm welches die Spieler*in dazu auffordert deren Schatz zu vergraben,
// in dem diese die Zeile und Spalte angibt.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaboonFigure {
    public static void main(String[] args) {

        String empty = "[ ]";
        String baboonFigure = "B)"; // ili "X"

        ArrayList<ArrayList<String>> treasureMap = new ArrayList<>();

        treasureMap.add( new ArrayList<>(Arrays.asList(empty, empty, empty)));
        treasureMap.add( new ArrayList<>(Arrays.asList(empty, empty, empty)));
        treasureMap.add( new ArrayList<>(Arrays.asList(empty, empty, empty)));



        printMap(treasureMap);

        // Dein Code hier:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Zeile (1-3) ein, in der Sie den Schatz verstecken möchten:");
        int row = scanner.nextInt() - 1;
        System.out.println("Geben Sie die Spalte (1–3) ein, in der Sie den Schatz verstecken möchten:");
        int col = scanner.nextInt() - 1;

        // Ende deines Codes
        treasureMap.get(row).set(col, baboonFigure);

        printMap(treasureMap);
        scanner.close();
    }

    private static void printMap(ArrayList<ArrayList<String>> treasureMap) {
        System.out.println("1️⃣ " + String.join("", treasureMap.get(0)));
        System.out.println("2️⃣ " + String.join("", treasureMap.get(1)));
        System.out.println("3️⃣ " + String.join("", treasureMap.get(2)));
        System.out.println("  1️⃣ 2️⃣ 3️⃣");
    }
}