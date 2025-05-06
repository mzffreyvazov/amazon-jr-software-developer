import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create a Tiger object
        Tiger tiger = new Tiger();
        // create a Dolphin object
        Dolphin dolphin = new Dolphin();
        // create a Penguin object
        Penguin penguin = new Penguin();


        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tiger.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, tiger);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter name:");
                                keyboard.nextLine(); // consume the newline character
                                tiger.setNameOfAnimal(String.valueOf(keyboard.nextLine()));

                                System.out.println("Enter age:");
                                tiger.setAge(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter height:");
                                tiger.setHeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter weight:");
                                tiger.setWeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter speed: ");
                                tiger.setSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter number of stripes: ");
                                tiger.setNumberOfStripes(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter sound level of roar: ");
                                tiger.setSoundLevelOfRoar(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                break;
                            case 2:
                                System.out.println("Name of animal: " + tiger.getNameOfAnimal());
                                System.out.println("Age of animal: " + tiger.getAge());
                                System.out.println("Height of animal: " + tiger.getHeight());
                                System.out.println("Weight of animal: " + tiger.getWeight());
                                System.out.println("Speed of animal: " + tiger.getSpeed());
                                System.out.println("Number of stripes: " + tiger.getNumberOfStripes());
                                System.out.println("Sound level of roar: " + tiger.getSoundLevelOfRoar());

                                break;
                            case 3:
                                tiger.walking();
                                break;
                            case 4:
                                tiger.eatingFood();
                                tiger.eatingCompleted();
                                break;
                            case 5:
                                System.out.println("Reading tiger details from file: " + tiger.getNameOfAnimal() + ".txt");
                                readObjectsFromFile();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : ");
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphin);

                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter name:");
                                keyboard.nextLine(); // consume the newline character
                                dolphin.setNameOfAnimal(keyboard.nextLine());

                                System.out.println("Enter age:");
                                dolphin.setAge(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter height:");
                                dolphin.setHeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter weight:");
                                dolphin.setWeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter swimming speed: ");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter color: ");
                                dolphin.setColor(keyboard.nextLine());

                                break;
                            case 2:
                                System.out.println("Name of animal: " + dolphin.getNameOfAnimal());
                                System.out.println("Age of animal: " + dolphin.getAge());
                                System.out.println("Height of animal: " + dolphin.getHeight());
                                System.out.println("Weight of animal: " + dolphin.getWeight());
                                System.out.println("Swimming speed of animal: " + dolphin.getSwimmingSpeed());
                                System.out.println("Color of animal: " + dolphin.getColor());

                                break;
                            case 3:
                                dolphin.swimming();
                                break;
                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;
                            case 5:
                                System.out.println("Reading dolphin details from file: " + dolphin.getNameOfAnimal() + ".txt");
                                readObjectsFromFile();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;


                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguin.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguin);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Is the penguin swimming? (1 for yes/ 2 for no): ");
                                int swimmingChoice = keyboard.nextInt();
                                if (swimmingChoice == 1) {
                                    penguin.setSwimming(true);
                                } else {
                                    penguin.setSwimming(false);
                                }
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter name:");
                                penguin.setNameOfAnimal(keyboard.nextLine());

                                System.out.println("Enter age:");
                                penguin.setAge(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter height:");
                                penguin.setHeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter weight:");
                                penguin.setWeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter swimming speed: ");
                                penguin.setSwimming(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                System.out.println("Enter walking speed: ");
                                penguin.setWalkSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // consume the newline character

                                break;
                            case 2:
                                System.out.println("Name of animal: " + penguin.getNameOfAnimal());
                                System.out.println("Age of animal: " + penguin.getAge());
                                System.out.println("Height of animal: " + penguin.getHeight());
                                System.out.println("Weight of animal: " + penguin.getWeight());
                                System.out.println("Swimming speed of animal: " + penguin.getSwimmingSpeed());
                                System.out.println("Walking speed of animal: " + penguin.getWalkingSpeed());
                                break;
                            case 3:
                                if (penguin.isSwimming()) {
                                    penguin.swimming();
                                } else {
                                    penguin.walking();
                                }
                                break;
                            case 4:
                                penguin.eatingFood();
                                penguin.eatingCompleted();
                                break;
                            case 5:
                                System.out.println("Reading the penguin details from file: " + penguin.getNameOfAnimal() + ".txt");
                                readObjectsFromFile();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;


                case 4:
                    System.out.println("Writing objects to file...");
                    writeObjectsToFile(tiger, penguin, dolphin);
                    break;
                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);

    }

    public static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("4. Write objects to file");

        System.out.println("Enter your choice:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.println("5. Read animal details from file");

        System.out.println("Enter choice (1-5):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }

    public static void writeObjectsToFile(Tiger tiger, Penguin penguin, Dolphin dolphin) {
        String tigerDetails = tiger.toString();
        String tigerFileName = "tiger.txt";

        String dolphinDetails = dolphin.toString();
        String dolphinFileName = "dolphin.txt";

        String penguinDetails = penguin.toString();
        String penguinFileName = "penguin.txt";

        try (
                ObjectOutputStream tigerOut = new ObjectOutputStream(new FileOutputStream(tigerFileName));
                ObjectOutputStream dolphinOut = new ObjectOutputStream(new FileOutputStream(dolphinFileName));
                ObjectOutputStream penguinOut = new ObjectOutputStream(new FileOutputStream(penguinFileName));

        ) {

            tigerOut.writeObject(tiger);
            System.out.println("Writing the tiger details to file: " + tigerFileName);

            dolphinOut.writeObject(dolphin);
            System.out.println("Writing the dolphin details to file: " + dolphinFileName);

            penguinOut.writeObject(penguin);
            System.out.println("Writing the penguin details to file: " + penguinFileName);

        } catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
            System.out.println(e.getStackTrace());
        }


    }

    public static void readObjectsFromFile() {
        String tigerFileName = "tiger.txt";
        String dolphinFileName = "dolphin.txt";
        String penguinFileName = "penguin.txt";

        try (
                ObjectInputStream tigerIn = new ObjectInputStream(new FileInputStream(tigerFileName));
                ObjectInputStream dolphinIn = new ObjectInputStream(new FileInputStream(dolphinFileName));
                ObjectInputStream penguinIn = new ObjectInputStream(new FileInputStream(penguinFileName));
        ) {

            Tiger tiger = (Tiger) tigerIn.readObject();
            Dolphin dolphin = (Dolphin) dolphinIn.readObject();
            Penguin penguin = (Penguin) penguinIn.readObject();

            System.out.println("Tiger from file: " + tiger);
            System.out.println("Dolphin from file: " + dolphin);
            System.out.println("Penguin from file: " + penguin);

        } catch (Exception e) {
            System.err.println("Error reading from file: " + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}



