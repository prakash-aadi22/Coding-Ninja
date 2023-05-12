import java.util.Scanner;

public class q_a_4_Check_Palindrome_recursive {
    private static boolean isStringPalindrome(String input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return true;
        }
        boolean check = false;
        if (input.charAt(startIndex) == input.charAt(endIndex)) {
            check = isStringPalindrome(input, startIndex + 1, endIndex - 1);
        }
        return check;
    }

    public static boolean isStringPalindrome(String input) {
//        String reversed = "";
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversed += input.charAt(i);
//        }
//        return reversed.equals(input);

        return (isStringPalindrome(input, 0, input.length() - 1));

//        if (input.length() == 1) {
//            return true;
//        }
//        if (input.length() == 2) {
//            return input.charAt(0) == input.charAt(1);
//        }
//        if (input.charAt(0) == input.charAt(input.length() - 1)) {
//            return isStringPalindrome(input.substring(1, input.length() - 1));
//        } else {
//            return false;
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isStringPalindrome(input));
    }
}
