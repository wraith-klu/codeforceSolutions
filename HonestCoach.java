import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1360/B

public class HonestCoach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int result = honestCoach(a, n);
            System.out.println(result);
        }
        sc.close();
    }
    public static int honestCoach(int[] a, int n) {
        int minDiff = Integer.MAX_VALUE;
        int j =0;
        for(int i=1; i<n; i++){
            int diff = Math.abs(a[i] - a[j]);
            if(diff < minDiff) {
                minDiff = diff;
            }
            j++;
        }
        return minDiff;
    }
}
