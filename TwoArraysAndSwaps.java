import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            // Sort a ascending, b descending
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < n / 2; i++) {
                int temp = b[i];
                b[i] = b[n - 1 - i];
                b[n - 1 - i] = temp;
            }

            // Swap at most k times if beneficial
            for (int i = 0; i < k; i++) {
                if (a[i] < b[i]) {
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                } else {
                    break; // No point swapping if it doesn't improve
                }
            }

            // Calculate sum of a
            int sum = 0;
            for (int val : a) {
                sum += val;
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
