import java.util.Scanner;

public class PolycarpandCoins {

// https://codeforces.com/problemset/problem/1551/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int a = sc.nextInt();

            if(a%3==0){
                int twoCoin = a/3;
                System.out.println(a/3 + " " + twoCoin);
            }else if(a%3 == 1){
                int twoCoin = a/3;
                int oneCoin = twoCoin + 1;
                System.out.println(oneCoin + " " + twoCoin);
            }else{
                int twoCoin = a/3 +1;
                System.out.println(a/3 + " " + twoCoin);
            }
        }
        sc.close();
    }
}
