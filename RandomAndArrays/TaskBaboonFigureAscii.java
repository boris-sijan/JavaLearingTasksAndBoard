package RandomAndArrays;

// Schreibe ein Programm welches die Spieler*in dazu auffordert deren Schatz zu vergraben,
// in dem diese die Zeile und Spalte angibt.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskBaboonFigureAscii {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<ArrayList<String>> treasureMap = new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("O", "O", "O")),
                    new ArrayList<>(Arrays.asList("O", "O", "O")),
                    new ArrayList<>(Arrays.asList("O", "O", "O"))
            ));
            String baboonFigure = "B";
            printMap(treasureMap);

            System.out.println("Enter the coordinates");
            String[] coordinate = scanner.nextLine().replace(" ","").split(",");
            treasureMap.get((Integer.parseInt(coordinate[0]) - 1)).set((Integer.parseInt(coordinate[1]) - 1), "B");

            printMap(treasureMap);
            scanner.close();
        }

        private static void printMap(ArrayList<ArrayList<String>> treasureMap) {
            System.out.println("1 " + String.join("", treasureMap.get(0)));
            System.out.println("2 " + String.join("", treasureMap.get(1)));
            System.out.println("3 " + String.join("", treasureMap.get(2)));
            System.out.println("  1 2 3");
        }
    }