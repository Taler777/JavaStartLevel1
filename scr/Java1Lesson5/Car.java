package Java1Lesson5;
// Создать класс Car
public class Car {
    public int maxSpeed;
    public int power;
    public String color;
    public float engineVolume;
    public int price;
    public String name;
    public int id;
    public static Car[] cars = new Car[10]; // в котором нужен массив для хранения общего количества созданных машин.
                                            // Максимальная емкость массива - 10.
    public static int k = 0; // индекс для массива машин
    // создать метод createCar, который фактически является заменой конструктора и заполняет следующие поля машины
    public void createCar(int mSpeed, int power, String color, float eVolume, int price, String name, int id) {
        this.maxSpeed = mSpeed;
        this.power = power;
        this.color = color;
        this.engineVolume = eVolume;
        this.price = price;
        this.name = name;
        this.id = id;

        // Кроме того, метод должен добавить в массив информацию об айди созданной машины, ее имени и цене.
        Car.cars[k] = this;
        cars[k].id = id; ;
        cars[k].price = price;
        cars[k].name = name;
        k++;
    }

    /*    Создать метод move, который печатает в консоль за сколько времени проехала машина
        переданное в него расстояние (для упрощения берем макс скорость, не берем в рассчет разгон,
                                      торможение, светофоры и прочие параметры)
    */
    public void move(int distance) {
        System.out.println("Машина " + this.name + " проехала " + distance + "км за " + (distance / this.maxSpeed) + " часов");
    }

    /*    Создать метод compareCars, который печатает информацию в консоль о двух,
        переданных в него машинах в следующем виде:
        Говорит у какой машины выше параметр и называет значения обеих переменных
    */
    public static void compareCars(Car car1, Car car2) {
        if (car1.maxSpeed > car2.maxSpeed)
            System.out.println("Скорость машины " + car1.name + " " + car1.maxSpeed + " км/ч " +
                    " больше " + car2.maxSpeed + " км/ч - скорости машины " + car2.name);
        else System.out.println("Скорость машины " + car2.name + " " + car2.maxSpeed + " км/ч " +
                " больше " + car1.maxSpeed + " км/ч - скорости машины " + car1.name);
// пока сделал для 1 параметра
    }
}
