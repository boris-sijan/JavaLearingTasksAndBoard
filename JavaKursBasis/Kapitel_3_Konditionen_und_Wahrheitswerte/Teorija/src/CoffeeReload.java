import java.util.Scanner;

public class CoffeeReload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Odaberi kafu: ");
        System.out.println("1. Kaffee       = 140 ml");
        System.out.println("2. Espresso     = 20 ml");
        System.out.println("3. Americano    = 450 ml");
        System.out.println("4. Alle anderen = 200 ml");

        int kolicina = 0;    
        int zapremina = 0;    
        switch (scanner.nextInt()) {
            case 1 -> zapremina = 140;
            case 2 -> zapremina = 20;    
            case 3 -> zapremina = 450;
            case 4 -> zapremina = 200;
            default -> {System.out.println("Nepostojeca opcija!");
                        zapremina = 0;}
        }
        
        if (zapremina == 0) {
            System.out.println("Kafa nije izabrana.");
        }else{
            while (kolicina < zapremina){
                System.out.println(kolicina + "ml. Puni se...");
                kolicina += 15;
            }           
            System.out.println("Kafa je spremna!");
        }

        

        scanner.close();

    }
}
