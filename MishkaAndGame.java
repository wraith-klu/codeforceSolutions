import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int mithika = 0;
        int chris = 0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                mithika++;
            }else if (b>a) {
                chris++;
            }
           
        }
        if(mithika>chris){
            System.out.println("Mishka");
        }else if (chris>mithika) {
            System.out.println("Chris");
        }else{
            System.out.println("Friendship is magic!^^");
        }
        sc.close();
    }
}
