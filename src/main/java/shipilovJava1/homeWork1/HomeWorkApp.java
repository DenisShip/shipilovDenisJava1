package shipilovJava1.homeWork1;

public class HomeWorkApp {

        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

        }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");

        }

        public static void checkSumSign() {
            int a = -5;
            int b = -6;
            if ((a + b) >= 0) {
                System.out.println("Сумма положительная");}
            else {
                System.out.println("Сума отрицательна");
            }

        }

        public static void printColor() {
            int value = 50;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 100) {
                System.out.println("Зеленый");
            } else {
                System.out.println("Желтый");
            }
        }
        public static void compareNumbers(){
            int a = 12;
            int b = 7;
            if ( a>= b) {
                System.out.println("a >= b");
            } else {
                System.out.println( b > a);
            }
        }


    }
