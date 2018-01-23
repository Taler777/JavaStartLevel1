package Java1Lesson3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkJava1Lesson3 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1(); // игра "Угадай число"
        task2(); // игра "Угадай слово"
        task1dop(); // перемножь матрицу
        scanner.close(); // освобождаем зарезервированные ресурсы
    }

    /*
    1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить
    больше ли указанное пользователем число чем загаданное, или меньше.
    После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void task1() { // игра "Угадай число"
        int f = 1; // флаг продолжения игры
        while (f == 1) {
            int z = random.nextInt(9); //загадываем число
            System.out.println("Угадайте число от 0 до 9. Введите Ваше число:");
            for (int i = 0; i < 3; i++) {
                int p = scanner.nextInt(); // число пользователя
                if (p > z) System.out.println("Ваше число больше");
                if (p < z) System.out.println("Ваше число меньше");
                if (p == z) {
                    System.out.println("Вы угадали");
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            f = scanner.nextInt();
        }
    }

/*
2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
 "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
 "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы
 */

    public static void task2() { // игра "Угадай слово"
        String words[] = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String str;
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = r.nextInt(words.length); //выбираем случайное слово
        System.out.println();// разделитель
        // System.out.println(words[n]); // что загадала программа, вывожу для теста
        System.out.println("Отгадайте слово. Введите Ваш вариант:");
        str = scanner.nextLine();

        while (true) {
            if (words[n].equals(str)) {
                System.out.println("Вы угадали");
                break;
            } else {
                int ln = words[n].length(); // длина загаданного слова
                int lstr = str.length(); // длина слова пользователя
                int j = (ln < lstr) ? ln : lstr;
                for (int i = 0; i < j; i++) {
                    if (words[n].charAt(i) == str.charAt(i)) System.out.print(words[n].charAt(i));
                    else System.out.print("#");
                }
                for (int i = 0; i < 15 - j; i++) {
                    System.out.print("#");
                }
                System.out.println("");
                System.out.println("Попробуйте еще раз с учетом выше приведенной подсказки:");
                str = scanner.nextLine();
            }
        }
    }
// перемножить две матрицы размером 3*4 и 4*5
    public static void task1dop() {
        int a[][] = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int b[][] = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        // переменные расписываю для собственного удобства
        // перемножаю две матрицы размерностью l x m   и   m x n. Результатом будет матрица размерностью l x n
        int l = a.length;
        int n = b[0].length;
        int m = b.length;
        int c[][] = new int[l][n]; // здесь будет результат перемножения матриц a и b
        for (int i = 0; i < l; i++) { // программирую формулу
            for (int j = 0; j < n; j++) {
                for (int r = 0; r < m; r++) c[i][j] += a[i][r] * b[r][j];
            }
        }
        for (int i = 0; i < l; i++) System.out.println(Arrays.toString(c[i]));
    }
}
