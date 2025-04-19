public class Main {
    public static void main(String[] args) {

        SideKick sideKickObject = new SideKick();

        // sideKickObject.modeOfOperation = 2; // This will cause a compile error because modeOfOperation is private

        System.out.println("Current modeOfOperation: " + sideKickObject.getModeOfOperation());

        sideKickObject.setModeOfOperation(3);

        sideKickObject.takeAction();

        sideKickObject.setModeOfOperation(1);
        sideKickObject.takeAction();

        sideKickObject.setModeOfOperation(2);
        sideKickObject.takeAction();
    }
}