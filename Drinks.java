import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        float juice = drink(n, a);
        System.out.println(juice);

        sc.close();
        
    }
    public static float drink(int n, int[] a){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i];
        }

        float juice = (float)sum/n;

        return juice;
    }
}
