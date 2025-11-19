public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Hllllllll");

        Trainee trainee1 = new Trainee("Alice", "Python Aufbaukurs", 75);
        Trainee trainee2 = new Trainee("Bob", "Data Science und Machine Learning mit Python", 66);

        trainee1.whoAmI();
        trainee2.whoAmI();  

        trainee1.addSkillPoints(12);
        trainee2.addSkillPoints(15);

        trainee1.whoAmI();
        trainee2.whoAmI();

        Trainer charlie = new Trainer("Charlie", "Java", 75);
        Trainer dave    = new Trainer("Dave", "Python", 75);

        charlie.teach();
        dave.teach();


    }
}
