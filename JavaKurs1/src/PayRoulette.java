import java.util.Scanner;
import java.util.Random;

public class PayRoulette {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Gib die Namen der Gäste ein ( durch Komma getrennt ): ");
        String input = scanner.nextLine();

        String[] gaeste = input.split(",");

        int randomIndex = random.nextInt(gaeste.length);
        String ausgewaehlt = gaeste[randomIndex];

        // Resultat
        System.out.println("Die Rechnung zahlt: " + ausgewaehlt);
    }
}
