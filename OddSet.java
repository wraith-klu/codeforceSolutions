import java.util.Scanner;

// https://codeforces.com/problemset/problem/1542/A

public class OddSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                a[i] = sc.nextInt();
            }
            boolean result = resultCheck(a, n);
            System.out.println(result ? "Yes" : "No");
        }
        sc.close();
    }

    public static boolean resultCheck(int[] a, int n) {
        int countOdd = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (a[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd == n;  
    }
}
