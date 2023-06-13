package homework8_2.task1;

import java.util.Arrays;

import static homework8_2.task1.Figures.getPerimeterSum;

public class MainFigures {
    public static void main(String[] args) {
        Figures[] figures = new Figures[]{
                new Triangle(5, 10, 10),
                new Triangle(25, 25, 50),
                new Rectangle(30, 20),
                new Rectangle(10, 15),
                new Circle(20)
        };
            System.out.println(Arrays.toString(figures));
            System.out.println("Sum of the perimeter of all figures "+getPerimeterSum(figures));
    }



    }

