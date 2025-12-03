public class Konditionen {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a < b) {
            System.out.println("a ist kleiner als b");
        } else if (a > b) {
            System.out.println("a ist größer als b");
        } else {
            System.out.println("a ist gleich b");
        }
        //Ternärer Operator
        String result = (a < b) ? "a ist kleiner als b" : "a ist größer als b";
        System.out.println(result);

        //switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            // Weitere Fälle...
            default:
                System.out.println("Ungültiger Tag");
        }
    }
}
