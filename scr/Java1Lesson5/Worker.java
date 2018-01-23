package Java1Lesson5;
//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст
public class Worker {
    public String fio;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;
// Конструктор класса должен заполнять эти поля при создании объекта
    public Worker(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
// Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль
    public void aboutWorker(){
        System.out.println("Worker: " + this.fio);
        System.out.println("Position: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age);
    }
}
