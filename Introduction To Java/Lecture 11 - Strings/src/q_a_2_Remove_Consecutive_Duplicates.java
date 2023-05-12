import java.util.Scanner;

public class q_a_2_Remove_Consecutive_Duplicates {
    public static String removeConsecutiveDuplicates(String str) {
        String ans = "";
        ans = ans + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != ans.charAt(ans.length() - 1)) {
//                if (str.charAt(i) != str.charAt(i - 1)) {
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = removeConsecutiveDuplicates(str);
        System.out.println(ans);
    }
}
