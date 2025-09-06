import java.util.Scanner;

// https://codeforces.com/problemset/problem/1296/A

public class ArraywithOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int oddCount = 0;
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num % 2 == 1) {
                    oddCount++;
                }
                sum += num;
            }
            
            if (sum % 2 == 1) {
                System.out.println("YES");
            } else if (oddCount > 0 && oddCount < n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
