import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = binaryToDecimal(num);
        System.out.println(n);
        sc.close();

    }

    public static int binaryToDecimal(int num) {
        int rem, i = 0, n = 0;
        while (num > 0) {
            rem = num % 10;
            n += rem * Math.pow(2, i);
            i++;
            num /= 10;
        }
        return n;
    }
}
