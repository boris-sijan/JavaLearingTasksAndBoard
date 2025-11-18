package RandomAndArrays;

import java.util.Random;

public class Random1To6 {
    public static void main(String[] args) {
        Random rand = new Random();

        int diceRoll = rand.nextInt(6) + 5;  // generates a random number between 1 (inclusive) and 6 (inclusive)

        System.out.println("You got " + diceRoll);
    }
}
