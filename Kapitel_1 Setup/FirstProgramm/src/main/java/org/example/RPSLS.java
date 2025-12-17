import java.util.Random;
import java.util.Scanner;

public class RPSLS {
    public static void main(String[] args) {
        String[] hands = {
                "STEIN\n\n    _______\n---'   ____\n      (_____)\n      (_____)\n      (____)\n---.__(___)\n",
                "SCHERE\n\n    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)\n",
                "PAPIER\n\n     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)\n",
                "ECHSE\n\n      ___________\n---/'  __________)\n    (_________    \n---.__________)\n",
                "SPOCK\n\n     _______\n---/'   ____)____\n           ______)\n         ________)\n        (_______\n         _______)\n---.__________)\n"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Wähle deine Hand (0=STEIN, 1=SCHERE, 2=PAPIER, 3=ECHSE, 4=SPOCK):");
        int input = Integer.parseInt(scanner.nextLine());

        int randomHand = random.nextInt(hands.length);

        System.out.println("Deine Eingabe:\n" + hands[input]);
        System.out.println("Computer wählt:\n" + hands[randomHand]);

        // Logik odlučivanja pobednika
        if (input == randomHand) {
            System.out.println("Unentschieden!");
        } else if (
                (input == 0 && (randomHand == 1 || randomHand == 3)) || // STEIN schlägt SCHERE und ECHSE
                        (input == 1 && (randomHand == 2 || randomHand == 3)) || // SCHERE schlägt PAPIER und ECHSE
                        (input == 2 && (randomHand == 0 || randomHand == 4)) || // PAPIER schlägt STEIN und SPOCK
                        (input == 3 && (randomHand == 2 || randomHand == 4)) || // ECHSE schlägt PAPIER und SPOCK
                        (input == 4 && (randomHand == 0 || randomHand == 1))    // SPOCK schlägt STEIN und SCHERE
        ) {
            System.out.println("Du gewinnst!");
        } else {
            System.out.println("Computer gewinnt!");
        }

        scanner.close();
    }
}
