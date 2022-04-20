package shipilovJava1.homeWork2;


public class HomeWork {
    public static void main(String[] args) {


        System.out.println(sumNumber(10, 15));
        positiveNegativeNumberPrint(0);
        System.out.println(positiveNegativeNumberReturn(7));
        printText("Text", 6);
        System.out.println(yearLeap(2400));



        //  5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    }

    public static boolean sumNumber(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;

    }

    public static void positiveNegativeNumberPrint(int a) {
        if (a >= 0) {
            System.out.println("Digit " + a + " positive");
        } else {
            System.out.println("Digit " + a + " negative");
        }
    }

    public static boolean positiveNegativeNumberReturn(int a) {

        return a < 0;

    }

    public static void printText(String args, int print) {

        for (int i = 0; i < print; i++) {
            System.out.print(args + " ");
        }
        System.out.println();


    }

    public static boolean yearLeap (int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 !=0 );

    }
}

