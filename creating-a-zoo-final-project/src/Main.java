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
                                tiger.setNameOfAnimal(keyboard.next());
                                System.out.println("Enter age:");
                                tiger.setAge(keyboard.nextInt());
                                System.out.println("Enter height:");
                                tiger.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight:");
                                tiger.setWeight(keyboard.nextInt());
                                System.out.println("Enter speed: ");
                                tiger.setSpeed(keyboard.nextInt());
                                System.out.println("Enter number of stripes: ");
                                tiger.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter sound level of roar: ");
                                tiger.setSoundLevelOfRoar(keyboard.nextInt());

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
                                dolphin.setNameOfAnimal(keyboard.next());
                                System.out.println("Enter age:");
                                dolphin.setAge(keyboard.nextInt());
                                System.out.println("Enter height:");
                                dolphin.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight:");
                                dolphin.setWeight(keyboard.nextInt());
                                System.out.println("Enter swimming speed: ");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                System.out.println("Enter color: ");
                                dolphin.setColor(keyboard.next());

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
                                System.out.println("Enter name:");
                                penguin.setNameOfAnimal(keyboard.next());
                                System.out.println("Enter age:");
                                penguin.setAge(keyboard.nextInt());
                                System.out.println("Enter height:");
                                penguin.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight:");
                                penguin.setWeight(keyboard.nextInt());
                                System.out.println("Enter swimming speed: ");
                                penguin.setSwimmingSpeed(keyboard.nextInt());
                                System.out.println("Enter walking speed: ");
                                penguin.setWalkingSpeed(keyboard.nextInt());

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
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
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

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



