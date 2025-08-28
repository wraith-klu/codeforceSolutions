import java.util.Scanner;

public class IQtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int evenCount =0;
        int oddCount = 0;
        for(int i=0; i<n; i++){
            if(a[i]% 2 ==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        if(evenCount == 1){
            for(int i = 0; i<n; i++){
                if(a[i]%2 == 0){
                    System.out.println(i + 1);
                }
            }
        }else if(oddCount == 1){
            for(int i=0; i<n; i++){
                if(a[i]%2 != 0){
                    System.out.println(i + 1);
                }
            }
        }
        sc.close();
    }
}
