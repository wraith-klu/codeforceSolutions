import java.util.Scanner;

public class GiftsFixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] candies = new long[n];
            long[] oranges = new long[n];
            
            long minCandies = Long.MAX_VALUE;
            long minOranges = Long.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                candies[i] = sc.nextLong();
                minCandies = Math.min(minCandies, candies[i]);
            }
            
            for (int i = 0; i < n; i++) {
                oranges[i] = sc.nextLong();
                minOranges = Math.min(minOranges, oranges[i]);
            }
            
            long moves = 0;
            for (int i = 0; i < n; i++) {
                long diffCandies = candies[i] - minCandies;
                long diffOranges = oranges[i] - minOranges;
                moves += Math.max(diffCandies, diffOranges);
            }
            
            System.out.println(moves);
        }
        sc.close();
    }
}
