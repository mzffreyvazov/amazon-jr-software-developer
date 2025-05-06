import java.util.Scanner;

public class SideKick extends Robot {
    Scanner keyboard;

    /** default constructor **/
    public SideKick() {
        super();
        keyboard = new Scanner(System.in);
    }

    // method to set choice
    @Override
    public void setChoice() {
        System.out.println("***** SideKick Menu *****");
        System.out.println("1. Cleaning");
        System.out.println("2. Cooking");
        System.out.println("3. Re-charge");

        System.out.println("Enter choice(1-3):");
        int choice = keyboard.nextInt();

        // Use setter method
        setModeOfOperation(choice);
    }

    // method to take action
    @Override
    public void takeAction() {
        // Use getter method
        switch (getModeOfOperation()) {
            case 1:
                cleanHouse();
                System.out.println("SideKick cleaning completed.");
                break;
            case 2:
                cookFood();
                System.out.println("SideKick cooking completed.");
                break;
            case 3:
                rechargeBattery();
                System.out.println("SideKick recharged battery.");
                break;
            default:
                System.out.println("SideKick does not support the operation.");
        }
    }

    // method to clean
    private void cleanHouse() {
        System.out.println("Get the vacuum cleaner.....");
        System.out.println("Put the dust bag in vacuum.....");
        System.out.println("Go to Living room and clean.....");
        System.out.println("Go to bedroom and clean.....");
        System.out.println("Go to kitchen and clean.....");
        System.out.println("Go to bathroom and clean.....");
        System.out.println("Retrieve dust bag from vacuum cleaner and put in bin.....");
        System.out.println("Go back to Toni.....");
    }

    // method to cook
    private void cookFood() {
        System.out.println("Move to the kitchen...........");
        System.out.println("Get the vegetables...........");
        System.out.println("Cut the vegetables...........");
        System.out.println("Turn on the gas...........");
        System.out.println("Get the cooking pan and oil ready...........");
        System.out.println("Cook the food...........");
        System.out.println("Turn off the gas...........");
        System.out.println("Get it ready on the plate...........");
        System.out.println("Go back to Toni...........");
    }
}