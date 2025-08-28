import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int count = 0;
            for (int j = 0; j < s.charAt(3); j++) {
                count = count + s.charAt(j);
            }
            int count2 = 0;
            for (int j = s.charAt(3); j < s.length(); j++) {
                count2 = count2 + s.charAt(j);
            }
            if (count == count2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
