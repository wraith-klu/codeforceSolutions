import java.util.Scanner;

public class ShortSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0; i<x; i++){
            String s = sc.next();

            if(s.charAt(0) == 'a' || s.charAt(1) == 'b' || s.charAt(2) == 'c'){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}