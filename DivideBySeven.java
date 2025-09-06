import java.util.Scanner;

public class DivideBySeven {

    // https://codeforces.com/problemset/problem/1633/A

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int result = divideBySeven(n);
            System.out.println(result);
        }
        sc.close();
    }
    public static int divideBySeven(int n) {
        if (n % 7 == 0) {
            return n;
        }
        
        String num = String.valueOf(n);
        int minChanges = Integer.MAX_VALUE;
        int result = n;
        
        // Try changing each digit
        for (int i = 0; i < num.length(); i++) {
            int original = num.charAt(i) - '0';
            for (int d = 0; d <= 9; d++) {
                // Skip leading zero
                if (i == 0 && d == 0) continue;
                
                // Create new number with digit d at position i
                char[] newNum = num.toCharArray();
                newNum[i] = (char)(d + '0');
                int newVal = Integer.parseInt(new String(newNum));
                
                if (newVal % 7 == 0) {
                    int changes = (d != original) ? 1 : 0;
                    if (changes < minChanges) {
                        minChanges = changes;
                        result = newVal;
                    }
                }
            }
        }
        
        return result;
    }
}
