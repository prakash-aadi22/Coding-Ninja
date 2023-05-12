import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q_3_Binary_strings_with_no_consecutive_1_s {

    public static void generateStringHelper(int k, char[] str, int n, ArrayList<String> ans) {
        if (n == k) {
            ans.add(new String(str));
            return;
        }
        if (str[n - 1] == '1') {
            str[n] = '0';
            generateStringHelper(k, str, n + 1, ans);
        }
        if (str[n - 1] == '0') {
            str[n] = '0';
            generateStringHelper(k, str, n + 1, ans);
            str[n] = '1';
            generateStringHelper(k, str, n + 1, ans);
        }
    }

    public static ArrayList<String> generateString(int k) {
        ArrayList<String> ans = new ArrayList<>();
        if (k == 0) {
            return ans;
        }
        char[] str = new char[k];
        str[0] = '0';
        generateStringHelper(k, str, 1, ans);
        str[0] = '1';
        generateStringHelper(k, str, 1, ans);
        Arrays.sort(str);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<String> res = generateString(n);
            for (String i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
