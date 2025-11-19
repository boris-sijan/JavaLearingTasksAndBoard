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
    // fajl movie.txt mora biti u UTF-8 enkodingu
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
        ArrayList<String> movies = loadMoviesFromFile("Kapitel_7_Breaking_down_complexity\\src\\movies.txt"); 
        ArrayList<String> allowedSymbols = new ArrayList<>(Arrays.asList(" ", ":", "-", "'", "ä", "ö", "ü", "ß", "&", "!", "?"));
        
        System.out.println("Willkommen zu 'Guess the Film'!");
        System.out.println(movies.size() + " Filme wurden geladen.");

        /*for (String movie : movies) {
            System.out.println(movie);
        } */
        Scanner scanner = new Scanner(System.in);
        int newQuiz = 1;

        while (newQuiz == 1) {
            Random rand = new Random();
            String chosen_movie = movies.get(rand.nextInt(movies.size())).toLowerCase();

            ArrayList<String> already_guessed = new ArrayList<>();
            ArrayList<String> display_movie = new ArrayList<>();

            for (int i = 0; i < chosen_movie.length(); i++) {
                String currentChar = String.valueOf(chosen_movie.charAt(i));
                if (allowedSymbols.contains(currentChar)) {
                    display_movie.add(currentChar);
                } else {
                    display_movie.add("_");
                }
            }

            int attempts_left = 10;
            boolean has_won = false;

            while (attempts_left > 0 && !has_won) {
                System.out.println("Film: " + String.join(" ", display_movie));
                System.out.println("Verbleibende Versuche: " + attempts_left);
                System.out.print("Bitte einen Buchstaben raten: ");
                String user_guess = scanner.nextLine().toLowerCase();

                if (!already_guessed.contains(user_guess)) {
                    already_guessed.add(user_guess);

                    if (chosen_movie.contains(user_guess)) {
                        for (int i = 0; i < chosen_movie.length(); i++) {
                            if (String.valueOf(chosen_movie.charAt(i)).equals(user_guess)) {
                                display_movie.set(i, user_guess);
                            }
                        }
                    } else {
                        attempts_left--;
                    }
                } else {
                    System.out.println("Diesen Buchstaben hast du bereits geraten.");
                }

                if (!display_movie.contains("_")) {
                    has_won = true;
                }
            }

            if (has_won) {
                System.out.println("Herzlichen Glückwunsch! Du hast den Film erraten: " + chosen_movie);
            } else {
                System.out.println("Leider verloren! Der Film war: " + chosen_movie);
            }

            System.out.print("Möchtest du eine neue Runde spielen? (1 für Ja, 0 für Nein): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Bitte gib 1 (Ja) oder 0 (Nein) ein:");
                scanner.next(); // ungültige Eingabe überspringen
            }
            newQuiz = scanner.nextInt();
            scanner.nextLine(); // Clear the newline characterr
        }

        scanner.close();
    }
}