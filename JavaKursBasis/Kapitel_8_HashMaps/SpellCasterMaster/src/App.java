// Schreibe eine App die es Ron erlaubt, in seinem Zauberspruchbuch
// * Einen vorhandenen Eintrag anzuzeigen
// * Alle vorhandenen Zauberspruchnamen auszugeben
// * Einen neuen Zauberspruch einzutragen
// * Einen Zauberspruch zu entfernen
// * Nach dem das Programm die gweünschte Aufgabe erledigt hat, soll es erneut Fragen, welche Aktion ausgeführt werden
//   soll, bis die Nutzer*in sich entscheidet das Programm zu verlassen

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        SpellBook spellBook = new SpellBook();

        String action = "";

        while (!action.equals("v")) {
            System.out.println("Hi Ron! What do you want to do?");
            action = scanner.nextLine();

            switch (action) {
                case "a":
                    // ask for spell name and description
                    System.out.println("Enter the name of the new spell:");
                    String spellName = scanner.nextLine();
                    System.out.println("Enter the description of the new spell:");
                    String spellDescription =scanner.nextLine();
                        
                    spellBook.addSpell(spellName, spellDescription);
                    break;
                case "r":
                    // ask for spell to be removed
                    String spellToRemove = scanner.nextLine();
                    spellBook.removeSpell(spellToRemove);
                    break;
                case "s":
                    System.out.println("Say spell:");
                    System.out.println(spellBook.getSpell(scanner.nextLine()));
                    // use spellBook.getSpell() to get a specific spell;
                    break;
                case "l":
                    // use a for / for-each loop to show all spells
                    System.out.println(spellBook.toString());
                    break;
                case "v":
                    System.out.println("Bye!");
                    break;
            }
        }
        scanner.close();
    }
}