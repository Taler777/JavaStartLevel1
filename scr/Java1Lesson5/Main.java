package Java1Lesson5;

import static Java1Lesson5.Car.compareCars;

/*
* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников

Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/

public class Main {

    public static void main(String[] args) {

        // основное ДЗ
        // Создать массив из 5 сотрудников
        Worker[] persArray = new Worker[5]; // объявил массив класса Worker
        // потом для каждой ячейки массива задаем объект
        persArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231212", 30000, 30);
        persArray[1] = new Worker("Petrov Petya", "Accountant", "pepetya@mailbox.com", "89111231212", 33000, 47);
        persArray[2] = new Worker("Sidorov Ivan", "Developer", "siivan@mailbox.com", "89211231212", 37000, 36);
        persArray[3] = new Worker("Fedorov Fedor", "Manager", "fefedor@mailbox.com", "89061231212", 39000, 43);
        persArray[4] = new Worker("Dmitrov Dmitry", "Driver", "dmdmitry@mailbox.com", "89511231212", 50000, 31);
        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет
        for (int i = 0; i < persArray.length; i++) { // можно через for each
            if (persArray[i].age > 40) {
                persArray[i].aboutWorker();
                System.out.println();
            }
        }
// дополнительное ДЗ
// Создать класс Car, в котором нужен массив для хранения общего количества созданных машин.
// Максимальная емкость массива - 10.
// Далее необходимо создать метод createCar, который фактически является заменой конструктора и заполняет следующие поля машины:
// Макс скорость (int)
// Мощность (int)
// Цвет (String)
// Литраж двигателя (float)
// Цена (int)
// Уникальное имя каждой машины (String)
//
// Кроме того, метод должен добавить в массив информацию об айди созданной машины, ее имени и цене.
// Создать метод move, который печатает в консоль за сколько времени проехала машина переданное в него расстояние
// (для упрощения берем макс скорость, не берем в рассчет разгон, торможение, светофоры и прочие параметры)
// Создать метод compareCars, который печатает информацию в консоль о двух, переданных в него машинах в следующем виде:
// Говорит у какой машины выше параметр и называет значения обеих переменных

        Car cars [] = new Car[2];
        cars[0] = new Car();
        cars[1] = new Car();
        cars[0].createCar(100, 150, "green", 2.5f, 22000, "Ferrari", 111);
        cars[1].createCar(700, 777, "neon blue", 5.0f, 122000, "Lada Kalina", 2109);
        int distance = 1000;
        cars[0].move(distance);
        cars[1].move(distance);
        compareCars(cars[0], cars[1]);
        int n = 0;
        for (int i = 0; i < cars.length; i++) {
            //  System.out.println(cars[i]);
            if (cars[i] != null) n++;
        }
        System.out.println("В мире всего " + cars.length + " машин, но нам известны только " + n);
    }
}
