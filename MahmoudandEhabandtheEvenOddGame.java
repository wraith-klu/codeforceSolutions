import java.util.Scanner;

// https://codeforces.com/problemset/problem/959/A

public class MahmoudandEhabandtheEvenOddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = evenOddGame(n);
        System.out.println(result);
        sc.close();
    }
    public static String evenOddGame(int n) {
        if (n % 2 == 0) {
            return "Mahmoud";
        } else {
            return "Ehab";
        }
    }
}
