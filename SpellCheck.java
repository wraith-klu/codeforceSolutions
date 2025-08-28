import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int y = 0; y < x; y++) {
            int n = sc.nextInt();
            String s = sc.next();

            if (n != 5) {
                System.out.println("NO");
                continue;
            }

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedInput = new String(arr);

            if (sortedInput.equals("Timru")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
