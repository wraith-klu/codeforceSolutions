import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();

        }

        int sum = 0;
        for(int i =0; i<n; i++){
            if(a[i] == 1){
                sum++;
            }
        }
        if(sum >0){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
        sc.close();
    }
}
