import java.lang.String;
public class Trainee {

    String name;
    String course;
    int skill_level;

    // Konstruktor
    public Trainee(String name, String course, int skill_level) {
        this.name = name;
        this.course = course;
        this.skill_level = skill_level;
    }

    // whoAmI
    public void whoAmI() {
        System.out.println("Name: " + name + ", Kurs: " + course + ", Skill-Level: " + skill_level);
    }

    // addSkillPoints
    public void addSkillPoints(int quantity) {
        this.skill_level += quantity;
        System.out.println(quantity + " Skillpunkte hinzugefügt.");
    }
}
