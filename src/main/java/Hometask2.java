/*
I. 1) Создать новй проект и обьявить в нем 8 типов данных
2)Обьявить две переменные с заданным значением и произвести с ними математические действия: "+", "-", " * ", "/" ;
3)Провести инкремент и декремент любой выбранной переменной
4) Ппопроовать разобраться с оператором " % " ;
II. Разобраться с переменной типа char;
III. Зарегистрировать аккаунт на гитхабе,скопировать код вашей "программы" и линку приатачить в решении задания);
*/
public class Hometask2 {
    public static void main(String[] args) {
        int a;// -2147483648 ...21474836347
        long b;// -9223372036854775808... 9223372036854775807
        byte c;//-128 ...127
        short d;// -32768...32767
        boolean e;//false true
        char f;//одиночный символ в кодировке UTF-16
        float g;// -3.4*1038 до 3.4*1038
        double h;// ±4.9*10-324 до ±1.8*10308

        double i = 8.1;
        double j = 10.00;
        double k = i+j;
        double l = i-j;
        double m = i/j;
        double n = i*j;
        char o = 102;
        ++i;
        --j;

        int z =100%2;
        int y =45%3;
        double  x = 12% 7.5;

        char ch1 = 67;
        char ch2 = 'a';
        char ch3 = 116;




        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println("------------------------");
        System.out.println(i);
        System.out.println(j);
        System.out.println("------------------------ ");
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
        System.out.println("------------------------ ");
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);


    }
}