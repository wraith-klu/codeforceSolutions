import java.util.*;

public class LuckyDivision {
    static List<Integer> luckyNumbers = new ArrayList<>();

    // Recursively generate all lucky numbers up to 1000
    static void generateLuckyNumbers(int current) {
        if (current > 1000) return;
        if (current > 0) luckyNumbers.add(current);
        generateLuckyNumbers(current * 10 + 4);
        generateLuckyNumbers(current * 10 + 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateLuckyNumbers(0);
        boolean isAlmostLucky = false;
        for (int lucky : luckyNumbers) {
            if (n % lucky == 0) {
                isAlmostLucky = true;
                break;
            }
        }
        System.out.println(isAlmostLucky ? "YES" : "NO");
        sc.close();
    }
}
