package Java1Lesson2;

import java.util.Arrays;

import static java.lang.Math.abs;

public class HomeWorkJava1Lesson2 {

    public static void main(String[] args) {
        task1(); // результат задания №1
        task2(); // результат задания №2
        task3(); // результат задания №3
        task4(); // результат задания №4
        task5(); // результат задания №5

        // int[] m = new int[]{2, 1, 1, 2, 1};// для false
        int[] m = new int[]{1, 2, 3, 4, 10}; // для true
        System.out.println("Task 6: " + task6(m)); // результат задания №6
        int n = -3;
        task7(m, n); // результат задания №7

        // Дополнительные задания
        task1dop(); // результат дополнительного задания №1
        task2dop(); // результат дополнительного задания №2
        task3dop(); // результат дополнительного задания №3
        task4dop(); // результат дополнительного задания №4
    }

    //        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void task1() {
        int[] array1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //  System.out.println(Arrays.toString(array1)); //до инвертирования
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) array1[i] = 1;
            else array1[i] = 0;
        }
        System.out.println("Task1: " + Arrays.toString(array1)); // после инвертирования
    }

//     2. Задать пустой целочисленный массив размером 8.
//        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void task2() {
        int[] array2 = new int[8];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 3 * i;
        }
        System.out.println("Task2: " + Arrays.toString(array2));
    }

//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//        пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void task3() {
        int[] array3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] *= 2;
        }
        System.out.println("Task3: " + Arrays.toString(array3));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//    У матрицы две диагонали, заполнить нужно обе.
//    Массив int изначально проинициализирован нулями, поэтому нужно только написать условие, по которому выставлять 1.
    public static void task4() {
        int[][] array4 = new int[5][5];
        System.out.println("Task4: ");
        for (int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;
            array4[i][array4[i].length - i - 1] = 1;
        }
        // вывод в консоль для проверки
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
            }
            System.out.println(Arrays.toString(array4[i]));
        }
        System.out.println();
    }

    // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void task5() {
        int[] array5 = new int[]{1, 4, 8, 0, 80, 16, 33, 15, 120, 3, 6, 76};
        int min = array5[0], max = array5[0], imin = 0, imax = 0;
        for (int i = 1; i < array5.length; i++) {
            if (array5[i] > max) {
                max = array5[i];
                imax = i;
            } else if (array5[i] < min) {
                min = array5[i];
                imin = i;
            }
        }
        System.out.println("Task5:");
        System.out.println("Минимальный элемент array5[" + imin + "] = " + min);
        System.out.println("Максимальный элемент array5[" + imax + "] = " + max);
    }

    // альтернатива, мной не реализованная
//
//    public static void 1111(int []array) {
//        for (int value:array) {
//            if (value > max) max=value;
//            if (value < max) min=value;
//        }
//    }


    //    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
//    Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
//    граница показана символами ||, эти символы в массив не входят.
//    Массив делить пополам не нужно! Для массива {1,2,3,4,10} результат должен быть true.
    public static boolean task6(int[] array6) {
        int suml = 0, sumr = 0; // сумма левой и правой частей массива
        int l = array6.length; // длина массива
        boolean result = false;
        int r = 0; // начало правой части массива
        for (int i = 0; i < l - 1; i++) {
            suml += array6[i];
            for (int j = l - 1; j > i; j--) {
                sumr += array6[j];
                r = j;
            }
            //  System.out.println("suml = " + suml + "        sumr= " + sumr); //проверяю
            if (suml == sumr) {
                System.out.println("Граница где сумма левой и правой части массива равны меджу " + i + " и " + r + " элементами");
                result = true;
            } else {
                sumr = 0;
            }
        }
        return result;
    }

    // есть альтернатива
