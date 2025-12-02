package Loop;

import java.util.ArrayList;

public class WhileLoop {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Ivan");
        liste.add("Sinisa");
        liste.add("Milan");
        liste.add("Stefan");

        while (!liste.isEmpty()) {
            //    System.out.println(liste.removeFirst());
            //    if (liste.getFirst().equals("Milan")) {
            //        break;  // stop the loop completely.
            //   }
            if (liste.getFirst().equals("Milan")) {
                continue;  // skip this round, but keep looping.
            }
            System.out.println(liste.removeFirst());
        }
    }
}
