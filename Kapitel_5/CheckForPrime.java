package Kapitel_5;

import java.util.Scanner;
public class CheckForPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein: ");
        int inputNumber = scanner.nextInt();

        if (cheackForPrime(inputNumber)) {
            System.out.println(inputNumber + " ist eine Primzahl.");
        } else {
            System.out.println(inputNumber + " ist keine Primzahl.");
        }
    }

    public static boolean cheackForPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
