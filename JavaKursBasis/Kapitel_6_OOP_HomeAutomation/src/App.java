public class App {
    public static void main(String[] args) throws Exception {
        Dishwasher  dishwasher  = new Dishwasher("Dishwasher");
        CoffeeMaker coffeeMaker = new CoffeeMaker("Coffee Maker");

        dishwasher.runCyclesCount = 15;

        if (dishwasher.checkIfDirty()) {
            dishwasher.startCleaning();
        } else {
            System.out.println(dishwasher.name + " muss nicht gereinigt werden.");
        }

        if (coffeeMaker.checkIfDirty()) {
            coffeeMaker.startCleaning();
        } else {
            System.out.println(coffeeMaker.name + " muss nicht gereinigt werden.");
        }
    }
}
