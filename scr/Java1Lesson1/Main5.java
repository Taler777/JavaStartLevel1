package Java1Lesson1;

public class Main5 {
    public static void main(String[] args) {
        // операторы сравнения
      if (5<10) {
          System.out.println("5 меньше 10");
      }
      int a = 6;
      int b = 7;
        checkEquals(a,b);
        System.out.println(checkRange(2,3));
        System.out.println(checkRangeOr(4,3));
    }

    public static void checkEquals(int a, int b) {
        if (a==b) System.out.println("a равно b");
        if (a!=b) System.out.println("a не равно b");
    }

    public static boolean checkRange(int a,int b) {
     if (a*b >10 && a*b<20) return true;
     else return false;

    }
    public static boolean checkRangeOr(int a,int b) {
        if (a*b <10 || a*b>20) return true;
        else return false;

    }
}
