package homework4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        for (int i = 0; i < 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void task2() {
        for (int n = 5; n > 1; n--) {
            System.out.println(n);
        }
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter positive integer: ");
        int posInt = scanner.nextInt();
        {
            int y = 0;
            for (int x = 1; x <= posInt; x++) {
                y = y + x;
            }
            System.out.println(y);
        }
    }

    public static void task4() {
        int y = 7, x = 1, z = 1;
        while (z < 98) {
            z = y * x++;
            System.out.print(z + " ");
        }
    }

    public static void task5() {
        for (int x = 0; x > -50; x = x - 5) {
            System.out.print(x+" ");
        }
    }

    public static void task6() {
        for (int x = 10; x <= 20; x++) {
            System.out.println(x * x);
        }
    }

}
