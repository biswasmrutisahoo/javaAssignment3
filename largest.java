import java.util.Scanner;
class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        String a = sc.next();
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) % 2 != 0){    

                break;}
            if (a.charAt(i) % 2 == 0)
                a = a.substring(0, i);
        }
        System.out.println(a);

    }
}
