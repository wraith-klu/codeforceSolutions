import java.util.Scanner;

public class LuckyCodeforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for(int i=0; i<no; i++){
            int x = sc.nextInt();
            int a = x%10;
            int a1 = x/10;
            int b = a1%10;
            int b1 = a1/10;
            int c = b1%10;

            int sum1 = a+b+c;

            int c1= b1/10;
            int m = c1 % 10;
            int m1 = c1/10;
            int n = m1 % 10;
            int n1 = m1/10;
            int o = n1 % 10;

            int sum2 = m+n+o;

            if(sum1 == sum2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
