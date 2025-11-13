package Conditions;

public class NestedIf {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if(1 < b) {
            if(a > 0) {
                System.out.println("a is less than b and greater than 0");
            }
        }
    }
}
