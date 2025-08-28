import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int y = 0; y<t; y++){
            int n = sc.nextInt();
            int z = n%10;

            int count = (10 *(z-1)) ;
            while(n != 0){
                int p = String.valueOf(n).length();
                count = count + p;
                n /= 10;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
