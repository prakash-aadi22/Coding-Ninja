import java.util.Arrays;
import java.util.Scanner;

public class q_4_Reverse_String_Wordwise {

    public static String reverseWordWise(String input) {
//        String[] words = input.split("\\s");input
//        String reversedString = "";
//        for (int i = 0; i < words.length; i++) {
//            if (i == words.length - 1) {
//                reversedString = words[i] + reversedString;
//            } else {
//                reversedString = " " + words[i] + reversedString;
//            }
//        }
//        return reversedString;

        // MINE CODE
        String ans = "";
        int i, start = input.length() - 1, end;
        for (i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ') {
                String reversedWord = "";
                end = i + 1;
                for (int j = end; j <= start; j++) {
                    reversedWord = reversedWord + input.charAt(j);
                }
                ans += reversedWord + " ";
                start = i - 1;
            }
        }
        String reversedWord = "";
        end = i + 1;
        for (int j = end; j <= start; j++) {
            reversedWord = reversedWord + input.charAt(j);
        }
        ans += reversedWord;
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(reverseWordWise(input));
    }
}
