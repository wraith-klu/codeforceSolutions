import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cost1 = n * a;
        int cost2 = (n / m) * b + (n % m) * a;
        int cost3 = ((n + m - 1) / m) * b;

        int minCost = Math.min(cost1, Math.min(cost2, cost3));
        System.out.println(minCost);

        sc.close();
    }
}
