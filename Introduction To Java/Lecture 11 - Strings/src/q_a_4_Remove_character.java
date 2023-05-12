import java.util.Scanner;

public class q_a_4_Remove_character {

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.next();
        char ch = s.charAt(0);
        String ans = removeAllOccurrencesOfChar(str, ch);
        System.out.println(ans);
    }
}
