// Pay Roulette
// Schreibe ein Programm welches zufällig aus einer Liste an Gästen einen auswählt,
// der die Rechnung zahlt. Gehe dazu wie folgt vor:
// Nimm eine Eingabe von Namen, mit Leerzeichen getrennt ("Hans Magerete") via Scanner an
// (Du kannst zu Testzwecken auch eine Liste an Gästen als String verwenden)
// Teile dann den String in eine Liste auf
// Wähle dann, mithilfe von random, eine Person aus, welche die Rechnung zahlt.
// Gebe dann das Ergebnis aus

import java.util.Scanner;
import java.util.Random;

public class PayRoulette {
    public static void main(String[] args) {

        Scanner scannerNamen  = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Nimm eine Eingabe von Namen, mit Leerzeichen getrennt");
        String namen = scannerNamen.nextLine();

        String[] Gaeste = namen.split(" ");
        int index = rand.nextInt(Gaeste.length);
        String happyZahler = Gaeste[index];

        System.out.println(happyZahler+ " wird die Rechnung bezahlen.");

        scannerNamen.close();

    }
}