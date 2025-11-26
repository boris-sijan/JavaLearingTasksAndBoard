import java.math.BigDecimal;
import java.lang.String;

public class Person {
    public static void main(String[] args) {
// Variablen definieren
        int startNumber = 1433;
        String name = "Alex Jones";
        char startBlock = 'a';
        double finishTime = 12.45;
        BigDecimal big = BigDecimal.valueOf(4);

        // Ausgabe auf der Konsole
        System.out.println("Name: " + name);
        System.out.println("Startnummer: " + startNumber);
        System.out.println("Startblock: " + startBlock);
        System.out.println("Zielzeit: " + finishTime);
        System.out.println("BigDecimal Wert: " + big);
    }
}
