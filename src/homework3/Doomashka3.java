package homework3;

import java.util.Scanner;
public class Doomashka3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
        public static void task1 ()
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Surname: ");
            String surname = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Height: ");
            int height = scanner.nextInt();

            System.out.print("Weight: ");
            double weight = scanner.nextDouble();

            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);

        }
        public static void task2 ()
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a symbol: ");
            char symbol = scanner.nextLine().charAt(0);

            System.out.println(symbol + " - " + (int) symbol);
        }
        public static void task3 ()
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please, enter your height,cm.: ");
            int height = scanner.nextInt();

            System.out.print("Please, enter your weight,kg.: ");
            double weight = scanner.nextDouble();

            double result = weight/((height*0.01)*(height*0.01));
            String resultFormat = String.format("%.1f",result);

            System.out.println("Your BMI - "+resultFormat);
        }
    }

