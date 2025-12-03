import java.util.Random;

public class Coinflip {
    public static void main(String[] args) {
        Random random = new Random();

        // Generišemo 0 ili 1
        int zahl = random.nextInt(2); // 0 ili 1

        if (zahl == 1) {
            System.out.println("Kopf");
        } else {
            System.out.println("Zahl");
        }
    }
}
