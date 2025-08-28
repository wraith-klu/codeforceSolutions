import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            int z = (a - b) / 2;
            System.out.println(b + " " + z);
        }else{
            int z = (b - a) / 2;
            System.out.println(a + " " + z);
        }
        sc.close();
    }
}
