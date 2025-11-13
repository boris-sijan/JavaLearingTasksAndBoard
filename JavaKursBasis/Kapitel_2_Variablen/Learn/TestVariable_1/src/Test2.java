import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Geben Sie Ihren Namen ein:");
        String name = scanner.nextLine();
        System.out.println("Hallo, " + name + "!");

    }
}
