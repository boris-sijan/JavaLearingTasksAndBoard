import java.lang.String;

public class YummyBears {
    public static void main(String[] args) {
        String bag = "wOpoRYGWoyworoyOoWyoprorrWYRYrgOgRowwrWgPpypwrPwpwypwRywPYPRrwpYGwpWGwYGgwWOorgpyorPY";

        int white = 0;
        int orange = 0;
        int yellow = 0;
        int red = 0;
        int purple = 0;
        int green = 0;

        // ZÄHLEN
        for (int i = 0; i < bag.length(); i++) {
            char c = Character.toLowerCase(bag.charAt(i));

            switch (c) {
                case 'w': white++; break;
                case 'o': orange++; break;
                case 'y': yellow++; break;
                case 'r': red++; break;
                case 'p': purple++; break;
                case 'g': green++; break;
            }
        }

        int total = white + orange + yellow + red + purple + green;

        // AUSGABE DER ZAHLEN
        System.out.println("Weiß:   " + white);
        System.out.println("Orange: " + orange);
        System.out.println("Gelb:   " + yellow);
        System.out.println("Rot:    " + red);
        System.out.println("Purpur: " + purple);
        System.out.println("Grün:   " + green);
        System.out.println("Gesamt: " + total);

        // ---------------------------
        // QUALITÄTS-PRÜFUNG
        // ---------------------------

        if (white <= red) {
            System.out.println("Nicht bestanden: Es müssen mehr weiße als rote Yummies sein.");
            return;
        }

        if (yellow >= orange) {
            System.out.println("Nicht bestanden: Es müssen weniger gelbe als orange Yummies sein.");
            return;
        }

        if (total < 84 || total > 85) {
            System.out.println("Nicht bestanden: Es müssen 84 bis 85 Yummies in der Tüte sein.");
            return;
        }

        if (white < 10 || orange < 10 || yellow < 10 || red < 10 || purple < 10 || green < 10) {
            System.out.println("Nicht bestanden: Jede Farbe muss mindestens 10 Yummies haben.");
            return;
        }

        if (red + purple > 30) {
            System.out.println("Nicht bestanden: Rot + Purpur dürfen zusammen maximal 30 ergeben.");
            return;
        }

        if (purple > yellow && white <= red) {
            System.out.println("Nicht bestanden: Wenn Purpur > Gelb, dann müssen Weiß > Rot sein.");
            return;
        }

        // Wenn alle Tests bestanden:
        System.out.println("Bestanden!");
    }
}
