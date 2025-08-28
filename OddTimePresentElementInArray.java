import java.util.Scanner;

public class OddTimePresentElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int digit = countInteger(n, a);
        System.out.println(digit);
        sc.close();
    }
    public static int countInteger(int n, int[] a){
        int digit = 0;
        for(int i=0; i<n; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count%2 != 0){
                digit = a[i];            
            }
        }
        return digit;
    }
}
