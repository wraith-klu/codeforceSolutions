import java.util.Scanner;

public class Buttons {

//https://codeforces.com/problemset/problem/1858/A

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int result = buttons(a, b, c);
            if(result == 0) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        sc.close();
    }
    public static int buttons(int a, int b, int c){
        int aSum = a + (int)Math.ceil(c / 2.0);
        int bSum = b + c/2;

        if(aSum > bSum){
            return 0;
        }else{
            return 1;
        }
    }
}
