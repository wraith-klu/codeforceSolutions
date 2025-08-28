import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count =0;
        for(int i=0; i<b; i++){
            int d = sc.nextInt();
            int bonus = sc.nextInt();
            if(a>d){
                count++;
                a = a+bonus;
            }else{
                System.out.println("NO");
            }
        }
        if(count == b){
            System.out.println("YES");
        }
        sc.close();
    }
}
