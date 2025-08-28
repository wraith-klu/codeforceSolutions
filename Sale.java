// https://codeforces.com/problemset/problem/34/B

import java.util.*;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n && count < m; i++) {
            if (a[i] < 0) {
                sum += -a[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
