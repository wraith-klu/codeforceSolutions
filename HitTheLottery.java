import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = billNo(n);
        System.out.println(count);
        sc.close();
    }
    public static int billNo(int n){
        int count =0;
        while(n>0){
            if(n>=100){
                count = count+ (n/100);
                n = n % 100;
            }else if(n>=20){
                count = count + (n/20);
                n = n%20;
            }else if(n>=10){
                count += n/10;
                n = n%10;
            }else if(n>=5){
                count += n/5;
                n = n%5;
            }else{
                count += n;
                n = n%1;
            }
        }
        return count;
    }
}
