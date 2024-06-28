package mindera.mindswap.exercise.bearShop;

public class Shop {
    private String name;
    private int bearsCreatedCounter;

    public Shop(String shopName) {
        this.name = shopName;
    }

    public String getName() {
        return name;
    }

    public Bear createBear() {
        Bear result;
        if (bearsCreatedCounter % 5 == 0) {
            result = new CrankyBear();
        } else if (bearsCreatedCounter % 2 == 0) {
            result = new SimpleBear();
        } else {
            result = new DrunkBear();
        }
        bearsCreatedCounter++;
        return result;
    }

    public int compareTo(Shop other) {
        return bearsCreatedCounter - other.bearsCreatedCounter;
    }
}
