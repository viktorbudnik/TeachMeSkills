package homework4;

import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int num1 = 1;
        int num2 = 1;
        int result;
        System.out.print(num1 + " " + num2 + " ");
        for (int x = 3; x <= 11; x++) {
            result = num2 + num1;
            num1 = num2;
            num2 = result;
            System.out.print(result + " ");
        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposit sum: ");
        float sum = scanner.nextFloat();
        System.out.print("Enter amount of month: ");
        int month = scanner.nextInt();
        {
            int x;
            for (x = 1; x <= month; x++) {
                sum = (float) (sum + (sum * 0.07));
            }
            System.out.println(sum);
        }
    }

    public static void task3() {
        int x, y;
        for (x = 1; x < 10; x++) {
            for (y = 1; y < 10; y++) {
                System.out.print(x * y + "|");
            }
            System.out.println(" ");
        }
    }
}