import java.util.Scanner;

public class poly1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for circle,2 for square ,3 for rectangle,4 for triangle");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("enter radius");
            double radius = sc.nextDouble();
            System.out.println("the perimeter is " + perimeter(radius) + " and area is " + area(radius));
        } else if (a == 2) {
            System.out.println("enter side");
            int side = sc.nextInt();
            System.out.println("the perimeter is " + perimeter(side) + " and area is " + area(side));
        } else if (a == 3) {
            System.out.println("enter length and breadth");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            System.out
                    .println(
                            "the perimeter is " + perimeter(length, breadth) + " and area is " + area(length, breadth));
        } else {
            System.out.println("enter the three sides");
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int side3 = sc.nextInt();
            System.out.println(
                    "the perimeter is " + perimeter(side1, side2, side3) + " and area is " + area(side1, side2, side3));
        }

    }

    public static double area(double r) {
        return 3.15 * r * r;
    }

    public static int area(int s) {
        return s * s;
    }

    public static int area(int l, int b) {
        return l * b;
    }

    public static double area(int a, int b, int c) {
        double s = (a + b + c) / 2;
        double ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return ar;
    }

    public static double perimeter(double r) {
        return 2 * 3.15 * r;
    }

    public static int perimeter(int s) {
        return 4 * s;
    }

    public static int perimeter(int l, int b) {
        return 2 * (l + b);
    }

    public static double perimeter(int a, int b, int c) {
        return a + b + c;
    }

}
