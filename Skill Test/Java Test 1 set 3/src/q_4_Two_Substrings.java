import java.util.Scanner;

public class q_4_Two_Substrings {
    public static void twoSubstrings(String s) {
        StringBuilder str = new StringBuilder();
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' && i != s.length() - 1 && s.charAt(i + 1) == 'B' && flag != 1) {
                flag = 1;
                i++;
            } else {
                str.append(s.charAt(i));
            }
        }
        if (str.toString().contains("BA")) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        twoSubstrings(s);
    }
}
