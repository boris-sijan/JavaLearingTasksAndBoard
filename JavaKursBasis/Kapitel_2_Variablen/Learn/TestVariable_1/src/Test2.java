import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Unesi ime:");      // u istoj liniji zato sto je print
        String name = scanner.nextLine();        
        System.out.println("Hallo, " + name + "!");
        System.out.println("Unesi godine:");
        int age = scanner.nextInt();
        System.out.println("Imate " + age + " godina.");

        System.out.println("Unesi decimalni broj:");
        double decimalNumber = scanner.nextDouble();
        System.out.println("Uneseni decimalni broj je: " + decimalNumber);


        int[] numbers = new int[5];
        System.out.println("Unesi 5 brojeva:");
        for (int i = 0; i < numbers.length-2; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Uneseni brojevi su:");
        for (int number : numbers) {
            System.out.println(number);
        }

        //System.out.println("Unesi decimalni broj:" + numbers[5]);   //van granica niza





        scanner.close();

    }
}
