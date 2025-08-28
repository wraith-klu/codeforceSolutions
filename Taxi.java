import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int count = taxiCount(n, a);
        System.out.println(count);
        sc.close();

    }
    public static int taxiCount(int n, int[] a){
        int sum =0;
        for(int i=0; i<n; i++){
            sum += a[i];
        }
        int count = 0;
        if(sum % 4 == 0){
            count += sum/4;
        }else{
            count += sum/4 + 1;
        }

        return count;
    }
}
