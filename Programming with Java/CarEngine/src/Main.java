import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isOn = false;
        String gear = "P";
        int currentSpeed = 0;
        int userChoice = 0;
        Scanner scanner = new Scanner(System.in);
        String power;

        while (userChoice!=5) {
            System.out.println("------ Car Dashboard ------");
            if (isOn) {
                power = "ON";
            } else {
                power = "OFF";
            }
            System.out.println("Poser: " + power);
            System.out.println("Speed: " + currentSpeed);
            System.out.println("Gear: " + gear);


            System.out.println("Menu:");
            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Accelerate");
            System.out.println("4. Brake");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            userChoice = scanner.nextInt();
            System.out.println("--------------------");
            System.out.println();

            switch (userChoice) {
                case 1:
                    isOn = !isOn;
                    if (isOn) {
                        System.out.println("The engine is turned ON");
                    } else {
                        System.out.println("The engine is turned OFF");
                    }
                    break;

                case 2:
                    System.out.print("Please enter gear (P, D, R): ");
                    gear = scanner.next();
                    break;

                case 3:
                    if (isOn && gear.equals("D")) {
                        currentSpeed += 10;
                    } else {
                        System.out.println("Cannot accelerate while engine is off or gear is in P");
                    }
                    break;
                case 4:
                    if (isOn && gear.equals("R")) {
                        currentSpeed -= 10;
                    } else {
                        System.out.println("Cannot accelerate while engine is off or gear is not it R");
                    }
                    break;
                case 5:
                    System.out.println("Your are now exiting the car");
                    break;
            }
        }

    }
}
