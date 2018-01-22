package Java1Lesson1;
public class HomeWorkJava1Lesson1Additional {  // дополнительное ДЗ

    public static void main(String[] args) {
        boolean b = task1(7);
        String str1 = "Hello", str2 = " World!";

        //System.out.println(task1(7)); // проверял
        task2(str1, str2);
        task3(4,9);
        task4(2,4,4);

    }

    //    1.Создать метод типа boolean, который принимает одно число типа int и
//    возвращает true, если переданное число четное, и false, если нечетное
    public static boolean task1(int x) {
        return (x % 2 == 0) ? true : false;
    }

    //    2.Создать метод типа void, который принимает две переменных типа “строка”,
//    делает из них одну строку (через пробел) и печатает ее в консоль.
    public static void task2(String s1, String s2) {
        String s3 = s1 + s2;
        System.out.println(s3);
    }

    //    3.Создать метод типа int, который возвращает произведение двух, переданных ему чисел.
//    При этом метод должен вывести в консоль результат сравнения чисел - написать
//        “Число X больше Y”, где вместо икс и игрек актуальные значения переданных переменных.
    public static int task3(int a, int b) {
        if (a > b) System.out.println("Число " + a + " ,больше " + b);
        else System.out.println("Число " + b + " ,больше " + a);
        return a * b;
    }

    //    4.Создать метод, которому передается три числа и он должен определить
//    есть ли среди этих трех чисел два равных между собой.
//    Метод должен вывести эти числа в консоль, если находятся равные,
//    если нет - вывести сообщение, что равных чисел не найдено.
    public static void task4(int a, int b, int c) {
        if (a==b || b==c ) System.out.println("Числа "+b+" и "+ b + " равны");
        // для упрощения взял только значение b для вывода так как оно присутствует в обоих условиях
        else if (a==c) System.out.println("Числа "+a+" и "+ c + " равны");
             else System.out.println("Равных чисел нет");
    }


}
