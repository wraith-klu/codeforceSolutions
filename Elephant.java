import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int steps = x / 5;
        if (x % 5 != 0) {
            steps++;
        }

        System.out.println(steps);

        sc.close();
    }
}
