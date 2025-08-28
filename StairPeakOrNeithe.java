import java.util.Scanner;

//https://codeforces.com/problemset/problem/1950/A
public class StairPeakOrNeithe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            String s = "STAIR";
            String p = "PEAK";
            String na = "NONE";

            String result = checkCondition(a, b, c, s, p, na);
            System.out.println(result);
        }
        sc.close();
    }
    static String checkCondition(int a, int b, int c, String s, String p, String na){
        if(a < b && b < c){
            return s;  
        }else if(a < b && b > c){
            return p;  
        }else{
            return na; 
        }
    }
}
