import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x>0) {
            int z = x%10;
            System.out.print(z);

            x /=10;
            
        }

        sc.close();
    }
}
