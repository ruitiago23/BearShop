package mindera.mindswap.exercise.bearShop;

public class Main {

    public static void main(String[] args) {
        Shop bearShop = new Shop("Bear Shop");

        int numBearToCreate = 10;

        while (!(numBearToCreate-- == 0)) {
            Bear bear = bearShop.createBear();
            System.out.println(bear);
        }

        if (bearShop.compareTo(bearShop) > 0) {
            System.out.println("Our shop have more bears.");

        } else if (bearShop.compareTo(bearShop) == 0) {
            System.out.println("Both shops have the same amount of bears.");
        } else {
            System.out.println("The other shop have more bears.");
        }
    }

}