package Java1Lesson1;
import java.util.Scanner;

public class HomeWorkJava1Lesson1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // 1. прописать метод main()
        // 2. создание переменных пройденных типов данных и их инициализация
        byte p1 = -16;
        short p2 = 30000;
        int p3 = -8000;
        long p4 = 15000L;
        float p5 = 4000.16f;
        double p6 = 160.157;
        boolean p7 = true;
        char p8 = 'j';
        String p9 = "Алексей";
        final float PI = 3.14f; // константа

        // объявление и инициализация переменных для п.3 ДЗ
        int a = 7, b = 6, c = 8, d = 3;
        System.out.println(method3(a, b, c, d));    // результат задания №3
        System.out.println(method4(a, c));          // результат задания №4
        method5(c);                                 // результат задания №5
        System.out.println("Task 6: "+ method6(p3));// результат задания №6
        method7(p9);                                // результат задания №7
        method8();                                 // результат задания №8

        scanner.close(); // освобождаем зарезервированные ресурсы
    }

    /*    3. Написать метод вычисляющий выражение a * (b + (c / d))
        и возвращающий результат,где a, b, c, d – входные параметры этого метода;     */
    public static int method3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    /*    4. Написать метод, принимающий на вход два числа,
        и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
        если да – вернуть true, в противном случае – false;     */
    public static boolean method4(int x, int y) {
        if ((x + y) >= 10 && (x + y) <= 20) return true;
        else return false;
        // более коротко в теле метода написать return x + y >= 10 && x + y <= 20
    }

    /*    5. Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль положительное ли число передали, или отрицательное;
        Замечание: ноль считаем положительным числом.     */
    public static void method5(int z) {
        if (z >= 0) System.out.println("Число " + z + " положительное");
        else System.out.println("Число " + z + " отрицательное");
    }

    /* 6. Написать метод, которому в качестве параметра передается целое число,
    метод должен вернуть true, если число отрицательное   */
    public static boolean method6(int z) {
        if (z < 0) return true;
        else return false;  // В задании не указано, что должо вернуться в случае если число положительное.
        // А вернуть что-то необходимо. Поэтому добавил возврат false.
        // короче return a<0;
    }

    /* 7. Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»; */

    public static void method7(String name) {
        System.out.println("Task 7. Привет, " + name + "!");
    }

    /* 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.  */
    public static void method8() {


        while (true) {
            System.out.println("Task 8. Введите год (например, 1946), для завершения введите 0:");
            int year = scanner.nextInt();
            if (year == 0) break;
            if (year < 0) {
                System.out.println("Года до нашей эры не обслуживает этот метод");
                continue;
            }

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) System.out.println("Год " + year + " високосный");
            else System.out.println("Год " + year + " не високосный");
        }
    }
}