//    public static void analog(int [] array) {
//        int rigthSum, leftSum;
//        rigthSum=leftSum = 0;
//        for (int i:array)
//            rigthSum += i;
//            for (int i = 0; i < array.length; i++) {
//                if (leftSum == rigthSum) return true;
//                rigthSum -= array[i];
//                leftSum += array[i];
//            }
//        return false;
//
//    }

    //   7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//    при этом метод должен сместить все элементымассива на n позиций.
//    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//    Сдвигать элементы массивы нужно по карусели.
//    То есть массив {1,2,3,4,5} при n=1, превращается в {5,1,2,3,4}, а при n = -1 - в {2,3,4,5,1}
    public static void task7(int[] arr7, int n) {
        System.out.println("Task 7:");
        System.out.println("Массив исходный: " + Arrays.toString(arr7));
        int x = 0;
        if (n > 0) { // сдвиг вправо
            for (int i = 0; i < n; i++) {
                x = arr7[arr7.length - 1];
                for (int j = arr7.length - 1; j >= 0; j--) {
                    if (j == 0) {
                        arr7[j] = x;
                    } else arr7[j] = arr7[j - 1];
                }
            }
            System.out.println("Массив после сдвига на " + n + " - " + Arrays.toString(arr7));
        } else { // сдвиг влево
            for (int i = 0; i < abs(n); i++) {
                x = arr7[0];
                for (int j = 0; j <= arr7.length - 1; j++) {
                    if (j == arr7.length - 1) arr7[j] = x;
                    else {
                        arr7[j] = arr7[j + 1];
                    }
                }
            }
            System.out.println("Массив после сдвига на " + n + " - " + Arrays.toString(arr7));
        }
    }

    //  Дополнительное задание №1
    //    Дан одномерный массив, состоящий из 0 и 1.
//    Нужно преобразовать его в массив, который будет содержать числа, отображающие сколько 0 или 1 стоит подряд.
//    Пример: массив [0,0,0,0,1,1,1,1,1,1,1,0,0,1,1,1,1] преобразуется в [4,7,2,4].
    public static void task1dop() {
        int[] m = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1};
        int sr = m[0]; // с чем сравниваем элемент массива
        int t = 0; // индекс преобразованного массива
        int f = 1; // количество повторяющихся цепочек
        // узнаем количество повторяющихся цепочек
        for (int i = 0; i < m.length; i++) {
            if (m[i] == sr) {
            } else {
                sr = m[i];
                f++;
            }
        }
        int[] n = new int[f]; // преобразованный массив
        sr = m[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i] == sr) {
                n[t]++;
            } else {
                sr = m[i];
                t++;
                n[t]++;
            }
        }
        System.out.println("Доп.задание №1 Результат: " + Arrays.toString(n));
    }

    //  Дополнительное задание №2
//    Дан массив целых чисел. Нужно узнать среднее арифметическое всех чисел массива, стоящих на нечетных позициях.
//    Arr[1], arr[3] и т.д.

    public static void task2dop() {
        int[] m = new int[]{1, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 45, 55, 77};
        int sum = 0; // сумма нечетных элементов
        int n = 0; // количество элементов
        for (int i = 1; i < m.length; i += 2) {
            sum += m[i];
            n++;
        }
        System.out.println("Доп.задание №2. Среднее арифметическое: " + sum / n);
    }

//      Дополнительное задание №3
//    Дан массив целых чисел и некое целое число N. Нужно узнать, есть ли в массиве число, равное N.
//    Если есть - вывести в консоль сумму всех чисел от 0 элемента, до элемента, который равен N включительно.

    public static void task3dop() {
        int[] m = new int[]{1, 2, 4, 5, 7, 8, 10, 12, 15, 16, 18};
        int x = 10;
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == x) {
                for (int j = 0; j <= i; j++) {
                    sum += m[j];
                }
            }
        }
        System.out.println("Доп.задание №3. Сумма всех элементов до числа " + x + " включительно = " + sum);
    }

    public static void task4dop() {
        int sum = 0;
        int[][] m = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        System.out.println("Доп.задание №4. Сумма элементов квадратной матрицы: " + sum);
    }
}
