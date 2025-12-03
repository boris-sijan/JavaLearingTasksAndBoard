public class Wahrheitswerte {
    public static void main(String[] args) {

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
    }
}
