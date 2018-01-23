package Java1Lesson6;

public class Vehicle {
    int speed;
    private String brand;
    private int weight;

    public Vehicle(int speed, String brand, int weight) {
        this.speed = speed;
        //this.brand = brand;
        setBrand(brand);
        //this.weight = weight;
        setWeight(weight);
    }

    public void forward(int time) {
        System.out.println("it moved " + ((time >= 0) ? "forward" : "back") + " about " + ((time >= 0) ? 1 : -1) * this.speed * time + " km");
    }

    public void back(int time) {
        forward(-time);
        //System.out.println("it moved back " + this.speed * time + " km");
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
