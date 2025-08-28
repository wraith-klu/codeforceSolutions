import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % b == 0) {
                System.out.println(0);
            } else {

                int c = a / b;

                int d = b * (c + 1);

                int count = d - a;
                // int count=0;
                // while (a%b == 0) {
                // count++;
                // a++;
                // }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
