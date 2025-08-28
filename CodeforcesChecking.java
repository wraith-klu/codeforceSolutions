import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n ; i++){
            String s = "codeforces";
            char ch = sc.next().charAt(0);

            boolean found = false;
            for(int j = 0; j < s.length(); j++){
                if(ch == s.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(found == true){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
