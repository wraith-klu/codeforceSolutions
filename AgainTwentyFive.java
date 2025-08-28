import java.util.Scanner;

public class AgainTwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = (int)Math.pow(5, n);
        int x = a%100;
        System.out.println(x);

        // for Codeforce
        // System.out.println("25");
        
        sc.close();
    }
}
