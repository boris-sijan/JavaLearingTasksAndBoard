import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaboonFigure {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> treasureMap = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList("0", "0", "0")),
            new ArrayList<>(Arrays.asList("0", "0", "0")),
            new ArrayList<>(Arrays.asList("0", "0", "0"))
        ));

        String baboonFigure = "X";
        printMap(treasureMap);

       // Dein Code hier:
       Scanner scanner = new Scanner(System.in);
       System.out.print("In welcher Zeile möchtest du deinen Schatz vergraben? (1-3): ");
       int row = scanner.nextInt() - 1;
       System.out.print("In welcher Spalte möchtest du deinen Schatz vergraben? (1-3): ");
       int col = scanner.nextInt() - 1;

       treasureMap.get(row).set(col, baboonFigure);

       // Ende deines Codes

        printMap(treasureMap);
        scanner.close();
    }

    private static void printMap(ArrayList<ArrayList<String>> treasureMap) {
        System.out.println("1 " + String.join("", treasureMap.get(0)));
        System.out.println("2 " + String.join("", treasureMap.get(1)));
        System.out.println("3 " + String.join("", treasureMap.get(2)));

        System.out.println("  123");
    }
}