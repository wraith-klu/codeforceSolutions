import java.util.Arrays;
import java.util.Scanner;

public class EqualCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc =0; tc<t; tc++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int noOfCandy = candyCount(n, a);
            System.out.println(noOfCandy);
        }
        sc.close();
    }
    static int candyCount(int n, int[]a){
        Arrays.sort(a);

        int sum =0;
        int eat = a[0];
        for (int i = 0; i < n; i++) {
            sum += a[i] - eat;
        }
        return sum;
    }
}
