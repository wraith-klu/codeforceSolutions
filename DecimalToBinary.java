import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = decimalToBinary(num);
        System.out.println(n);
        sc.close();

    }
    public static int decimalToBinary(int num){
        int rem, i=0, n=0;
        while (num>0) {
            rem = num%2;
            n += rem * Math.pow(10, i);
            i++;
            num /= 2;
            
        }
        return n;
    }
}
