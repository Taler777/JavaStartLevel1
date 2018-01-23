package Java1Lesson4;

import java.util.Random;
import java.util.Scanner;

public class GameTicTacToe {

    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static char DOT_HUMAN; // чем ходит человек
    public static char DOT_COMPUTER; // чем ходит компьютер
    public static int DOT_TO_WIN = 3; // длина выигрышной последовательности символов игрока
    public static final char DOT_EMPTY = '*'; // пустая клетка
    public static final char SIZE = 3; // размер поля
    public static int center = 1; // центральная клетка для поля 3х3
    public static Scanner scanner = new Scanner(System.in);
    public static char map[][]; // игровое поле
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Выберите чем будете играть: 1 - X(крестик) или 0 - 0 (нолик) :");
        int choice = scanner.nextInt();
        initMap();
        printMap();
        if (choice == 1) {
            // ходит человек
            DOT_HUMAN = DOT_X;
            DOT_COMPUTER = DOT_0;
            humanTurn();
            System.out.println();
            printMap();
        } else {
            DOT_COMPUTER = DOT_X;
            DOT_HUMAN = DOT_0;
        }
        do {
            computerTurn();
            printMap();
            // проверка на выигрыш
            if (checkWin(DOT_COMPUTER)) {
                System.out.println("Победил компьютер");
                break;
            }
            // проверка на ничью
            if (checkMap()) {
                System.out.println("Ничья");
                break;
            }
            humanTurn();
            printMap();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Победил человек");
                break;
            }
            if (checkMap()) {
                System.out.println("Ничья");
                break;
            }
        } while (true);
    }

    // инициализация карты
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // печать карты
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " "); // вывод номеров столбцов
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // ход игрока
    public static void humanTurn() {
        int x, y;
        // проверить введенные координаты на существование и свободна ли клетка
        do {
            System.out.println("Ваш ход. Введите номер строки и номер столбца через пробел:");
            x = scanner.nextInt() - 1; // корректируем в индекс массива
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_HUMAN;
    }

    // проверка введенных координаты на существование и свободна ли клетка
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static void computerTurn() {
        int x, y; // координаты хода компьютера
        // анализ игры для выбора наилучшего хода или сделать рандомный ход
        do {
            // ИИ ходит в центр, если он свободен
            if (map[center][center] == DOT_EMPTY) {
                x = y = center;
            } else {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            }
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сделал свой ход в строку " + (x + 1) + " столбец " + (y + 1));
        map[x][y] = DOT_COMPUTER;
    }

    // проверка победы
    public static boolean checkWin(char str) {
        // код для поля любого размера
//        public static boolean checkWin ( char symb){
//            for (int i = 0; i < size; i++) {
//                int nl_size = 0, ns_size = 0, nl1_size = 0, ndup_size = 0, ns1_size = 0, ndup1_size = 0, nddown_size = 0, nddown1_size = 0, ndupr_size = 0, ndupr1_size = 0, nddownr_size = 0, nddownr1_size = 0;
//                if (size < 4 && size == dots_of_win) {
//                    int nl = 0, ns = 0, nd1 = 0, nd2 = 0;
//                    for (int j = 0, k = size - 1; j < size && k > -1; k--, j++) {
//                        if (map[i][j] == symb) nl += 1;
//                        if (map[j][i] == symb) ns += 1;
//                        if (map[j][j] == symb) nd1 += 1;
//                        if (map[k][j] == symb) nd2 += 1;
//                        if (nl == dots_of_win || ns == dots_of_win || nd1 == dots_of_win || nd2 == dots_of_win)
//                            return true;
//                    }
//                }
//                if (size > 3) {
//
//                    for (int j = 0, k = size - 1, p = -1; j < size && k > -1; k--, j++) {
//                        if (map[i][j] == symb) {
//                            nl_size += 1;
//                            nl1_size = nl_size;
//                        }
//                        if (map[i][j] != symb) {
//                            nl_size = 0;
//                        }
//                        if (map[j][i] == symb) {
//                            ns_size += 1;
//                            ns1_size = ns_size;
//                        }
//                        if (map[j][i] != symb) {
//                            ns_size = 0;
//                        }
//                        if ((j + i) < size) {
//                            if (map[j][j + i] == symb) {
//                                ndup_size += 1;
//                                ndup1_size = ndup_size;
//                            }
//                            if (map[j][j + i] != symb) {
//
//                                ndup_size = 0;
//                            }
//                            if (map[j + i][j] == symb) {
//                                nddown_size += 1;
//                                nddown1_size = nddown_size;
//                            }
//                            if (map[j + i][j] != symb) {
//                                nddown_size = 0;
//                            }
//                            if (map[k][j + i] == symb) {
//                                nddownr_size += 1;
//                                nddownr1_size = nddownr_size;
//                            }
//                            if (map[k][j + i] != symb) {
//                                nddownr_size = 0;
//                            }
//                        }
//                        if ((k - i) > -1) {
//                            if (map[j][k - i] == symb) {
//                                ndupr_size += 1;
//                                ndupr1_size = ndupr_size;
//                            }
//                            if (map[j][k - i] != symb) {
//                                ndupr_size = 0;
//                            }
//                        }
//                    }
//                    if (nl1_size >= dots_of_win || ns1_size >= dots_of_win || ndup1_size >= dots_of_win || nddown1_size >= dots_of_win || ndupr1_size >= dots_of_win || nddownr1_size >= dots_of_win)
//                        return true;
//                }
//            }
//            return false;
//        }
        
        // мой код
        for (int i = 0; i < SIZE; i++) {
            int s, k, d1, d2;
            k = s = d1 = d2 = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == str) s++; //проверка строк
                // для крестиков-ноликов >3x3 необходимо добавить else s=0 и тоже для k, d1, d2
                // если последовательность символов игрока прерывается
                if (map[j][i] == str) k++; //проверка столбцов
                if (map[j][j] == str) d1++; //проверка диагонали 1
                if (map[SIZE - 1 - j][j] == str) d2++; //проверка диагонали 2
            }
            if (s == DOT_TO_WIN || k == DOT_TO_WIN || d1 == DOT_TO_WIN || d2 == DOT_TO_WIN) return true;
        }
        return false;
    }

    // проверка заполнения карты
    public static boolean checkMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}