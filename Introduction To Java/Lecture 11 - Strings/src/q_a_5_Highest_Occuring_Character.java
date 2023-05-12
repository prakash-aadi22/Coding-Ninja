import java.util.Scanner;

public class q_a_5_Highest_Occuring_Character {

    static final int ASCII_SIZE = 256;

    public static char highestOccuringChar(String str) {
        int[] count = new int[ASCII_SIZE];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ans = highestOccuringChar(str);
        System.out.println(ans);
    }
}
