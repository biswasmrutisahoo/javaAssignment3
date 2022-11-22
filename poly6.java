import java.util.Scanner;

public class poly6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for integer and 0 for string");
        int h = sc.nextInt();
        if (h == 0) {
            System.out.println("enter a string");
            String b = sc.next();
            if (b.equals(checkPalindrome(b)))
                System.out.println("is palindrome");
            else
                System.out.println("not palindrome");
        } else {
            System.out.println("enter a no.");
            int b = sc.nextInt();
            if (b == checkPalindrome(b))
                System.out.println("is palindrome");
            else
                System.out.println("not palindrome");
        }

    }

    public static int checkPalindrome(int r) {
        int a = 0;
        while (r != 0) {
            a = (a * 10) + (r % 10);
            r = r / 10;
        }
        return a;
    }

    public static String checkPalindrome(String j) {
        String k = "";
        char c;
        for (int i = 0; i < j.length(); i++) {
            c = j.charAt(i);
            k = c + k;
        }
        return k;
    }
}
