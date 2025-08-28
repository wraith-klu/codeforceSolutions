import java.util.Arrays;
import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int u=0; u<t; u++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int product = a[0] + 1;
            for(int i=1; i<n; i++){
                product *= a[i];
            }
            System.out.println(product);
        }
        sc.close();
    }
}
