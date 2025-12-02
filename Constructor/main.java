package Constructor;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Constructor
        FluffyGiggles fluffy = new FluffyGiggles();
        SugarFangs sugarFangs = new SugarFangs();

        //System.out.println("Monster Name: " + monster.name); // it is possible if name is public
        System.out.println("Fluffy Name: " + fluffy.getName());
        System.out.println("Sugar Fangs Name: " + sugarFangs.getName());

        ArrayList<BehaviourInterface> monsters = new ArrayList<>();
        monsters.add(fluffy);
        monsters.add(sugarFangs);

        for(BehaviourInterface m : monsters) {
            m.evolve();
        }
        fluffy.attack(sugarFangs);

        fluffy.printStats();
        sugarFangs.printStats();
    }
}
