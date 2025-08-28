import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n =0;
        int count = 0;
        for(int i=0; i<x; i++){
            int a = sc.nextInt();
            if(a!=n){
                count++;
                n = n*0 + a;
            }
        }
        System.out.println(count);
        sc.close();
    }
}