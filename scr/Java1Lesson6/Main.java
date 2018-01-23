package Java1Lesson6;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина,
означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
 прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
(Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях.
То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

Мой комментарий после выполнения ДЗ:
"Мысль пришла после выполнения задания. Так как я являюсь архитектором,
то можно было бы сделать класс Vehicle суперклассом для Cart и Truck.
А Truck в свою очередь суперклассом для Car.
Это для того, чтобы разделить методы и не переопределять методы или устраивать проверки на возможность выполнения методов.
Метод для проверки грузоподъемности поэтому остался прописан в классах Truck и Car.
*/

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat(200, 2.0f, 0);
        Dog dog1 = new Dog(500, 0.5f, 10);
        Dog dog2 = new Dog(600, 1.0f, 20);
        Dog dog3 = new Dog(100, 3.0f, 100);
        System.out.print("Прыгает cat1: ");
        cat1.jump(1.5f);
        System.out.print("Плывет cat2: ");
        cat1.swim(1);
        System.out.print("Бежит dog1: ");
        dog1.run(600);
        System.out.print("Бежит dog2: ");
        dog2.run(600);
        System.out.print("Бежит dog3: ");
        dog3.run(600);
        Car car1 = new Car(240, "Mazda", 2000);
        Car car2 = new Car(70, "VAZ2109", 1000);
        Car car3 = new Car(30, "Zaporogec", 100);
        Truck truck1 = new Truck(150, "MAN", 8000);
        Truck truck2 = new Truck(200, "Mercedes", 10000);
        Cart cart = new Cart(70, "Jivchik", 30);
        System.out.println("Машина " + car1.getBrand() + " поехала вперед");
        car1.forward(30);
        System.out.println("Машина " + car2.getBrand() + " поехала назад");
        car1.back(30);
        System.out.println("Карт " + cart.getBrand() + " поехал назад");
        cart.back(30);
        System.out.println("Оценим грузоподъемность " + car1.getBrand());
        car1.estimateCapacity(600);
        System.out.println("Оценим грузоподъемность " + car1.getBrand());
        car2.estimateCapacity(100);
        System.out.println("Оценим грузоподъемность " + truck1.getBrand());
        truck1.estimateCapacity(3000);
        System.out.println("Оценим грузоподъемность " + truck2.getBrand());
        truck2.estimateCapacity(1000);
        System.out.println(car1.getBrand());
    }
}
