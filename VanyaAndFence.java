import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();

        int[] a = new int[n];

        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }


        int sum=0;

        for(int i =0; i<n; i++){
            if(a[i] >h){
                sum = sum + 2;
            }else{
                sum = sum + 1;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
