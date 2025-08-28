import java.util.Scanner;

// https://codeforces.com/problemset/problem/1915/B

public class NotQuiteLatinSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            char[][] grid = new char[3][3];
            for (int i = 0; i < 3; i++) {
                String line = sc.nextLine();
                grid[i] = line.toCharArray();
            }
            
            // Find the missing letter in the row containing '?'
            for (int i = 0; i < 3; i++) {
                boolean foundQ = false;
                boolean hasA = false, hasB = false, hasC = false;
                for (int j = 0; j < 3; j++) {
                    if (grid[i][j] == '?') {
                        foundQ = true;
                    } else if (grid[i][j] == 'A') {
                        hasA = true;
                    } else if (grid[i][j] == 'B') {
                        hasB = true;
                    } else if (grid[i][j] == 'C') {
                        hasC = true;
                    }
                }
                if (foundQ) {
                    if (!hasA) System.out.println('A');
                    else if (!hasB) System.out.println('B');
                    else if (!hasC) System.out.println('C');
                    break;
                }
            }
        }
        sc.close();
    }
}
