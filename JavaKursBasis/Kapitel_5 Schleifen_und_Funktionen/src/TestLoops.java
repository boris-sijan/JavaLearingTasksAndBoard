import java.util.ArrayList;

public class TestLoops {
    public static void main(String[] args) throws Exception {
        System.out.println("TestLoops gestartet");

        ArrayList<String> fruechte = new ArrayList<String>();
        fruechte.add("Apfel");
        fruechte.add("Birne");
        fruechte.add("Kirsche");

        for (String frucht : fruechte) {
            System.out.println(frucht);
        }
        
        System.out.println("Summe: " + summe(3, 7));

    }

    static int summe(int a, int b) {
        int ergebnis = a + b;
        return ergebnis;
    }
}
