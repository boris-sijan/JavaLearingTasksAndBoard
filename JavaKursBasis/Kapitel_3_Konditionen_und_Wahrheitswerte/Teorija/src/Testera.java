public class Testera {
    public static void main(String[] args) throws Exception {
        String a = new String("Hello");
        String b = new String("Hello");

        if (a == b) {
            System.out.println("a ist gleich b"); // Wird nicht ausgeführt
        } else {
            System.out.println("a ist ungleich b"); // Wird ausgeführt
        }

        if (a.equals(b)) {
            System.out.println("a ist gleich b"); // Wird ausgeführt
        } else {
            System.out.println("a ist ungleich b"); // Wird nicht ausgeführt
        }

        int x = 5;
        int y = 10;

        if (x < y) {
            System.out.println("x ist kleiner als y"); // Wird ausgeführt
        } else if (x == y) {
            System.out.println("x ist gleich y"); // Wird nicht ausgeführt
        }        
        else {
            System.out.println("x ist nicht kleiner als y"); // Wird nicht ausgeführt
        }
    }
}
