import java.util.Scanner;

public class q_2_Minimum_Length_Word {
    public static String minLengthWord(String input) {
        int spaceIndex = 0;
        int startIndex = 0;
        int endIndex = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) == ' ') {
                int length = i - spaceIndex;
                if (minLength > length) {
                    minLength = length;
                    startIndex = spaceIndex;
                    endIndex = i;
                }
                spaceIndex = i + 1;
            }
        }
        return input.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(minLengthWord(str));
    }

}
