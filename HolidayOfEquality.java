import java.util.Arrays;
import java.util.Scanner;

public class HolidayOfEquality{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
       
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int max = a[n-1];
        int count = 0;
        for(int i=0; i<n; i++){
            count += max - a[i];
        }
        System.out.println(count);
        sc.close();
    }
}