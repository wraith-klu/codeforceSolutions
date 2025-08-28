import java.util.Scanner;

public class KeepAllZeroAtLeftSideWithoutChangingTheOriginalStructureOfArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int z = n-1;
        for (int i = n-1; i >= 0; i--) {
            if (a[i] != 0) {
                int temp = a[z];
                a[z] = a[i];
                a[i] = temp;
                z--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
