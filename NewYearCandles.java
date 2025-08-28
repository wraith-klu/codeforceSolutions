import java.util.Scanner;

public class NewYearCandles {

// https://codeforces.com/problemset/problem/379/A

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = newYearCandles(a, b);
        System.out.println(result);
        sc.close();
    }
    public static int newYearCandles(int a, int b) {
        int totalHours = 0;
        int burned = 0;
        while (a > 0) {
            totalHours += a;
            burned += a;
            a = burned / b;
            burned = burned % b;
        }
        return totalHours;
    }
}