import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[4];
        for (int i = 0; i < 4; i++) {
            a1[i] = sc.nextInt();
        }
        Arrays.sort(a1);
        int sum = a1[3];
        int ab = a1[0];
        int ac = a1[1];
        int bc = a1[2];
        int a = sum - bc;
        int b = sum - ac;
        int c = sum - ab;
        System.out.println(a + " " + b + " " + c);

        sc.close();
    }
}
