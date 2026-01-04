public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print Bulleted List:\n" +
                "\t\u2002 First Point\n" +
                "\t\t\u2002 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print Bulleted List:
                    \u2002 First Point
                        \u2002 Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.println("Your age is " + age);
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2025 - 35;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i<=10000; i*=10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
