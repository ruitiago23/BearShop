package mindera.mindswap.exercise.bearShop;

public class DrunkBear extends Bear {
    boolean notSleeping = true;

    private static boolean testForSleeping() {
        return Math.random() * 5 < 1;
    }

    @Override
    public void talk() {
        if (notSleeping && !testForSleeping()) {
            super.talk();

        } else {
            notSleeping = false;
            System.out.println("Zzz Zzz Zzz");
            decreaseBattery();
        }

    }

    @Override
    public String toString() {
        return "DrunkBear";
    }
}
