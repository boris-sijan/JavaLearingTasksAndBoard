package Constructor;

public class SugarFangs extends BasicMonster implements BehaviourInterface{
    public SugarFangs() {
        super("Sugar Fangs");
        this.setHealth(120);
        this.setAttack(15);
        this.setDefense(5);
    }

    @Override
    public String getMonsterType() {
        return "Flying";
    }

    @Override
    public void evolve() {
        System.out.println(this.getName() + " is evolving to Sugar Bites!");
        this.setAttack(this.getAttack() + 5);
    }

    @Override
    public void taunt() {
        System.out.println(this.getName() + " says: You can't catch me");
    }
}
