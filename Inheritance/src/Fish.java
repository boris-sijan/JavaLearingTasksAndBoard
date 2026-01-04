public class Fish extends Animal {
    private int gills;
    private int finns;

    public Fish(String type, double weight, int gills, int finns) {
        super(type, "small", weight);
        this.gills = gills;
        this.finns = finns;
    }

    private void moveMuscles(){
        System.out.print("muscles moving ");
    }

    private void moveBackFin(){
        System.out.print("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", finns=" + finns +
                "} " + super.toString();
    }
}
