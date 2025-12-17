// Schreibe ein Programm, welches per Zufall "Kopf" oder "Zahl" ausgibt
// Benutze hierzu java.util.Random und generiere damit entweder einer 1 oder eine 0
// 1 = Kopf
// 0 = Zahl

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Drücken Sie die Eingabetaste, um die Münze zu werfen!");
        scanner.nextLine(); // warte auf Enter

        int num = rand.nextInt(2);

        if (num == 1) {
            System.out.println("Kopf");
        }
        else {
            System.out.println("Zahl");
        }
        scanner.close();
    }
}