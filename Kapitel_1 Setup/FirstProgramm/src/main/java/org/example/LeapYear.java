package org.example;


// Schreibe ein Programm welches prüft, ob ein Jahr ein Schaltjahr ist
// Die gregorianische Schalttagsregelung besteht aus folgenden drei einzelnen Regeln:
// 1. Die durch 4 ganzzahlig teilbaren Jahre sind, abgesehen von den folgenden Ausnahmen, Schaltjahre.
// 2. Säkularjahre, also die Jahre, die ein Jahrhundert abschließen (z. B. 1800, 1900, 2100 und 2200),
//    sind, abgesehen von der folgenden Ausnahme, keine Schaltjahre.
// 3. Die durch 400 ganzzahlig teilbaren Säkularjahre, zum Beispiel das Jahr 2000, sind jedoch Schaltjahre.
// Quelle: https://de.wikipedia.org/wiki/Schaltjahr
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Benutzer nach einer Jahreszahl fragen
        System.out.println("Bitte geben Sie eine Jahreszahl ein:");
        int year = sc.nextInt();

        // Überprüfen, ob das Jahr ein Schaltjahr ist
        boolean istSchaltjahr;

        // Überprüfung der Schaltjahrregeln
        if (year % 4 != 0) {
            System.out.println(year + " ist kein Schaltjahr.");
        } else if (year % 100 != 0) {
            System.out.println(year + " ist ein Schaltjahr.");
        } else if (year % 400 == 0) {
            System.out.println(year + " ist Säkularjahr und ein Schaltjahr.");
        } else {
            System.out.println(year + " ist Säkularjahr, aber kein Schaltjahr.");
        }
        sc.close();

    }
}

