import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int abc = cutRibbon(n, a, b, c);
        System.out.println(abc);
        sc.close();
    }
    
    public static int cutRibbon(int n, int a, int b, int c){
        int abc = 0; 
        
        if(n == c){
            abc = 1;
        }else if(n == b + c){
            abc = 2;
        }else if(n == a + b + c){
            abc = 3;
        }
        
        return abc;
    }
}
