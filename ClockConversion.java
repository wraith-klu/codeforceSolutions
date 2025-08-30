import java.util.Scanner;

public class ClockConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String time = sc.next();
            int hours = Integer.parseInt(time.substring(0, 2));
            String minutes = time.substring(3);
            
            String period = "AM";
            if (hours >= 12) {
                period = "PM";
                if (hours > 12) {
                    hours -= 12;
                }
            } else if (hours == 0) {
                hours = 12;
            }
            
            System.out.printf("%02d:%s %s%n", hours, minutes, period);
        }
        sc.close();
    }
}
