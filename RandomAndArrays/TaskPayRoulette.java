package RandomAndArrays;

// Pay Roulette
// Schreibe ein Programm welches zufällig aus einer Liste an Gästen einen auswählt,
// der die Rechnung zahlt. Gehe dazu wie folgt vor:
// Nimm eine Eingabe von Namen, mit Leerzeichen getrennt ("Hans Magerete") via Scanner an
// (Du kannst zu Testzwecken auch eine Liste an Gästen als String verwenden)
// Teile dann den String in eine Liste auf
// Wähle dann, mithilfe von random, eine Person aus, welche die Rechnung zahlt.
// Gebe dann das Ergebnis aus

import java.util.Random;

public class TaskPayRoulette {
    public static void main(String[] args) {
        String names = "Toni, Andree, Roy, Tim";
        Random rand = new Random();

        String[] namesArray = names.replace(" ","").split(",");

        System.out.println("The lucky person is: " + namesArray[rand.nextInt(namesArray.length)]); // choose random person

    }
}
