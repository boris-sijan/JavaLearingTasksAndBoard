public class Trainee {
    String course;
    String name;
    Integer skillLevel;

    public Trainee(String name, String course, Integer skillLevel) {
        this.name = name;
        this.course = course;
        this.skillLevel = skillLevel;
    }

    public void whoAmI() {
        System.out.println("I am " + name + ", enrolled in " + course + " with skill level " + skillLevel + ".");
    }

    public void addSkillPoints(int quantity) {
        skillLevel += quantity;
        System.out.println(name + "'s skill level improved to " + skillLevel + ".");
    }



}
