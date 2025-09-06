import java.util.Scanner;

public class EvenArray {

// https://codeforces.com/problemset/problem/1367/B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int oddAtEven = 0, evenAtOdd = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 && a[i] % 2 == 1) {
                    oddAtEven++;
                } else if (i % 2 == 1 && a[i] % 2 == 0) {
                    evenAtOdd++;
                }
            }
            
            System.out.println(oddAtEven == evenAtOdd ? oddAtEven : -1);
        }
        sc.close();
    }
}
