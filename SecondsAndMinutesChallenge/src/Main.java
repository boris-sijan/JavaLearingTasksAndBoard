public class Main {
    public static void main(String[] args) {
        System.out.println("7400s:" + getDurationString(7400));
        System.out.println("200m 15s:" + getDurationString(200, 15));
    }

    public static String getDurationString(int seconds){
        if (seconds<0){
            return "Invalid number (" + seconds + "), seconds must be positive integer!";
        }
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        int sec = seconds - hours * 3600 - minutes * 60;
        return hours + "h " + minutes + "m " + sec + "s";
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes<0){
            return "Invalid number (" + minutes + "), minutes must be positive integer!";
        }
        if (seconds<0 || seconds>59){
            return "Invalid number (" + seconds + "), seconds must be between 0 and 59!";
        }
        return getDurationString(minutes * 60 + seconds);
    }
}
