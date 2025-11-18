package RandomAndArrays;

import java.util.ArrayList;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Ivan");
        liste.add("Sinisa");
        liste.add("Milan");
        liste.add("Stefan");
        liste.add(0, "Student 0"); // or liste.addFirst("Student 0");

        //Stream<String> myStream = liste.stream().filter(entry -> entry.startsWith("S")); //Filter names that start with S
        //var array = myStream.toArray();  //var - no variable type defined.

        //var myStream = liste.stream().filter(entry -> entry.startsWith("S")).map(entry -> entry.length()); //Filter names that start with S, returns the length of each
        //var array = myStream.toArray();  //var - no variable type defined.

        //for (Object entry: array){
            //System.out.println(entry);
        //}
        liste.stream()
                .filter(entry -> entry.startsWith("S"))
                //.map(entry -> entry.length())
                .sorted()
                .forEach(element -> System.out.println((element)));
    }
}