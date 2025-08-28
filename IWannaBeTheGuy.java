// import java.util.Arrays;
// import java.util.Scanner;

// public class IWannaBeTheGuy {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int x = sc.nextInt();
//         int[] a = new int[x];
//         for(int i=0; i<x; i++){
//             a[i] = sc.nextInt();
//         }

//         int y = sc.nextInt();
//         int[] b = new int[y];
//         for(int i=0; i<y; i++){
//             b[i] = sc.nextInt();
//         }

//         Arrays.sort(a);
//         Arrays.sort(b);

//         if(n <= a[x-1] || n <= b[y-1]){
//             System.out.println("I become the guy.");
//         }else{
//             System.out.println("Oh, my keyboard!");
//         }
        
       
//         sc.close();
//     }
// }

import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = sc.nextInt();
        int[] a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }

        int y = sc.nextInt();
        int[] b = new int[y];
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
        }

        // Create boolean array with size n+1 (1-based)
        boolean[] levels = new boolean[n + 1];

        // Mark levels passed by X
        for (int i = 0; i < x; i++) {
            if (a[i] >= 1 && a[i] <= n) {
                levels[a[i]] = true;
            }
        }

        // Mark levels passed by Y
        for (int i = 0; i < y; i++) {
            if (b[i] >= 1 && b[i] <= n) {
                levels[b[i]] = true;
            }
        }

        boolean allPassed = true;
        for (int i = 1; i <= n; i++) {
            if (!levels[i]) {
                allPassed = false;
                break;
            }
        }

        if (allPassed) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

        sc.close();
    }
}
