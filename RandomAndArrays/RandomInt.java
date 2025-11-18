package RandomAndArrays;

import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(100);  //generates a random number between 0 (inclusive) and 100 (exclusive)

        System.out.println("random number: " + number);
    }
}
