import java.lang.String;
import java.util.Scanner;

public class LeapYear1 {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib ein beliebiges Jahr ein: ");
        int jahr = scanner.nextInt();

        String res = ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) ? jahr + " ist ein Schaltjahr." : jahr + " ist kein Schaltjahr.";
        System.out.println(res);

        scanner.close();
    }
}
