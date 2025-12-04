import java.util.Scanner;

public class CheckForPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int number = scanner.nextInt();

        checkForPrime(number);
    }

    // Eine Funktion, die überprüft, ob eine Zahl eine Primzahl ist
    public static void checkForPrime(int num) {

        if (num <= 1) {
            System.out.println(num + " ist keine Primzahl.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " ist keine Primzahl.");
                return;
            }
        }
        System.out.println(num + " ist eine Primzahl.");
    }
}