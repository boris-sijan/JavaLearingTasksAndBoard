package Kapitel_4;

import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(100);  // erzeugt eine Zufallszahl zwischen 0 (inklusive) und 100 (exklusive)

        System.out.println("Zufallszahl: " + number);
    }
}