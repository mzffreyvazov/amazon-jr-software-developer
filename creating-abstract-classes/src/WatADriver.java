public class WatADriver extends Robot {

    @Override
    public void setChoice() {
        System.out.println("Inside choice setting of WatADriver");
        // For demonstration, set to 1 (drive) by default
        setModeOfOperation(1);
    }

    @Override
    public void takeAction() {
        System.out.println("WatADriver will drive or fly here");
        // You can add more logic based on modeOfOperation if needed
    }
}