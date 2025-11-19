import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) throws Exception {
        System.out.println("Coin Flip Test");

        Random random = new Random();

        int coinFlip = random.nextInt(2); // 0 or 1
        if (coinFlip == 0) {
            System.out.println("Kopf");
        } else {
            System.out.println("Zahl");
        }
    }

}
