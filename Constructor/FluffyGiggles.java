package Constructor;

public class FluffyGiggles extends BasicMonster implements BehaviourInterface { // parent class
    public FluffyGiggles() {
        super("Fluffy Giggles"); // call parent constructor
        this.setHealth(80);
    }
    @Override
    public void scream() {
        System.out.println("Test");
    }

    @Override
    public String getMonsterType() {
        return "Rock";
    }

    @Override
    public void evolve() {
        System.out.println(this.getName() + " is evolving to Fluffy Snuggles");
        this.setHealth(this.getHealth() + 30);
    }

    @Override
    public void taunt() {
        System.out.println(this.getName() + " says: You can't catch me!");
    }
}
