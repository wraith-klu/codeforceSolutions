import java.util.Scanner;


public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == b){
                System.out.println(0);
           
            }else if(a>b){
                int z = a-b;

                int y = z/10;

                if(z%10 == 0){
                    System.out.println(y);
                }else{
                    System.out.println(y+1);
                }
            }else{
                int z = b-a;

                int y = z / 10;

                if (z % 10 == 0) {
                    System.out.println(y);
                } else {
                    System.out.println(y + 1);
                }
            }
        }
        sc.close();
    }
}
