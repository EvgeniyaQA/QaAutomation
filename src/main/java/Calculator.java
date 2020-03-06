public class Calculator {
    public static void main(String[] args) {

        float a = 2;
        float b = 3;


        doSum(a, b);
        doDeduction(a, b);
        doMultiply(a, b);
        doDivision(a, b);


    }

    public static void doSum(float a, float b) {
        float sum = a + b;
        System.out.println("Total sum result is " + sum);
    }

    public static void doDeduction(float a, float b) {
        float deduct = a - b;
        System.out.println("Total deduction result  is " + deduct);
    }

    public static void doMultiply(float a, float b) {

        float multiply = a * b;
        System.out.println("Total multiply result is " + multiply);
    }

    public static void doDivision(float a, float b) {
        float division = a / b;
        System.out.println("Total division result  is " + division);

    }


}

