package Constructor;

public abstract class BasicMonster { //abstract class cannot be instantiated
    //public String name;    //it can be accessed directly
    private String name;
    private int health = 100;
    private int attack = 12;
    private int defense = 8;

    //Default Constructor
    public BasicMonster() {
        this.name = "Default Monster";
    }

    // Constructor
    public BasicMonster(String name) {
        this.name = name;
    }

    // to access the name
    public String getName() {
        return name;
    }

    // access Health
    public int getHealth() {
        return health;
    }

    //set Health
    public void setHealth(int health) {
        this.health = health;
    }

    // access Attack
    public int getAttack() {
        return attack;
    }

    //set Attack
    public void setAttack(int attack) {
        this.attack = attack;
    }

    // access Defense
    protected int getDefense() {//package protected
        return defense;
    }

    //set Defense
    protected void setDefense(int defense) {
        this.defense = defense;
    }

    public void printStats() {
        System.out.println("Monster Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Defence: " + defense);
    }
    public void scream() {
        System.out.println("ROAR");
    }

    public void attack(BasicMonster target) {
        int damage = this.attack - target.defense;
        if (damage <= 0) {
            return;
        }
        target.health -=damage;

    }
    public abstract String getMonsterType();
}
