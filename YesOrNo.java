import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0; i<x; i++){
            String s = sc.next();

            if (s.length() > 0 && (s.charAt(0) == 'Y' || s.charAt(0) == 'y')&& (s.charAt(1) == 'E' || s.charAt(1) == 'e') && (s.charAt(2) == 'S' || s.charAt(2) == 's')) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
