package Conditions;

// Erstelle einen Kaffeeautomaten welches aufhört die Tasse zu befüllen,
// wenn der Tassenfüllstand 150ml erreicht ist.
// Gebe dann "Der Kaffee ist fertig" aus. Gebe andernfalls "Fülle auf..." aus.

import java.util.Scanner;
public class TaskCoffee {
    public static void main(String[] args) {
        // Scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie hoch ist der Tassenfüllstand?: ");
        int fillLevel = sc.nextInt();
        if (fillLevel >= 150) {
            System.out.println("Kaffee ist fertig");
        } else {
            System.out.println("Fülle auf...");
        }
        //close Scanner
        sc.close();
    }
}
