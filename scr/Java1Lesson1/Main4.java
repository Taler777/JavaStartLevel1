package Java1Lesson1;

public class Main4 {     // методы
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = multiply(a, b);
        System.out.println(c);
        System.out.println(multiply(3, 4));
        sayJava();
        int x, y;
        String string1 = "Alexandra";
        sayHello(string1);
    }

    public static int multiply(int x, int y) { // x,y - локальные переменные метода multiply
//        int result = x*y;
//        return result;
        return x * y;
    }

    public static void sayJava() {
        System.out.println("Hello, Java!");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name); // конкатенация строк
    }
}
