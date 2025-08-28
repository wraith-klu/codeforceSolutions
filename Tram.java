import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int max = 0;
        int current = 0;
        for (int i = 0; i < n; i++) {
            current += b[i] - a[i];
            if (current > max) {
                max = current;
            }
        }
        System.out.println(max);
        sc.close();
    }                       
}
