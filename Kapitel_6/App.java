package Kapitel_6;

public class App {
    public static void main(String[] args) throws Exception {
        Trainee alice = new Trainee("Alice", "Python Aufbaukurs", 75);
        Trainee bob = new Trainee("Bob", "Data Science und Machine Learning mit Python", 50);

        System.out.println(alice.whoAmI());
        System.out.println(bob.whoAmI());

        alice.addSkillPoints(12);
        bob.addSkillPoints(12);

        System.out.println(alice.whoAmI());
        System.out.println(bob.whoAmI());

        Trainer charlie = new Trainer("Charlie", "Java", 75);
        Trainer dave = new Trainer("Dave", "Python", 75);

        charlie.teach();
        dave.teach();

        System.out.println(charlie.whoAmI());
        System.out.println(dave.whoAmI());
    }

    public static void print(String message) {

        System.out.println(message);

    }
}