public class Trainer extends Trainee {
    
    public Trainer(String name, String course, Integer skillLevel) {
        super(name, course, skillLevel);
    }

    public void teach() {
        addSkillPoints(3);
        if ("Java".equals(course)) {
            System.out.println("Ich möchte das nicht.");
        } else {
            System.out.println("Willkommen zu '" + course + "'");
        }
    }

}
