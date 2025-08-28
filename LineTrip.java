import java.util.Scanner;

// https://codeforces.com/problemset/problem/1901/A?csrf_token=bd037e7697910f3e2f9cc399f540fa9d

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int max = lineTrip(a, n, x);
            System.out.println(max);
        }
        sc.close();
    }

    public static int lineTrip(int[] a, int n, int x) {
        int start = 0;
        int max = 2 * (x - a[n - 1]);
        for (int i = 0; i < n; i++) {
            int distance = a[i] - start;
            if (distance > max) {
                max = distance;
            }
            start = a[i];
        }
        return max;
    }
}