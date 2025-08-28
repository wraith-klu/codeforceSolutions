import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int aCount = 0;
        int dCount = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'A'){
                aCount++;
            }else{
                dCount++;
            }
        }

        if(aCount == dCount){
            System.out.println("Friendship");
        }else if(aCount>dCount){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
        sc.close();
    }
}
