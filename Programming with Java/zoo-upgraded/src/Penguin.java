import java.io.Serializable;

public class Penguin extends Animal implements Walk, Swim, Serializable {
    private static final long serialVersionUID = 1L;
    private boolean isSwimming;
    private int swimmingSpeed;
    private int walkingSpeed;

    public Penguin() {
        super("Penguin");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getWalkingSpeed() {
        return walkingSpeed;
    }

    public void setWalkingSpeed(int walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }
    
    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish");
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed of " + walkingSpeed + " mph");
    }

    @Override
    public String toString() {
        return "Penguin [isSwimming=" + isSwimming + ", swimmingSpeed=" + swimmingSpeed + ", walkingSpeed="
                + walkingSpeed + "]";
    }

    public void setSwimming(int nextInt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSwimming'");
    }

    public void setWalkSpeed(int nextInt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setWalkSpeed'");
    }

    
    
}
