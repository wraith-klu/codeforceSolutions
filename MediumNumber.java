import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
           
            if(a > b && a < c || a < b && a > c) {
                System.out.println(a);
            } else if(b > a && b < c || b < a && b > c) {
                System.out.println(b);
            } else if(c > a && c < b || c < a && c > b) {
                System.out.println(c);
            }   
        }
        sc.close();
    }
}

