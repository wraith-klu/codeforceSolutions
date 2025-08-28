import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        String s = sc.nextLine();

        

        int count = checkUnique(n, s);
        System.out.println(count);

        sc.close();
    }

    public static int checkUnique(int n, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#' || ch == '*' || ch == '$') {
                count++;
            }
        }
        return count;
    }
}
