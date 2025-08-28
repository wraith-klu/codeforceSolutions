import java.util.Scanner;

// https://codeforces.com/problemset/problem/1921/A

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int[] x = new int[4];
            int[] y = new int[4];
            
            // Read coordinates
            for (int i = 0; i < 4; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
            
            // Find side length by finding unique x or y values
            int side = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (x[i] == x[j]) {
                        side = Math.abs(y[i] - y[j]);
                        break;
                    }
                }
                if (side > 0) break;
            }
            
            System.out.println(side * side);
        }
        sc.close();
    }
}
