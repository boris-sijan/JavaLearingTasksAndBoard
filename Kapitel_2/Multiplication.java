package Kapitel_2;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die erste Zahl ein: ");
        int n1 = scanner.nextInt();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        int n2 = scanner.nextInt();
        int produkt = n1 * n2;
        System.out.println("Erste Zahl: " + n1);
        System.out.println("Zweite Zahl: " + n2);
        System.out.println("Produkt: " + produkt);
        scanner.close();
    }
}
