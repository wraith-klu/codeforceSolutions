import java.util.Scanner;

public class SoilderAndBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalCost = 0;
        for (int i = 1; i <= w; i++) {
            totalCost += k * i;
        }

        if (totalCost > n) {
            System.out.println(totalCost - n);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}