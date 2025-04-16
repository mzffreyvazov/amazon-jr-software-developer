public class Espresso extends Coffee{
    private int numberOfShots; // Number of shots of espresso

    public Espresso(String name, String roast, double price, int numberOfShots) {
        super(name, roast, price); // Call the constructor of the Coffee class
        this.numberOfShots = numberOfShots; // Set the number of shots
    }

    public void printEspressoDetails() {
        System.out.println("You ordered " + numberOfShots + " shots of " + name + " with a " + roast + " roast.");
        System.out.println("The total price is: $" + (price * numberOfShots));

    }
}
