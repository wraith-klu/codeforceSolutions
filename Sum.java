import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int[] a = new int[3];
            for(int j=0; j<3; j++){
                a[j] = sc.nextInt();
            }

            Arrays.sort(a);

            for(int j=0; j<3; j++){
                int z = a[0] + a[1];
                if(z == a[2]){
                    System.out.println("YES");
                    break;
                }else{
                    System.out.println("NO");
                    break;

                }
            }
        }
        sc.close();
    }
}
