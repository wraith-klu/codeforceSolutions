import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int crime = 0;
        int police = 0;
        for(int i=0; i<n; i++){
            if(a[i] == -1){
                if(police > 0){
                    police--;
                }else{
                    crime++;
                }
            }else{
                police += a[i];
            }
        }
        System.out.println(crime);
        sc.close();
    }
}