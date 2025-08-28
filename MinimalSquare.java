import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int square = minimalSquare(a, b);
            System.out.println(square);
        }
        sc.close();
    }
    static int minimalSquare(int a, int b){
        int c = 2*(Math.min(a, b));
        int d = Math.max(Math.max(a, b), c);

        int square =(int) Math.pow(d, 2);

        return square;
    }
}
