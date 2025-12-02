// Schreibe eine App, die die Nutzer*in dazu auffordert eine Zahl einzugeben
// Schreibe eine Funktion names checkForPrime, welche ausgibt, ob es eine Primzahl ist oder nicht
// Tipps:
// Du kannst mit Modulo arbeiten
// Primzahlen sind nur durch 1 und sich selbst teilbar

package Functions;

import java.util.Scanner;

public class TaskCheckForPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number(integer)");
        int myNumber = scanner.nextInt();
        scanner.close();
        int divisor = 0;
        boolean isPrime = true;
        if (myNumber == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < myNumber; i++) {
                if (myNumber % i == 0) {
                    isPrime = false;
                    divisor = i;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Number " + myNumber + " is a prime number");
        } else if (divisor > 1) {
            System.out.println("Number " + myNumber + " is not a prime number. The number is divisible by " + divisor);
        } else{
            System.out.println("Number " + myNumber + " is not a prime number");
        }

    }
}