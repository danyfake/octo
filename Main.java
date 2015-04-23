package com.company;

import java.util.Scanner;

public class Main {

    static public abstract class Figure {
        //String name = null;
        //int parameter;
    }

    static class Square extends Figure {
        //String name = "Square";

        public int getPerimeter(int x) {
            return 4 * x;
        }
    }

    static class Circle extends Figure {
        //String name = "Circle";

        public double getPerimeter(int x) {
            return x * 2 * 3.14;
        }
    }

    static class Triangle extends Figure {
        //String name = "Triangle";
        public double getPerimeter(int x, int y, int z) {
            return x + y + z;
        }
    }

    public static boolean proverka(int a, int b, int c) {
        if (a > 0 & b > 0 & c > 0 & a < (b + c) & b < (c + a) & c < (a + b))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter 0-square, 1-circle, 2-triangle: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter parameter of figure: ");
        int x = new Scanner(System.in).nextInt();

        switch (a) {
            case 0:
                Square s = new Square();
                System.out.println("Perimeter of square = " + s.getPerimeter(x));
                break;
            case 1:
                Circle c = new Circle();
                System.out.println("Perimeter of circle = " + c.getPerimeter(x));
                break;
            case 2:
                Triangle t = new Triangle();
                int y = new Scanner(System.in).nextInt();
                int z = new Scanner(System.in).nextInt();
                if (proverka(x, y, z) == true) System.out.println("Perimeter of triangle = " + t.getPerimeter(x, y, z));
                else System.out.println("Not a triangle!");
                break;
            default:
                System.out.println("Out of scope");
        }
    }
}
