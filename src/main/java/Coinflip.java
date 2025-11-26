import java.lang.String;
import java.util.Random;

public class Coinflip {
    public static void main(String[] args) {
        Random random = new Random();

        int zahl = random.nextInt(2); // generiert 0 oder 1

        if (zahl == 1) {
            System.out.println("Kopf");
        } else {
            System.out.println("Zahl");
        }
    }
}
