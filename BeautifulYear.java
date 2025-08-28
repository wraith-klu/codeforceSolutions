import java.util.Scanner;

public class BeautifulYear {
    public static boolean isBeautiful(int year) {
        String yearStr = String.valueOf(year);
        for (int i = 0; i < yearStr.length(); i++) {
            for (int j = i + 1; j < yearStr.length(); j++) {
                if (yearStr.charAt(i) == yearStr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        while (true) {
            year++;
            if (isBeautiful(year)) {
                System.out.println(year);
                break;
            }
        }

        sc.close();
    }
}
