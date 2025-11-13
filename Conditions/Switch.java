package Conditions;

public class Switch {
    public static void main(String[] args) {
        int day = 3;
        String dayOfWeek = switch(day) {
            case 6,7 -> "Weekend";
            case 1,2,3,4,5 -> "Workday";
            default -> "?";
        };
        System.out.println(dayOfWeek);
    }
}
