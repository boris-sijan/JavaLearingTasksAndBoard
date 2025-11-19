import java.util.Scanner;
public class MainTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.print("Enter ticket price: ");
		double ticketPrice = scanner.nextDouble();
		
		if (age < 12){
			ticketPrice = ticketPrice * 0.75;
		}
		
		System.out.println("Finnal ticket price is: " + ticketPrice);
        System.out.printf("Finnal ticket price is: %.2f%n", ticketPrice);

        scanner.close();
    }
}
