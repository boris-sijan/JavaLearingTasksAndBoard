public abstract class Appliance {
    protected String name;
    protected int runCyclesCount = 0;

    public Appliance(String name) {
        this.name = name;
    }

    public int getRunCyclesCount() {
        return runCyclesCount;
    }

    public void addRunCycle() {
        runCyclesCount++;
    }
}