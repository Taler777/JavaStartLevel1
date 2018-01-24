package Java1Lesson7;

public class Cat {
    public int appetite; // сколько съедает кот
    public String name;
    public boolean full = false; //сытость кота, изначально он голоден

    // для автоматической вставки конструктора - выделить переменные, нажать Alt+Ins, потом Constructor, выбрать обе переменные, ОК
    public Cat(int appetite, String name) {
        this.appetite = appetite;
        this.name = name;
    }

    public void eat(Plate plate) { //метод - кот ест
        if (!this.full) {
            this.full = plate.decreaseFood(this.appetite);
            System.out.println(this.name + ((this.full) ? "" : " не") + " поел.");
        } else System.out.println(this.name + " сыт.");
    }
}


