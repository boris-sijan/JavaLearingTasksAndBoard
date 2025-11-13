package Conditions;

// Schreibe ein Programm welches prüft, ob ein Jahr ein Schaltjahr ist
// Die gregorianische Schalttagsregelung besteht aus folgenden drei einzelnen Regeln:
// 1. Die durch 4 ganzzahlig teilbaren Jahre sind, abgesehen von den folgenden Ausnahmen, Schaltjahre.
// 2. Säkularjahre, also die Jahre, die ein Jahrhundert abschließen (z. B. 1800, 1900, 2100 und 2200),
//    sind, abgesehen von der folgenden Ausnahme, keine Schaltjahre.
// 3. Die durch 400 ganzzahlig teilbaren Säkularjahre, zum Beispiel das Jahr 2000, sind jedoch Schaltjahre.
// Quelle: https://de.wikipedia.org/wiki/Schaltjahr

import java.util.Scanner;

public class TaskLeapYear {
    public static void main(String[] args) {

        int[] testYear = new int[6];
        testYear[0] = 1900;
        testYear[1] = 2000;
        testYear[2] = 1999;
        testYear[3] = 2004;
        testYear[4] = 2356;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Year");
        testYear[5] = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            int year = testYear[i];
            if ((year % 400 == 0) && ((year % 4 == 0) || !(year % 100 == 0))) {
                System.out.println("Year " + testYear[i] + " is leap year");
            } else {
                System.out.println("Year " + testYear[i] + " is not leap year");
            }
        }
        sc.close();
    }
}
