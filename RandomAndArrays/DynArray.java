package RandomAndArrays;

import java.util.ArrayList;

public class DynArray {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Student 1");
        liste.add("Student 2");
        liste.add("Student 3");
        liste.add("Student 4");
        liste.add(0, "Student 0"); // or liste.addFirst("Student 0");

        System.out.println(liste.get(1));

    }
}
