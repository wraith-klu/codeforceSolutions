import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String hex = decimalToHexadecimal(num);
        System.out.println(hex);
        sc.close();
    }

    public static String decimalToHexadecimal(int num) {
        if (num == 0)
            return "0";

        String hexadecimalDigits = "0123456789ABCDEF";
        String s = "";

        while (num > 0) {
            int rem = num % 16;
            s = hexadecimalDigits.charAt(rem) + s;
            num /= 16;
        }

        return s;
    }
}
































































































































































































// import java.util.Scanner;

// public class DecimalToHexadecimal {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         String s = decimalToHexadecimal(num);
//         System.out.println(s);
//         sc.close();

//     }

//     public static String decimalToHexadecimal(int num) {
//         if (num == 0) return "0";
//         StringBuilder sb = new StringBuilder();
//         while (num > 0) {
//             int rem = num % 16;
//             if (rem < 10) {
//                 sb.append((char) ('0' + rem));
//             } else {
//                 sb.append((char) ('A' + (rem - 10)));
//             }
//             num /= 16;
//         }
//         return sb.reverse().toString();
//     }
// }
