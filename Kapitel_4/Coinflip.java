package Kapitel_4;

import java.util.Random;

// Schreibe ein Programm, welches per Zufall "Kopf" oder "Zahl" ausgibt
// Benutze hierzu java.util.Random und generiere damit entweder einer 1 oder eine 0
// 1 = Kopf
// 0 = Zahl

public class Coinflip {
    public static void main(String[] args) {
        Random random = new Random();
        int coin = random.nextInt(2);

        if (coin == 1) {
            System.out.println("Kopf");
        } else {
            System.out.println("Zahl");
        }
    }
}
