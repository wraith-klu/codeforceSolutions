import java.util.Scanner;

public class OctalTodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = octalTodecimal(num);
        System.out.println(n);
        sc.close();

    }

    public static int octalTodecimal(int num) {
        int rem, i = 0, n = 0;
        while (num > 0) {
            rem = num % 10;
            n += rem * Math.pow(8, i);
            i++;
            num /= 10;
        }
        return n;
    }
}
