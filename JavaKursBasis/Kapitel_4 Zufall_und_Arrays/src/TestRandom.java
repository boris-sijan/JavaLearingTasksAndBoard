import java.util.Random;

public class TestRandom {
    public static void main(String[] args) throws Exception {
        System.out.println("Random test");

        Random random = new Random();

        int diceRoll = random.nextInt(6) + 1;
        System.out.println("You rolled a: " + diceRoll);



    }
}
