package Kapitel_8.SpellCasterMaste;

import java.util.List;

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
                    System.out.println("Enter spell name:");
                    String spellName = scanner.nextLine();
                    System.out.println("Enter spell description:");
                    String spellDescription = scanner.nextLine();
                    spellBook.addSpell(spellName, spellDescription);
                    System.err.println("Spell added!");
                    System.out.println(spellBook);
                    break;
                case "r":
                    String spellToRemove;
                    // ask for spell to be removed
                    System.out.println("Enter spell name to remove:");
                    spellToRemove = scanner.nextLine();
                    if (spellBook.getSpell(spellToRemove) == null) {
                        System.out.println("Spell not found!");
                        break;
                    }
                    spellBook.removeSpell(spellToRemove);
                    System.err.println("Spell removed!");
                    System.out.println(spellBook);
                    break;
                case "s":
                    // use spellBook.getSpell() to get a specific spell;
                    System.out.println("Enter spell name to search:");
                    String spellToSearch = scanner.nextLine();
                    String spellDescription1 = spellBook.getSpell(spellToSearch);
                    if (spellDescription1 != null) {
                        System.out.println("Spell found: " + spellToSearch + " - " + spellDescription1);
                    } else {
                        System.out.println("Spell not found!");
                    }
                    break;
                case "l":
                    // use a for / for-each loop to show all spells
                    List<String> spells = spellBook.getSpellNames();
                    System.out.println("All spells in the spell book:");
                    for (String spell : spells) {
                        System.out.println(spell);
                    }
                    break;
                case "v":
                    System.out.println("Bye!");
                    break;
            }
        }
        scanner.close();
    }
}