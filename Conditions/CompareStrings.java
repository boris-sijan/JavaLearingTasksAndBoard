package Conditions;

public class CompareStrings {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = new String("Hello");
        if (a == b){
            System.out.println("a is equal to b");  // will not be executed
        } else {
            System.out.println("a is not equal to b");  // will be executed
        }
        if (a.equals(b)) {
            System.out.println("a is equal to b");    // will be executed
        }  else {
            System.out.println("a is not equal to b");    // will not be executed
        }
    }
}
