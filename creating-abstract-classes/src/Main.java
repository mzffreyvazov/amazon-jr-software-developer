public class Main {
    public static void main(String[] args) {

        WatADriver driverBot = new WatADriver();

        driverBot.rechargeBattery();
        driverBot.displayBatteryLevel();

        driverBot.setChoice();
        driverBot.takeAction();
    }
}