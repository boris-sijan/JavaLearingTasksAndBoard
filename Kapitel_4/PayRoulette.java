package Kapitel_4;

import java.util.Scanner;
import java.util.Random;

public class PayRoulette {
    public static void main(String[] args) {
        // Dein Code nach dieser Zeile
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nimm eine Eingabe von Namen, mit Leerzeichen getrennt:");
        String namen = scanner.nextLine();

        if (namen.trim().isEmpty()) {
            System.out.println("Keine Namen eingegeben.");
            return;
        }

        String[] person = namen.split(" ");

        Random random = new Random();
        int index = random.nextInt(person.length);
        String zahlenPerson = person[index];

        System.out.println("Der zahlende Person ist: " + zahlenPerson);
    }
}