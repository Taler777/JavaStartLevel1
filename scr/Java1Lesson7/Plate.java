package Java1Lesson7;

public class Plate { //класс Тарелка
    private int food; // еда в тарелке

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int value) { // метод уменьшает количество еды в тарелке
        if (this.food < value) {
            System.out.println("Коту не хватает еды в миске (((");
            return false;
        } else {
            this.food -= value;
            return true;
        }
    }

    public void plateInfo() { // метод выводит инфу сколько еды в тарелке
        System.out.println("В тарелке " + this.food + " еды");
    }

    public int foodValue() { // возвращает количество еды в тарелке
        return this.food;
    }

    public void addFood() { // метод добавления еды в тарелку
        this.food += 100;
    }
}