public class Latte extends Coffee {
    private String milkType; // Type of milk used in the latte
    private String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price); // Call the constructor of the Coffee class
        this.milkType = milkType; // Set the type of milk
        this.syrupFlavor = syrupFlavor; // Set the syrup flavor
    }

    public void printLatteDetails() {
        System.out.println("You ordered a " + name + " with a " + roast + " roast and " + milkType + " milk.");
        System.out.println("The total price is: $" + price);
    }
}