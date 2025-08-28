import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cubes = 0;
        int loopCount = 1;
        while (n>=cubes+loopCount) {
            cubes += loopCount;
            loopCount++;
            n = n-cubes;
        }
        System.out.println(loopCount - 1);
        sc.close();
    }
}
