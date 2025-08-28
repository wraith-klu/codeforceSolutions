import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1535/A

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int[] a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = sc.nextInt();
            }
            int result = checkWinner(a);
            if(result == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
        sc.close();
    }

    public static int checkWinner(int[] a) {
        int[] b = a.clone();
        Arrays.sort(b);
        int player1 = b[3];
        int player2 = b[2];

        int winner1 = Math.max(a[0], a[1]);
        int winner2 = Math.max(a[2], a[3]);

        if ((winner1 == player1 || winner1 == player2) && (winner2 == player1 || winner2 == player2)) {
            return 1;
        } else {

            return 0;
        }
    }
}
