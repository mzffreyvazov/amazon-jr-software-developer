import java.util.Scanner;
import java.util.Arrays; // Import Arrays class for validation

public class CoffeeMachine {

    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            // Read user's choice
            int choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    // Initialize the name of Espresso
                    String espressoName = "Espresso";

                    // Initialize the price of Espresso per serving
                    double espressoPrice = 2.50;

                    // Ask the user for the type of roast and store it in espressoRoast
                    System.out.print("What Roast would you like? (light, medium, dark): ");
                    String espressoRoast = keyboard.next();
                    // Validate roast input
                    while (!Arrays.asList("light", "medium", "dark").contains(espressoRoast.toLowerCase())) {
                        System.out.print("Invalid roast. Please choose light, medium, or dark: ");
                        espressoRoast = keyboard.next();
                    }

                    // Ask the user for the number of shots and store it in numberOfShots
                    System.out.print("How many servings would you like? (a number please): ");
                    int numberOfShots = keyboard.nextInt();

                    // Create an object of Espresso class using the parameterized constructor
                    Espresso espresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);
                    // Call the grindBeans() method on the Espresso object
                    espresso.grindBeans();
                    // Call the brewCoffee() method on the Espresso object
                    espresso.brewCoffee();  
                    // Call the printInfo() method on the Espresso object
                    espresso.printInfo();
                    // Call the printEspressoDetails method on the Espresso object
                    espresso.printEspressoDetails();
                    break;
                case 2:

                    // Initialize the name of Latte
                    String latteName = "Latte";

                    // Initialize the price of Latte
                    double lattePrice = 3.50;

                    // Ask the user for the type of roast and store it in latteRoast
                    System.out.print("What Roast would you like? (light, medium, dark): ");
                    String latteRoast = keyboard.next();
                    // Validate roast input
                    while (!Arrays.asList("light", "medium", "dark").contains(latteRoast.toLowerCase())) {
                        System.out.print("Invalid roast. Please choose light, medium, or dark: ");
                        latteRoast = keyboard.next();
                    }

                    // Ask the user for the milk type and store it in milkType
                    System.out.print("What milk type would you like? (whole, skim, almond, oat): ");
                    String milkType = keyboard.next();
                    // Validate milk type input
                    while (!Arrays.asList("whole", "skim", "almond", "oat").contains(milkType.toLowerCase())) {
                        System.out.print("Invalid milk type. Please choose whole, skim, almond, or oat: ");
                        milkType = keyboard.next();
                    }

                    // Ask the user if they want syrup or not
                    System.out.print("Would you like syrup? (yes/ no): ");
                    String syrupWanted = keyboard.next();

                    String syrupFlavor = "no";
                    // if syrupWanted is yes, Ask the user for the syrup flavor and store it in syrupFlavor
                    if(syrupWanted.equalsIgnoreCase("yes")){ // Use equalsIgnoreCase for flexibility
                        System.out.print("Which flavor would you like? (vanilla, caramel, hazelnut): ");
                        syrupFlavor = keyboard.next();
                        // Validate syrup flavor input
                        while (!Arrays.asList("vanilla", "caramel", "hazelnut").contains(syrupFlavor.toLowerCase())) {
                            System.out.print("Invalid syrup flavor. Please choose vanilla, caramel, or hazelnut: ");
                            syrupFlavor = keyboard.next();
                        }
                    } else {
                        syrupFlavor = "no"; // Ensure syrupFlavor is "no" if user didn't explicitly say "yes"
                    }

                    // Create an object of Latte class using the parameterized constructor
                    // Pass the latteName, latteRoast, lattePrice, milkType, and syrupFlavor as arguments in the correct order
                    Latte latte = new Latte(latteName, latteRoast, lattePrice, milkType, syrupFlavor);
                    // Call the grindBeans() method on the Latte object
                    latte.grindBeans();
                    // Call the brewCoffee() method on the Latte object
                    latte.brewCoffee();
                    // Call the printInfo() method on the Latte object
                    latte.printInfo();
                    // Call the printLatteDetails() method on the Latte object
                    latte.printLatteDetails();
                    break;
                case 3:
                    System.out.println("Thank you for using the Coffee Machine!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
