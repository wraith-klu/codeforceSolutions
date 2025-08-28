import java.util.Scanner;

public class TwoButtons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = minReq(a,b);
        System.out.println(result);

        sc.close();
    }
// https://codeforces.com/contest/520/problem/B
    
    public static int minReq(int n, int m){
        if (n >= m) {
            return n - m;
        }

        int steps = 0;
        while (m > n) {
            if ((m & 1) == 1) {
                m += 1; // inverse of blue button (-1) is +1
                steps++;
            } else {
                m >>= 1; // inverse of red button (*2) is /2
                steps++;
            }
        }

        // Now m <= n; the only way is to decrement n to m
        steps += (n - m);
        return steps;
    }
}
