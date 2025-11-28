public class Main {
    public static void main(String[] args) {
        /*int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }*/
        /*int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3 or 4 or 5");
                break;
            default:
                System.out.println("Value is not 1 or 2 or 3 or 4 or 5");
        }*/
        int switchValue = 2;
        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> System.out.println("Value is 3 or 4 or 5");
            default -> System.out.println("Value is not 1 or 2 or 3 or 4 or 5");
        }

        String month = "XYZ"; //"OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
