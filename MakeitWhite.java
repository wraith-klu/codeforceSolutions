import java.util.Scanner;

// https://codeforces.com/problemset/problem/1927/A

public class MakeitWhite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();

            int result = makeItWhite(n, s);
            System.out.println(result);
        }
        sc.close();
    }

    public static int makeItWhite(int n, char[] s) {
        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == 'B') {
                startIndex = i;
                break;
            }
        }

        int endIndex = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s[i] == 'B') {
                endIndex = i;
                break;
            }
        }

        // The minimum segment is just the distance between the first and last 'B' inclusive
        return endIndex - startIndex + 1;
    }
}
