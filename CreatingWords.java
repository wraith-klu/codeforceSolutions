import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        
        for(int x = 0; x < n; x++){
            String a = sc.next();
            String b = sc.next();
            
            if(a.length() > 0 && b.length() > 0) {
                String p = b.charAt(0) + a.substring(1);
                String q = a.charAt(0) + b.substring(1);
                System.out.println(p + " " + q);
            } 
        }
        sc.close();
    }
}
