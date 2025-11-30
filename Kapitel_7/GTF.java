package Kapitel_7;

// Task-1 Wähle einen zufälligen Film aus der Liste movies und weise diesen der Variable chosen_movie zu
// Task-2 Lass die User*in einen Buchstaben raten. Speichere die Eingabe im Lower-Case in der Variable user_guess
// Task-3 Füge den Buchstaben einer neuen Liste (already_guessed) von Buchstaben die bereits geraten wurden hinzu.
// Task-4 Prüfe jede Stelle im Filmtitel auf den eingegebenen Buchstaben,
// Task 5 Erstelle eine Liste mit "_" korrespondierend zu der Anzahl an Buchstaben
// Der Unterstrich soll nur gesetzt werden, wenn es sich nicht, um eines der erlaubten Symbole (allowed_symbols) handelt
// Diese Symbole sollen direkt, statt dem Unterstrich angezeigt werden:
// " ", ":", "-", "\'", "ä", "ö", "ü", "ß", "&", "!", "?"
// Task 6 tausche bei einem Treffer den entsprechenden Unterstrich durch den passenden Buchstaben aus
// Task 7 - Erstelle eine Variable, welche die Anzahl an Versuchen der User*in speichert.
// Task 8 - Erstelle eine Variable welche festhält, ob die User*in gewonnen hat.
// Task 9 - Erstelle eine Schleife, die die User*in so lange zu neuen Eingaben auffordert,
// bis sie entweder keine Versuche mehr oder die Lösung erraten hat
// Task 10 - Führe das Aufdecken des Buchstaben nur aus, wenn wir den Buchstaben noch nicht geraten haben
// und dieser auch im Titel vorkommt.
// Ziehe andernfalls einen Versuch ab
// Task 11 - Prüfe, ob die User*in gewonnen hat
// Task 12 - Wenn die User*in gewonnen oder verloren hat, wird Sie gefragt, ob Sie eine neue Runde spielen möchte


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class GTF {
    public static ArrayList<String> loadMoviesFromFile(String filename) {
        ArrayList<String> movies = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            movies.addAll(lines);
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei " + filename);
            e.printStackTrace();
        }

        return movies;
    }
    public static void main(String[] args) {
        ArrayList<String> movies = loadMoviesFromFile("D:/smit_java/Kapitel_7/movies.txt");
        ArrayList<String> allowedSymbols = new ArrayList<>(
                Arrays.asList(" ", ":", "-", "'", "ä", "ö", "ü", "ß", "&", "!", "?"));

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    //Task-12
    boolean playAgain = true;
    while (playAgain) {
        // Task-1
        String chosen_movie = movies.get(random.nextInt(movies.size())).toLowerCase();
        System.out.println("Gewählter Film: " + chosen_movie);

        //Task-3
        ArrayList<Character> already_guessed = new ArrayList<>();
        //Task-5
        ArrayList<Character> display_movie = new ArrayList<>();
        for (char c : chosen_movie.toCharArray()) {
            if (allowedSymbols.contains(String.valueOf(c))) {
                display_movie.add(c);
            } else {        
                display_movie.add('_');
            }
        }       
        // Task-7
        int attempts_left = 10;
        // Task-8
        boolean has_won = false;
        // Task-9
        while (attempts_left > 0 && !has_won) {
            System.out.println("Film: " + display_movie);
            System.out.println("Verbleibende Versuche: " + attempts_left);
            System.out.print("Rate einen Buchstaben: ");
            // Task-2
            char user_guess = scanner.nextLine().toLowerCase().charAt(0);
            // Task-10
            if (!already_guessed.contains(user_guess)) {
                already_guessed.add(user_guess);
                boolean correct_guess = false;
                for (int i = 0; i < chosen_movie.length(); i++) {
                    if (chosen_movie.charAt(i) == user_guess) {
                        display_movie.set(i, user_guess);
                        correct_guess = true;

                    }
                }
                if (correct_guess) {
                    System.out.println("Richtig geraten!");
                } else {
                    attempts_left--;
                    System.out.println("Leider falsch.");
                }
                has_won = !display_movie.contains('_');
            } else {
                System.out.println("Buchstabe bereits geraten.");
            }
        }

        // Task-11
        if (has_won) {
            System.out.println("Herzlichen Glückwunsch! Du hast gewonnen.");
        } else {
            System.out.println("Leider verloren. Der Film war: " + chosen_movie);
        }

        // Task-12
        System.out.print("Möchtest du eine neue Runde spielen? (ja/nein): ");
        String response = scanner.nextLine().toLowerCase();
        playAgain = response.equals("ja");
    }

    System.out.println("Danke fürs Spielen!");
}
}