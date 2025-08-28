import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();

            int sum = sumCalculation(s);
            System.out.println(sum);
        }
        sc.close();
    }
    public static int sumCalculation(String s){
        int a = s.charAt(0) - '0'; // convert first char to number
        int b = s.charAt(2) - '0'; // convert third char to number
        return a + b;
    }
}
