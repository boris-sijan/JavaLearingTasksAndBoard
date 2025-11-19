import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int number = scanner.nextInt();
        
        checkForPrime(number);
        
        scanner.close();
    }

    static void checkForPrime(int number) {
        
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                System.out.println(number + " ist keine Primzahl.");
                return;
            }
        }
        
        System.out.println(number + " ist eine Primzahl.");
    }
}