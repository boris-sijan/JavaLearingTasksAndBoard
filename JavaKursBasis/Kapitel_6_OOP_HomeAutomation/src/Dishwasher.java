public class Dishwasher extends Appliance implements SelfCleaningInterface {

    public Dishwasher(String name) {
        super(name);
    }

    @Override
    public boolean checkIfDirty() {
        return runCyclesCount > 10;
    }

    @Override
    public void startCleaning() {
        System.out.println(name + " wird gereinigt.");
        runCyclesCount = 0;
    }
}