package Java1Lesson6;

public class Car extends Vehicle {

    int cargoWeightLimit = 500;

    public Car(int speed, String brand, int weight) {
        super(speed, brand, weight);
    }

    public void estimateCapacity(int cargoWeight) { // cargoWeight - вес груза
// метод должен проверить проходит ли переданный груз по ограничению, и написать в консоль какой будет вес машины + вес груза.
        if (cargoWeight < cargoWeightLimit)
            System.out.println("Вес машины и груза = " + (cargoWeight + this.getWeight()));
        else System.out.println("Машина такой груз не возьмет");
    }
}
