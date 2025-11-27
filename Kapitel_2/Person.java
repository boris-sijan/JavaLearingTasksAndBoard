package Kapitel_2;
import java.math.BigDecimal;

/*
* 1. Erstelle ein Programm, welches folgende Werte in den passenden Variablen speichert:
*    Startnummer: 1433
*    Name: "Alex Jones"
*    Startblock: 'a'
*    Zielzeit: 12.45
* 2. Gib die Werte der Variablen auf der Konsole aus.
*/

public class Person {
    public static void main(String[] args) {
        String name = "Alex Jones";
        BigDecimal big = new BigDecimal("4");
        int startnummer = 1433;
        BigDecimal zielzeit = new BigDecimal("12.45");
        char startblock = 'a';

        System.out.println("Name: " + name);
        System.out.println("BigDecimal: " + big);
        System.out.println("Startnummer: " + startnummer);
        System.out.println("Zielzeit: " + zielzeit);
        System.out.println("Startblock: " + startblock);
    }
}