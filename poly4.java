import java.util.Scanner;

public class poly4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 0 for simple intrest and any other no. for compound intrest");
        int a = sc.nextInt();
        System.out.println("enter the time");
        double time = sc.nextDouble();
        System.out.println("enter the principal");
        double principal = sc.nextDouble();
        System.out.println("enter the rate");
        double rate = sc.nextDouble();

        if (a == 0) {
            System.out.println("the simple intrest is" + intrest(time, rate, principal));
        } else {
            System.out.println("enter the no. of time to be compounded");
            double noOfTime = sc.nextDouble();
            System.out.println("the compond intrest is" + interest(time, rate, principal, noOfTime));
        }
    }

    public static double intrest(double t, double r, double p) {
        double i = (t * r * p) / 100;
        return i;
    }

    public static double interest(double t, double r, double p, double n) {
        double a = Math.pow(1 + (r / (n * 100)), (n * t));
        double i = p * a - p;
        return i;
    }

}
