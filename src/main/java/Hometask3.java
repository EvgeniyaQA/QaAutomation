/* 1) Обьявить четыре разных числа, сравнить их и вывести на консоль наименьшее.
        2)Обявить несколько из них одинаковых, вывести на консоль сколько одинаковых чисел в наборе.
        3)Доп задание для продвинутых: описать математические операции над некоторыми числами ввиде калькулятора и вывести их на консоль.*/
public class Hometask3 {
    public static void main(String[] args) {
        int a = -10;
        int b = 0;
        int c = 0;
        int d = 1;
        findMinimum(a, b, c,d );
        int sum = 0;

        findEqual(a, b, c, sum);

    }


    public static void findMinimum(int a, int b, int c, int d) {
        if (a < b && a < c && a < d) {
            System.out.println("Minimum number is " + a);
        } else if (b < a && b < c && b < d) {
            System.out.println("Minimum number is " + b);
        } else if (c < a && c < b && c < d) {
            System.out.println("Minimum number is " + c);
        } else {
            System.out.println("Minimum number is " + d);
        }

    }

    public static void findEqual(int a, int b, int c,  int sum) {
        if (a == b && a!=c) {
            sum = 2;
        }if  (a==c && a!=b) {
            sum=2;

        }if(a==b&& a==c) {
            sum = 3;
        }if (a!=b && b==c) {
                sum = 2;
            }
        System.out.println("Quantity of equal numbers : " + sum);
        }

    public class Calculator {
        public static void main(String[] args) {
            int a=2;
            int b = 3;
            doSum(a,b);
            doDeduction(a,b);
            doMultiply(a,b);
            doDivision(a,b);
    }
public static void doSum(int a, int b){}

        public static void doDeduction(int a, int b) {
        }

        public static void doMultiply(int a, int b) {
        }

        public static void doDivision(int a, int b) {
        }
    }}


