import java.util.Arrays;
import java.util.Scanner;

public class PlusOneOnTheSubset {

// https://codeforces.com/problemset/problem/1624/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            int result = operation(n, a);
            System.out.println(result);
        }
        sc.close();
    }
    static int operation(int n , int[]a){
        Arrays.sort(a);

        int result = a[n-1] - a[0];

        return result;
    }
}
