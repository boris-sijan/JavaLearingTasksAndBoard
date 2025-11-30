package Kapitel_6;

public class Trainer extends Trainee {

    //Konstruktor
    public Trainer(String name, String course, int skill_level) {
        super(name, course, skill_level); //poziva konstruktor roditeljske klase.

    }

    public void teach() {
        this.addSkillPoints(3);
        System.out.println("Der Trainer unterrichtet und gibt 3 Skill-Punkte.");

        if (this.course.equals("Java")) {
            System.out.println("Ich möchte das nicht.");
        }else {
            System.out.println("Willkommen zu" + this.course + ".");
        }
    }
}
