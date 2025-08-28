import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String b = sc.nextLine();
            String a = "";

            a += b.charAt(0);

            for (int i = 1; i < b.length(); i += 2) {
                a += b.charAt(i);
            }

            System.out.println(a);
        }

        sc.close();
    }
}
