import java.util.Scanner;

public class DivisionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a <= 1399) {
                System.out.println("Division 4");
            } else if (a <= 1599) {
                System.out.println("Division 3");
            } else if (a <= 1899) {
                System.out.println("Division 2");
            } else {
                System.out.println("Division 1" );
            }
        }

        sc.close();
    }
}
