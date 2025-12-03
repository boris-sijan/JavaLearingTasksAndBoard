import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi godinu: ");
        int godina = scanner.nextInt();

        if ((godina % 400 == 0) || (godina % 4 == 0 && godina % 100 != 0)) {
            System.out.println(godina + " je prestupna godina.");
        } else {
            System.out.println(godina + " nije prestupna godina.");
        }
    }
}
