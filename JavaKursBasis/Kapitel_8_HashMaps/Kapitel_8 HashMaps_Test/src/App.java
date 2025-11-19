import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        // HashMap erstellen
        HashMap<String, Integer> myHashMap = new HashMap<>();

        // Schlùssel-Wert-Paare hinzufùgen
        myHashMap.put("Apfel", 3);
        myHashMap.put("Banane", 5);
        myHashMap.put("Orange", 2);

        // HashMap anzeigen
        System.out.println(myHashMap);

        int anzahlBananen = myHashMap.get("Banane");
        System.out.println("Anzahl der Bananen: " + anzahlBananen);

        for (String schluessel : myHashMap.keySet()) {
            System.out.println(schluessel + ": " + myHashMap.get(schluessel));
        }

        for (HashMap.Entry<String, Integer> eintrag : myHashMap.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }

        int size = myHashMap.size();
        System.out.println("Size of myHashMap: " + size);

        if (myHashMap.containsKey("Apfel")) {
            System.out.println("Apfel exists.");
        }else {
            System.out.println("Apfel don't exists.");
        }

        printHashMap(myHashMap);
        System.out.println("---- Remove Orange ----");
        myHashMap.remove("Orange");
        printHashMap(myHashMap);

    }

    public static void printHashMap(HashMap<String, Integer> hashMap) {
        for (HashMap.Entry<String, Integer> eintrag : hashMap.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }
    }

}