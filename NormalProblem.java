import java.util.Scanner;

// https://codeforces.com/problemset/problem/2044/B

public class NormalProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String result = solve(s);
            System.out.println(result);
        }
        sc.close();
    }

    public static String solve(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == 'q') {
                result.append('p');
            } else if (ch == 'p') {
                result.append('q');
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
