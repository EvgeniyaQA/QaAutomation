/* 1) Обьявить четыре разных числа, сравнить их и вывести на консоль наименьшее.
        2)Обявить несколько из них одинаковых, вывести на консоль сколько одинаковых чисел в наборе.
        3)Доп задание для продвинутых: описать математические операции над некоторыми числами ввиде калькулятора и вывести их на консоль.*/
public class Hometask3 {
    public static void main(String[] args) {
        int a=1;
        int b =1;
        int c = 1;
        int d= 1;
        findMinimum( a, b, c, d);;
        int sum1=1;
        int sum2=1;
        int sum3=1;
        int sum4=1;
        findEqual(a, b, c, d, sum1, sum2, sum3, sum4);
    }


        public static void findMinimum(int a, int b, int c, int d){
        if (a<b && a<c && a<d) {
            System.out.println("Minimum number is " + a);
        } else if(b<a &&b<c && b<d) {
            System.out.println("Minimum number is " + b);
        } else if(c<a && c<b && c<d) {
            System.out.println("Minimum number is " + c);
        }else {
            System.out.println("Minimum number is " + d);
        }

    }
    public static void findEqual (int a, int b, int c, int d, int sum1, int sum2,int sum3, int sum4) {
        if (a == b) {
            sum1+=1;
       }if (a==c) {
            sum1+=1;
        }if (a==d) {
            sum1+=1;
        }

            if (b== a) {
                sum2+=1;
            }if (b==c) {
                sum2+=1;
            }if (b==d) {
            sum2+=1;
        }


                if (c == a) {
                    ++sum3;
                }if (c==b) {
                    ++sum3;
                }if (c==d) {
                    sum3++;
        }
                if (d == a) {
                    ++sum4;
                }if (d==b) {
                ++sum4;
                }if (d==c) {
                ++sum4;
        }

            if (sum1 >1){
                System.out.println("Quantity of equal first digit = " +sum1);
            }if (sum2>1){
            System.out.println("Quantity of equal second digit = " +sum2);
            }if (sum3>1){
            System.out.println("Quantity of equal third digit = " +sum3);

            }if (sum4>1){
            System.out.println("Quantity of equal forth digit = " +sum4);

        }
    }}

