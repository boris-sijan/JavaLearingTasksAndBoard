import java.lang.String;

public class App {
    public static void main(String[] args) {

        // TEIL I
        Trainee alice = new Trainee("Alice", "Python Aufbaukurs", 75);
        Trainee bob = new Trainee("Bob", "Data Science und Machine Learning mit Python", 75);


        alice.whoAmI();
        bob.whoAmI();

        alice.addSkillPoints(12);
        bob.addSkillPoints(12);

        alice.whoAmI();
        bob.whoAmI();


        // TEIL II
        Trainer charlie = new Trainer("Charlie", "Java", 75);
        Trainer dave = new Trainer("Dave", "Python", 75);

        charlie.teach();
        dave.teach();

        charlie.whoAmI();
        dave.whoAmI();
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
