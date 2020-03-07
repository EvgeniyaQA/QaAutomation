/* 1) Обьявить четыре разных числа, сравнить их и вывести на консоль наименьшее.
        2)Обявить несколько из них одинаковых, вывести на консоль сколько одинаковых чисел в наборе.
        3)Доп задание для продвинутых: описать математические операции над некоторыми числами ввиде калькулятора и вывести их на консоль.*/
public class Hometask3 {
    public static void main(String[] args) {
        int a ;
        int b ;
        int c ;
        int d ;
        findMinimum(1,2,3,5 );
        int sum;

        findEqual(1,1,5,0);

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
        
    }


