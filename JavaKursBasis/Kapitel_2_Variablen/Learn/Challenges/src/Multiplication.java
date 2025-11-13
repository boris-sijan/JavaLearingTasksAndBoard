public class Multiplication {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int result = a * b;
        System.out.println("Das Ergebnis der Multiplikation von " + a + " und " + b + " ist: " + result);

        System.out.println("Unesi dva broja za mnozenje:");
        java.util.Scanner scanner = new java.util.Scanner(System.in); 
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int userResult = num1 * num2;
        System.out.println("Das Ergebnis der Multiplikation von " + num1 + " und " + num2 + " ist: " + userResult);
        scanner.close();    

    }     
}