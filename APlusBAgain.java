import java.util.Scanner;

public class APlusBAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int sum = (a/10) + (a%10);
            System.out.println(sum);
        }
        sc.close();
    }
}   
