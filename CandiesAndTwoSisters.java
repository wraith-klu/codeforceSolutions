import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a%2 == 0){
                int ways = a/2 -1;
                System.out.println(ways);
            }else{
                System.out.println(a/2);
            }
        }
        sc.close();
    }
}
