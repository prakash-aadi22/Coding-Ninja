import java.util.Arrays;
import java.util.Scanner;

public class q_a_1_Check_Permutation {

    public static boolean isPermutation(String str1, String str2) {
        boolean ans = false;
//        char[] arr1 = new char[str1.length()];
//        for (int i = 0; i < str1.length(); i++) {
//            arr1[i] = str1.charAt(i);
//        }
//        char[] arr2 = new char[str2.length()];
//        for (int i = 0; i < str2.length(); i++) {
//            arr2[i] = str2.charAt(i);
//        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String string1 = new String(arr1);
        String string2 = new String(arr2);
        if (string1.equals(string2)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean ans = isPermutation(str1, str2);
        System.out.println(ans);
    }
}
