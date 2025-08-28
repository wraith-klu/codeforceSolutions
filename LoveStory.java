import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int g=0; g<x; g++){
            String s = sc.next();
            int count = loveStory(s);
            System.out.println(count);
        }
        sc.close();
    }
    public static int loveStory(String s){
        String a = "codeforces";
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if(i < s.length() && s.charAt(i) != a.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
