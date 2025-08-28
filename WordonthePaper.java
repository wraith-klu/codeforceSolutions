import java.util.Scanner;

public class WordonthePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        
        while (t-- > 0) {
            char[][] grid = new char[8][8];
            for (int i = 0; i < 8; i++) {
                grid[i] = sc.nextLine().toCharArray();
            }
            
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (Character.isLetter(grid[i][j])) {
                        word.append(grid[i][j]);
                    }
                }
            }
            System.out.println(word.toString());
        }
        sc.close();
    }
}
