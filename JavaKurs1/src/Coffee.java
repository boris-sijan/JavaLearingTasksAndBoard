public class Coffee {
    public static void main(String[] args) {

        int fillLevel = 0; // der aktuelle Kaffeestand in ml

        while (fillLevel < 150) {
            System.out.println("Fülle auf...");
            fillLevel += 50; // wir füllen in 50-ml-Schritten auf
         }
        System.out.println("Der Kaffee ist fertig");
    }
}
