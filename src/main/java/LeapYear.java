import java.lang.String;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Gib ein beliebiges Jahr ein: ");
                int jahr = scanner.nextInt();

                // Prüfen, ob das Jahr ein Schaltjahr ist
                if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
                    System.out.println(jahr + " ist ein Schaltjahr.");
                } else {
                    System.out.println(jahr + " ist kein Schaltjahr.");
                }

                scanner.close();
            }
        }
