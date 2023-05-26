package homework4;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
        public static void task1 () {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter month number: ");
            int monthNumber = scanner.nextInt();

            switch (monthNumber)
            {
                case 1, 2, 12:
                    System.out.println("Winter");
                    return;
                case 3, 4, 5:
                    System.out.println("Spring");
                    return;
                case 6, 7, 8 :
                    System.out.println("Summer");
                    return;
                case 9, 10, 11 :
                    System.out.println("Autumn");
                    return;
                default:
                    System.out.println("Please, enter correct number");
            }
        }
        public static void task2 () {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter month number: ");
            int monthNumber = scanner.nextInt();

            if (monthNumber == 1||monthNumber == 2||monthNumber == 12) {
                System.out.println("Winter");
            } else if (monthNumber == 3||monthNumber == 4||monthNumber == 5) {
                System.out.println("Spring");
            } else if (monthNumber == 6||monthNumber == 7||monthNumber == 8) {
                System.out.println("Summer");
            } else if (monthNumber == 9||monthNumber == 10||monthNumber == 11){
                System.out.println("Autumn");
        }else{
            System.out.println("Please, enter correct number");
            }
        }
        public static void task3 () {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            int result = num%2;
            if (result == 1){
                System.out.println("odd number");
            }else{
            System.out.println("even number");
            }
        }
        public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature degree: ");
        int t = scanner.nextInt();
        String res = t>-5 ? "Warm" : t>-20 ? "Normal" : "Cold";
        System.out.println(res);
    }
        public static void task5() {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter number, from 1 to 7: ");
                int number = scanner.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("Red");
                        return;
                    case 2:
                        System.out.println("Orange");
                        return;
                    case 3:
                        System.out.println("Yellow");
                        return;
                    case 4:
                        System.out.println("Green");
                        return;
                    case 5:
                        System.out.println("Blue");
                        return;
                    case 6:
                        System.out.println("Indigo");
                        return;
                    case 7:
                        System.out.println("Violet");
                        return;
                    default:
                        System.out.println("Please, enter correct number");
                }

        }


}
