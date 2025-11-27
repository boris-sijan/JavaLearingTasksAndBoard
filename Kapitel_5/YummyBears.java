package Kapitel_5;

public class YummyBears {
      public static void main(String[] args) {
        String bag = "wOpoRYGWoyworoyOoWyoprorrWYRYrgOgRowwrWgPpypwrPwpwypwRywPYPRrwpYGwpWGwYGgwWOorgpyorPY";

        int white = 0;
        int orange = 0;
        int yellow = 0;
        int red = 0;
        int purple = 0;
        int green = 0;

        
        for (int i = 0; i < bag.length(); i++) {
            char bear = bag.charAt(i);
            switch (Character.toLowerCase(bear)) {
                case 'w':
                    white++;
                    break;
                case 'o':
                    orange++;
                    break;
                case 'y':
                    yellow++;
                    break;
                case 'r':
                    red++;
                    break;
                case 'p':
                    purple++;
                    break;
                case 'g':
                    green++;
                    break;
            }
        }

        System.out.println("Weiße Bären: " + white);
        System.out.println("Orange Bären: " + orange);
        System.out.println("Gelbe Bären: " + yellow);
        System.out.println("Rote Bären: " + red);
        System.out.println("Lila Bären: " + purple);
        System.out.println("Grüne Bären: " + green);

    if ((white > red) &&
        (orange > yellow) &&
        (bag.length() <= 85 && bag.length() >= 84) &&
        (white >= 10 && red >= 10 && orange >= 10 && yellow >= 10 && purple >= 10 && green >= 10) &&
        (red + purple <= 30) &&
        (purple <= yellow || white > red)) {
        System.out.println("Yummy Bears!");
    } else {
        System.out.println("Oh no, not Yummy Bears!");
    }
    }
}