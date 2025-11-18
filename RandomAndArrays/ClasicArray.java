package RandomAndArrays;

public class ClasicArray {
    public static void main(String[] args) {
        int[] mainArray;
        mainArray = new int[]{1,2,3,4,5};
        System.out.println("Unchanged: " + mainArray[2]);

        mainArray[2] = 10;  //Change value
        System.out.println("Changed: " + mainArray[2]);

        String liste = "1,2,3,4,5";  // split String
        String[] stringArray = liste.split(",");
        System.out.println("String liste: " + stringArray[1]);

        System.out.println("length: " + liste.length());

    }
}
