package homework5;

import java.util.Scanner;
import java.util.Arrays;


public class ArraysBase {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
    }

    public static void task0() {
        System.out.println("||||task0||||");
        int[] intArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number,1-5: ");
        int num = scanner.nextInt();
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == num) {
                System.out.println("This number is in the array");
                return;
            }
            if (i == intArray.length - 1) {
                System.out.println("This number is not in the array");
            }
        }
    }

    public static void task1() {
        System.out.println("||||task1||||");
        int[] intArray = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number for delete,1-6: ");
        int num = scanner.nextInt();
        int x = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (num == intArray[i]) {
                x = x + 1;
            }
        }
        if (x == 0) {
            System.out.println("This number is not in the array");
        }
        int[] newArray = new int[intArray.length - x];
        int y = 0;

        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] != num) {
                newArray[y] = intArray[i];
                System.out.print(newArray[y] + " ");
                System.out.println();
                y = y + 1;
            }
        }
    }

    public static void task2() {
        System.out.println("||||task2||||");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter arrays length: ");
        int length = scanner.nextInt();
        int[] myArray = new int[length];

        for (int i = 0; i < length; i++) {
            myArray[i] = ((int) (Math.random() * 10));
            System.out.println(myArray[i]);
        }
        int max = myArray[0];
        int min = myArray[0];
        double mid;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            }
            if (max < myArray[i]) {
                max = myArray[i];
            }
            sum += (myArray[i]);
        }
        mid = (double) sum / length;
        System.out.println("Min value : " + min);
        System.out.println("Max value : " + max);
        System.out.println("Mid value : " + mid);
    }

    public static void task3() {
        System.out.println("||||task3||||");
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1));
        int[] array2 = {6, 7, 8, 9, 1};
        System.out.println(Arrays.toString(array2));

        int sum1 = 0;
        int sum2 = 0;
        double mid1;
        double mid2;
        for (int i = 0; i < 5; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }
        mid1 = (double) sum1 / 5;
        mid2 = (double) sum2 / 5;
        System.out.println();
        String res = mid1 > mid2 ? "Array 1 > Array 2" : mid1 < mid2 ? "Array 2 > Array 1" : "Arrays are equal";
        System.out.println(res);
    }
}






