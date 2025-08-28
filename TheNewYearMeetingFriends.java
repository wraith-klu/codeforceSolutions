import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int z = a[2] - a[0];

        System.out.println(z);
        sc.close();
    }
}
