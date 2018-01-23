package Java1Lesson6;

public class Cart extends Vehicle {
    int cargoWeightLimit = 0;

    public Cart(int speed, String brand, int weight) {
        super(speed, brand, weight);
    }

    @Override
    public void back(int time) {
        System.out.println("It can't move back");
    }

}
