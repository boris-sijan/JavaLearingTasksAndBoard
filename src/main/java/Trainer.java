import java.lang.String;
public class Trainer extends Trainee {

    public Trainer(String name, String course, int skill_level) {
        super(name, course, skill_level);
    }

    public void teach() {
        // +3 Skillpunkte für den Trainer
        this.skill_level += 3;

        if (this.course.equals("Java")) { // (this.course.equalsIgnoreCase("Java")) {
            System.out.println("Ich möchte das nicht.");
        } else {
            System.out.println("Willkommen zu '" + this.course + "'");
        }
    }
}
