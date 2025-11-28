public class Main {
    public static void main(String[] args) {
        System.out.println("Height in centimeters:" + convertToCentimeters(5, 10));
    }

    public static double convertToCentimeters(int heightInches){
        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches){
        return convertToCentimeters(heightFeet * 12 + heightInches);
    }
}
