package Kapitel_6.HomeAutomation;

public abstract class Appliance {
    protected String name;
    protected int runCycleCount;

    public Appliance(String name) {
        this.name = name;
        this.runCycleCount = 0;
    }

    public int getRunCycleCount() {
        return runCycleCount;
    }

    public void addRunCycle() {
        runCycleCount++;
    }
}
