package Kapitel_6;

public class Trainee {
    private String name;
    protected String course;
    private int skill_level;

    //Konstruktor
    public Trainee(String name, String course, int skill_level) {
        this.name = name;
        this.course = course;
        this.skill_level = skill_level;
    }
    //Gebe einen String aus, welcher name, course und skillLevel beinhaltet
    public String whoAmI() {
        return "Name: " + name + ", Course: " + course + ", Skill Level: " + skill_level;
    }
    //  > Füge dem skillLevel quantity skill-Punkte hinzu
    //  > Gebe mit einem print-Aufruf aus, dass das Objekt zerstört wurde.
    public void addSkillPoints(int quantity) {
        this.skill_level += quantity;
        System.out.println("Objekt wurde zerstört");
    }
}
