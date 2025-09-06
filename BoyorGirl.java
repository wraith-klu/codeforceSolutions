import java.util.HashSet;
import java.util.Scanner;


// https://codeforces.com/problemset/problem/236/A

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        
        HashSet<Character> distinctChars = new HashSet<>();
        for (char c : username.toCharArray()) {
            distinctChars.add(c);
        }
        
        System.out.println(distinctChars.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
        
        sc.close();
    }
}
