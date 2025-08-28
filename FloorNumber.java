import java.util.Scanner;

// https://codeforces.com/problemset/problem/1901/A

public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int result = floorNumber(n, x);
            System.out.println(result);
        }
        sc.close();
    }

    public static int floorNumber(int n, int x) {
        if (n <= 2) {
            return 1; // First floor
        } else {
            return ((n - 3) / x) + 2;
        }
    }
}
