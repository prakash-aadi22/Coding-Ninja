import java.util.Scanner;

public class q_a_6_Compress_the_String {
    public static String getCompressedString(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            ans += str.charAt(i);
            if (count > 1) {
                ans = ans + count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = getCompressedString(str);
        System.out.println(ans);
    }
}
