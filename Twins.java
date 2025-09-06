import java.util.*;

// https://codeforces.com/problemset/problem/160/A

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] coins = new Integer[n];
        
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            totalSum += coins[i];
        }
        
        Arrays.sort(coins, Collections.reverseOrder());
        
        int mySum = 0;
        int coinsNeeded = 0;
        
        for (int coin : coins) {
            mySum += coin;
            coinsNeeded++;
            if (mySum > totalSum - mySum) {
                break;
            }
        }
        
        System.out.println(coinsNeeded);
        sc.close();
    }
}
