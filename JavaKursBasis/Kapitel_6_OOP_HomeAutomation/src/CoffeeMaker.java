import java.util.Random;

public class CoffeeMaker extends Appliance implements SelfCleaningInterface {

    public CoffeeMaker(String name) {
        super(name);
    }

    @Override
    public boolean checkIfDirty() {
        return new Random().nextBoolean();
    }

    @Override
    public void startCleaning() {
        System.out.println(name + " wird gereinigt.");
        runCyclesCount = 0;
    }
}