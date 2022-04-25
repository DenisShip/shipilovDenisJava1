package shipilovJava1.homeWork3;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        replaceOneWithZero();
        fillArray();
        smallNumberIncrease();
        fillTableDiagonal();
        System.out.println(Arrays.toString(lenInitialValue(5, 3)));
        //minMaxElementInArray();


    }

    public static void replaceOneWithZero() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int j : arr) {
            if (j == 1) {
                System.out.print(" " + 0);
            } else {
                System.out.print(" " + 1);
            }

        }

        System.out.println();
    }


    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

            System.out.print(array[i] + " ");
        }
        System.out.println();


    }


    public static void smallNumberIncrease() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j : array) {
            if (j < 6) {
                System.out.print(j * 2 + " ");
            } else {
                System.out.print(j + " ");
            }

        }
        System.out.println();
    }


    public static void fillTableDiagonal() {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j)
                    System.out.print(0 + " ");
                if (i != j)
                    System.out.print(1 + " ");


            }
            System.out.println();
        }

    }


    public static int[] lenInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }


    /* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void minMaxElementInArray() {
        int[] array = {5, 7, 2, 1, 0, 9, 12, 15, 1, -1};
        //Random  Random = new  Random();
        // array [i] = Random.nextInt(10);
        // System.out.print(array [i] + " ");
        int min = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array [i] ;
                System.out.print(min);

            }


        }
*/

}





