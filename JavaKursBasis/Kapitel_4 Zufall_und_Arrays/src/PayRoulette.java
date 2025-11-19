import java.util.Random;
import java.util.Scanner;

public class PayRoulette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //----------------------------------------------------------------------------------------
        int[] testArray;
        testArray = new int[5];
        testArray[0] = 10;
        System.out.println("\nTest array first element: " + testArray[0]);

        int[] testArray1 = new int[5];;
        testArray1[1] = 15;
        System.out.println("\nTest1 array first element: " + testArray1[1]);

        int [] testArray2 = new int[] {1,2,3,4,5};
        System.out.println("\nTest1 array first element: " + testArray2[2]);
        //----------------------------------------------------------------------------------------

        System.out.print("Enter player names, separted with , : ");

        String names = scanner.nextLine();
        String[] nameArray = names.split(",");

        int numberOfPlayers = nameArray.length;

        System.out.println("The players are: " + numberOfPlayers);
        for (String name : nameArray) {
            name = name.trim();         
            System.out.println(name);
        }

        int loserIndex = random.nextInt(numberOfPlayers);
        System.out.print("Bill will pay: " + nameArray[loserIndex].trim());


        


        scanner.close();    
    }   

}
