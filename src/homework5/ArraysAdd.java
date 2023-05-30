package homework5;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysAdd {
    public static void main(String[] args) {
        task4();
        task5();
        task6();
        task7();
    }

    public static void task4() {
        System.out.println("||||task4||||");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter arrays length from 6 to 10: ");
        int length = 0;

        while ((length <= 5 || length > 10)) {
            length = scanner.nextInt();
            if ((length <= 5 || length > 10)) {
                System.out.println("Please, enter correct number");
            }
        }
        int[] myArray1 = new int[length];
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = ((int) (Math.random() * 10));
            System.out.print(myArray1[i] + " ");
        }
        int[] myArray2 = new int[length];
        System.arraycopy(myArray1, 0, myArray2, 0, length);
        System.out.println(" ");
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] % 2 == 0) {
                System.out.print(myArray2[i] + " ");
            }
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("||||task5||||");
        int[] array = {2, 3, 6, 7, 8, 1};
        System.out.println(Arrays.toString(array));
        int[] arrayNew = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                arrayNew[i] = array[i];
            } else {
                arrayNew[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayNew));
    }

    public static void task6() {
        System.out.println("||||task6||||");
        String[] names = new String[]{"Volodimir", "Valery", "Caren", "Luke"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }

    public static void task7() {
        System.out.println("||||task7||||");
        int[] array = {4, 2, 1, 5, 3};
        System.out.print(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
