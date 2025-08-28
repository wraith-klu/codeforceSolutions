import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cost = sc.nextInt();
        int coin = sc.nextInt();

        int count =0;
        for(int i=1; i<1000; i++){
            int newCost = cost * i;
            int rem = newCost % 10;
            count++;
            if(rem == coin || rem == 0){
                System.out.println(count);
                break;
            }
        }
        sc.close();
    }
}
