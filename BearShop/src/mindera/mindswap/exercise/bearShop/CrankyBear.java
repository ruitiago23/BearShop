package mindera.mindswap.exercise.bearShop;

public class CrankyBear extends Bear {
    private static final int HALF_BATTERY = MAX_BATTERY_LEVEL / 2;

    boolean canSing = true;


    @Override
    public void talk() {
        if (getBatteryLevel() >= HALF_BATTERY) {
            super.talk();
        }
    }

    public void sing() {
        if (getBatteryLevel() >= HALF_BATTERY) {
            System.out.println("Singing a sad song.");
            decreaseBattery();
        } else {
            if (canSing) {
                System.out.println("Singing a sad song.");
                decreaseBattery();
                canSing = false;
            }
            decreaseBattery();
        }
    }

    @Override
    public String toString() {
        return "CrankyBear";
    }
}
