import java.util.Scanner;

public class q_2_Remove_Duplicates_Recursively {

    static Scanner sc = new Scanner(System.in);

    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() == 1) {
            return s;
        }
        String ans = removeConsecutiveDuplicates(s.substring(1));
        if (s.charAt(0) == ans.charAt(0)) {
            return ans;
        } else {
            return s.charAt(0) + ans;
        }
    }

    public static void main(String[] args) {
        String input = sc.next();
        System.out.println(removeConsecutiveDuplicates(input));
    }
}
