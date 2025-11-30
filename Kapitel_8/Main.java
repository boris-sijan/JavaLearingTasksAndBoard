package Kapitel_8;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap erstellen
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Schlüssel-Wert-Paare hinzufügen
        hashMap.put("Apfel", 3);
        hashMap.put("Banane", 5);
        hashMap.put("Orange", 2);

        // HashMap anzeigen
        System.out.println(hashMap);

        int anzahlAepfel = hashMap.get("Apfel");
        System.out.println("Anzahl Äpfel: " + anzahlAepfel);

        // Iteration über Schlüssel
        for (String schlüssel : hashMap.keySet()) {
            int wert = hashMap.get(schlüssel);
            System.out.println("Iteration über Schlüssel: " + schlüssel + ": " + wert);
        }

        // Iteration über Schlüssel-Wert-Paare
        for (HashMap.Entry<String, Integer> eintrag : hashMap.entrySet()) {
            String schlüssel = eintrag.getKey();
            int wert = eintrag.getValue();
            System.out.println("Iteration über Schlüssel-Wert-Paare: " + schlüssel + ": " + wert);
        }
        int größe = hashMap.size();
        System.out.println("Größe der HashMap: " + größe);
        
        if (hashMap.containsKey("Apfel")) {
            System.out.println("Der Schlüssel 'Apfel' existiert in der HashMap.");
        } else {
            System.out.println("Der Schlüssel 'Apfel' existiert nicht in der HashMap.");
        }
        //hashMap.remove("Apfel");
    }
}