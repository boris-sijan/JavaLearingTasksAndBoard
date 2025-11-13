package Variable;

public class Array {
    public static void main(String[] args) {
// Erstelle ein Array mit 5 Ganzzahlen
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 5;

        System.out.println(numbers[0]); // 1
        System.out.println(numbers[1]); // 2
        System.out.println(numbers[2]); // 5
        System.out.println(numbers[3]); // 0
        System.out.println(numbers[4]); // 0
        //System.out.println(numbers[5]); // IndexOutOfBoundsException
    }
}