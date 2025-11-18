package RandomAndArrays;

// Schreibe ein Programm, welches per Zufall "Kopf" oder "Zahl" ausgibt
// Benutze hierzu java.util.Random und generiere damit entweder einer 1 oder eine 0
// 1 = Kopf
// 0 = Zahl

import java.util.Random;

public class TaskCoinFlip {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean coin = rnd.nextBoolean();

        if(coin) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
        //2nd Solution
        //int coin = rnd.nextInt(2) //0 or 1
        //if(coin == 0) {
        //    System.out.println("Heads");
        //} else {
        //    System.out.println("Tails");
        //}

    }
}



