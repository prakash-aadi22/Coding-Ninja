import java.util.Scanner;

public class q_a_3_Reverse_Each_Word {

    public static String reverseEachWord(String str) {
        String ans = "";
        int i, start = 0, end;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                String reversedWord = "";
                end = i - 1;
                for (int j = start; j <= end; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                ans += reversedWord + " ";
                start = i + 1;
            }
        }
        String reversedWord = "";
        end = i - 1;
        for (int j = start; j <= end; j++) {
            reversedWord = str.charAt(j) + reversedWord;
        }
        ans += reversedWord;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverseEachWord(str);
        System.out.println(ans);
    }
}
