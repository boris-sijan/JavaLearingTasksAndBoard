public class Main {
    public static void main(String[] args) {
        /*int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        int j =1;
        while(true) {
            System.out.println(j);
            j++;
            if (j > 5){
                break;
            }
        }

        int k = 1;
        boolean isReady = true;
        do {
            System.out.println(k);
            k++;
            if (k > 5){
                isReady = false;
            }
        } while(isReady);*/

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
