import java.util.Scanner;

public class q_2_String_Palindrome {

    public static boolean isPalindrome(String str) {
//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        return reversed.equals(str);

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString().equals(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
}
