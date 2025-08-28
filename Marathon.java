import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int[] a = new int[4];
            for (int j = 0; j < 4; j++) {
                a[j] = sc.nextInt();
            }
            int count = getCount(a);
            System.out.println(count);
        }

        sc.close();
    }

    static int getCount(int[] a) {
        int count = 0;
        for (int j = 1; j < 4; j++) {
            if (a[0] < a[j]) {
                count++;
            }
        }
        return count;
    }
}
