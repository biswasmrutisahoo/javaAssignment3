import java.util.Scanner;

public class poly2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "enter 0 for even number pyramid,1 for odd number pyramid,any other number for charechter puramid");
        int a = sc.nextInt();
        if (a == 0) {
            double b = sc.nextDouble();
            pyramid(b);
        } else if (a == 1) {
            int c = sc.nextInt();
            pyramid(c);
        } else {
            String d = sc.next();
            pyramid(d.charAt(0));
        }

    }

    public static void pyramid(char b) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4 - i; j > 0; j--)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("b ");
            System.out.println("");
        }
    }

    public static void pyramid(int a) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4 - i; j > 0; j--)
                System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                int b = i * 2 - 1;
                int c = a + b * k;
                System.out.print(c + " ");
            }
            System.out.println("");
        }
    }

    public static void pyramid(double c) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4 - i; j > 0; j--)
                System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                double a = c + 2 + ((i - 1) * 2) * k;
                System.out.print(a + " ");
            }
            System.out.println("");
        }

    }

}
