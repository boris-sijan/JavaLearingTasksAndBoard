package Functions;

public class Function1 {
//    private static int add(int a, int b) {
//        if (a <= 0) {
//           return b;
//        }
//        return a + b;
//    }
    public static void main(String[] args) {
            //int result = add(-14,2);
            //System.out.println((result));
        sayHello(true);
    }
    private static void sayHello(boolean isAdmin) {
        if (!isAdmin)
            return;
        System.out.println("Hello");  // void: without return value
    }
}
