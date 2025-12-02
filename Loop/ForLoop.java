package Loop;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Ivan");
        liste.add("Sinisa");
        liste.add("Milan");
        liste.add("Stefan");

        for (int i = 0; i < liste.size(); i++) {  // with index
            System.out.println(liste.get(i));
        }
        //for (String kunde : liste) {  // without index
        //    System.out.println(kunde);
        //}
    }
}
