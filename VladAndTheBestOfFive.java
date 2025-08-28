import java.util.Scanner;

public class VladAndTheBestOfFive {

// https://codeforces.com/problemset/problem/1926/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            String A = "A";
            String B = "B";
            String result = letterCount(s, A , B);
            System.out.println(result);
        }
        sc.close();
    }
    static String letterCount(String s, String A, String B ){
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A'){
                aCount++;
            }else{
                bCount++;
            }
        }

        if(aCount>bCount){
            return A;
        }else{
            return B;
        }
    }
}
