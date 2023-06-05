package homework6;

import java.util.Scanner;
import java.util.Random;

public class ArraysMultiple {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("||||task1||||");

        int[][][] tripleArray = {
                {
                        {14, 28, 15},
                        {16, 23, 42},
                        {63, 72, 15}
                }
        };
        for (int x = 0; x < tripleArray.length; x++) {
            for (int y = 0; y < tripleArray[x].length; y++) {
                for (int z = 0; z < tripleArray[x][y].length; z++) {
                    System.out.print(tripleArray[x][y][z] + " ");
                }
                System.out.println();
            }
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num = scanner.nextInt();
        System.out.println("New array:");
        for (int x = 0; x < tripleArray.length; x++) {
            for (int y = 0; y < tripleArray[x].length; y++) {
                for (int z = 0; z < tripleArray[x][y].length; z++) {
                    tripleArray[x][y][z] = tripleArray[x][y][z] + num;
                    System.out.print(tripleArray[x][y][z] + "  ");
                }
                System.out.println();
            }
        }
    }

    public static void task2() {
        System.out.println("||||task2||||");

        String[][] chess = new String[8][8];

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if (i % 2 == j % 2) {
                    chess[i][j] = "W";
                } else {
                    chess[i][j] = "B";
                }
                System.out.print(chess[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("||||task3||||");
        System.out.println("First array: ");

        int[][] firstArray = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondArray = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] totalArray = new int[firstArray.length][secondArray.length];
        for (int x = 0; x < firstArray.length; x++) {
            for (int y = 0; y < firstArray[x].length; y++) {
                System.out.print(firstArray[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Second array: ");
        for (int a = 0; a < secondArray.length; a++) {
            for (int b = 0; b < secondArray[a].length; b++) {
                System.out.print(secondArray[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Result: ");
        for (int i = 0; i < totalArray.length; i++) {
            for (int j = 0; j < totalArray.length; j++) {
                for (int k = 0; k < secondArray.length; k++) {
                    totalArray[i][j] += firstArray[i][k] * secondArray[k][j];
                }
            }
        }
        for (int i = 0; i < totalArray.length; i++) {
            for (int j = 0; j < totalArray.length; j++) {
                System.out.print(totalArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task4() {
        System.out.println("||||task4||||");

        int total = 0;
        int[][] twoDimArray = {{1, 3, 5, 1}, {2, 20, 5}};
        for (int x = 0; x < twoDimArray.length; x++) {
            for (int y = 0; y < twoDimArray[x].length; y++) {
                total += twoDimArray[x][y];
                System.out.print(twoDimArray[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of array numbers: " + total);
    }

    public static void task5() {
        System.out.println("||||task5||||");
        int[][] xArray = {
                {1, 2, 3, 2},
                {4, 5, 6, 6},
                {7, 8, 9, 7},
                {7, 8, 9, 8}
        };
        for (int x = 0; x < xArray.length; x++) {
            for (int y = 0; y < xArray[x].length; y++) {
                if (x == y || xArray.length - x - 1 == y)
                    System.out.print(xArray[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        System.out.println("||||task6||||");
        int[][] randomArray = new int[4][3];
        Random random = new Random();


        for (int x = 0; x < randomArray.length; x++) {
            for (int y = 0; y < randomArray[x].length; y++) {
                randomArray[x][y] = random.nextInt(10, 99);
                System.out.print((randomArray[x][y]) + " ");
            }
            System.out.println();
        }
        int sort= 0;
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                for (int f = 0; f < randomArray.length; f++) {
                    for (int g = 0; g < randomArray[f].length; g++) {
                        if (randomArray[f][g] > randomArray[i][j]) {
                            sort = randomArray[f][g];
                            randomArray[f][g] = randomArray[i][j];
                            randomArray[i][j] = sort;
                        }
                    }
                }
            }
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < randomArray.length; ++i) {
            for (int j = 0; j < randomArray[i].length; ++j) {
                System.out.print(randomArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}



