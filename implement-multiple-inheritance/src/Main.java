import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Object of SideKick class
        SideKick sideKickObject = new SideKick();


        // Object of WatADriver class
        WatADriver driverBot = new WatADriver();

        // Object of Scanner class to get input from the user
        Scanner keyboardInput = new Scanner(System.in);

        // integer variable to get choice of user as to which robot to use
        int menuChoice;

        // boolean variable to keep the do-while running
        boolean keepMenuRunning;


        do {

            System.out.println("******* MENU FOR ROBOT CHOICE  *****");
            System.out.println("1. SideKick robot ");
            System.out.println("2. WatADriver robot ");
            System.out.println("**************************************");

            System.out.println("Enter your choice of robot(1 or 2): ");
            menuChoice = keyboardInput.nextInt();



            switch (menuChoice) {
                case 1:

                    sideKickObject.setChoice();
                    sideKickObject.takeAction();

                    if (sideKickObject instanceof KungFuSkills) {
                        sideKickObject.kungFuProtection();
                    } else {
                        System.out.println("SideKick does not have KungFuSkills.");
                    }
                    break;
                    
                case 2:

                    driverBot.setChoice();
                    driverBot.takeAction();
                    break;

                default:
                    System.out.println("Invalid choice for a robot.");

            }


            // in case the input skips
            keyboardInput.nextLine();

            // prompt user if continuation is required for loop
            System.out.println("Another run? (enter y for yes/ any value for no):  ");
            //get input
            String userInput = keyboardInput.nextLine();

            // check if input is equal to "y"
            if(userInput.equalsIgnoreCase("y")) {
                // re-run loop
                keepMenuRunning = true;
            } else {
                // stop loop
                keepMenuRunning = false;
            }

        } while (keepMenuRunning);
    }
}
