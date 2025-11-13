package Variable;

public class HelloWorld {
    public static void main(String[] args) {
        String name = "Baker;Bob";
        System.out.println("name");
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf(";"));
        System.out.println(name.substring(0,name.indexOf(";")));

        int a = 1;
        a ++;
        a += 5;
        System.out.println(a);
    }
}
