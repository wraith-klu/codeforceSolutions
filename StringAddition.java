import java.util.Scanner;

public class StringAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "I have it, ";
        String b = "I love it, ";
        String c = "I hate it, ";

        String n = sc.nextLine();
        String result = "";
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)== 1){
                result = result + a;
            }else if(n.charAt(i) == 2){
                result += b;
            }else{
                result += c;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
