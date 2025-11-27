package Kapitel_3;
import java.util.Scanner;

// Erstelle einen Kaffeeautomaten welches aufhört die Tasse zu befüllen, 
// wenn der Tassenfüllstand 150ml erreicht ist.
// Gebe dann "Der Kaffee ist fertig" aus. Gebe andernfalls "Fülle auf..." aus.

public class Coffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menge = 0;

        while (menge < 150) {
            System.out.println("Fülle auf");
            menge += 50;
        }
        System.out.println("Der Kaffee ist fertig");
        scanner.close();
    }
}