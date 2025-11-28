import java.io.IOException;
import java.lang.String;
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

        Scanner scanner = new Scanner(System.in);
        // ArrayList<String> movies = loadMoviesFromFile("./movies.txt");
        ArrayList<String> movies = loadMoviesFromFile("C:/Finnova/Java/Git/zoto-develop/src/movies.txt");

        ArrayList<String> allowedSymbols = new ArrayList<>(
                Arrays.asList(" ", ":", "-", "'", "ä", "ö", "ü", "ß", "&", "!", "?"));

        boolean playAgain = true;

        while (playAgain) {

            // -------------------------
            // Task 1: Film auswählen
            // -------------------------
            Random rnd = new Random();
            String chosen_movie = movies.get(rnd.nextInt(movies.size())).toLowerCase();

            System.out.println("\n--- Neues Spiel ---");
            System.out.println("Film wurde ausgewählt!");

            // -------------------------
            // Task 3: Liste der guess letters
            // -------------------------
            ArrayList<String> already_guessed = new ArrayList<>();

            // -------------------------
            // Task 5: Liste mit Unterstrichen
            // -------------------------
            ArrayList<String> hidden = new ArrayList<>();

            for (int i = 0; i < chosen_movie.length(); i++) {
                String ch = String.valueOf(chosen_movie.charAt(i));

                if (allowedSymbols.contains(ch)) {
                    hidden.add(ch); // Symbol sichtbar lassen
                } else {
                    hidden.add("_");
                }
            }

            // Task 7 & 8:
            int tries = 10;
            boolean won = false;

            // -------------------------
            // Task 9: Spiel-Schleife
            // -------------------------
            while (tries > 0 && !won) {

                System.out.println("\nAktueller Stand: " + String.join(" ", hidden));
                System.out.println("Bereits geraten: " + already_guessed);
                System.out.println("Verbleibende Versuche: " + tries);

                // Task 2: User eingabe
                System.out.print("Bitte einen Buchstaben eingeben: ");
                String user_guess = scanner.nextLine().toLowerCase();

                // Validierung
                if (user_guess.length() != 1) {
                    System.out.println("Bitte genau einen Buchstaben eingeben!");
                    continue;
                }

                // Task 10: Wenn schon geraten → Versuch abziehen
                if (already_guessed.contains(user_guess)) {
                    System.out.println("Buchstabe wurde bereits geraten!");
                    tries--;
                    continue;
                }

                // Buchstaben zur Liste hinzufügen
                already_guessed.add(user_guess);

                boolean hit = false;

                // Prüfen ob im Titel
                for (int i = 0; i < chosen_movie.length(); i++) {
                    if (String.valueOf(chosen_movie.charAt(i)).equals(user_guess)) {
                        hidden.set(i, user_guess); // Aufdecken
                        hit = true;
                    }
                }

                if (!hit) {
                    tries--;
                    System.out.println("Leider falsch!");
                }

                // Task 11: Prüfen ob gewonnen
                if (!hidden.contains("_")) {
                    won = true;
                }
            }

            // -------------------------
            // Ergebnis
            // -------------------------
            System.out.println("\n--- Spielende ---");
            if (won) {
                System.out.println("Glückwunsch! Du hast den Film erraten:");
            } else {
                System.out.println("Keine Versuche mehr! Der Film war:");
            }

            System.out.println(">>> " + chosen_movie.toUpperCase());

            // -------------------------
            // Task 12: Neue Runde?
            // -------------------------
            System.out.print("\nNochmal spielen? (j/n): ");
            String again = scanner.nextLine().toLowerCase();

            playAgain = again.equals("j");
        }

        System.out.println("\nDanke fürs Spielen!");
        scanner.close();
    }
}
