import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = decimalToOctal(num);
        System.out.println(n);
        sc.close();

    }

    public static int decimalToOctal(int num) {
        int rem, i = 0, n = 0;
        while (num > 0) {
            rem = num % 8;
            n += rem * Math.pow(10, i);
            i++;
            num /= 8;
        }
        return n;
    }
}
