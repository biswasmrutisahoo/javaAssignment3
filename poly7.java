import java.util.Scanner;

class box {
    double height, length, bredth;

    box(double h, double l, double b) {
        height = h;
        length = l;
        bredth = b;
    }

    box(double k) {
        height = length = bredth = k;
    }

    public double volume() {
        return height * length * bredth;
    }
}

public class poly7 {
    public static void main(String[] args) {
        System.out.println("enter 0 for square and any else no. for rectangle");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("enter length of square");
            double length = sc.nextDouble();
            box obj1 = new box(length);
            System.out.println("volume of square is =" + obj1.volume());
        } else {
            System.out.println("enter height");
            double height = sc.nextDouble();
            System.out.println("enter lenght");
            double length = sc.nextDouble();
            System.out.println("enter bredth");
            double bredth = sc.nextDouble();
            box obj2 = new box(height, length, bredth);
            System.out.println("volume of rectangular box is" + obj2.volume());
        }
    }
}
