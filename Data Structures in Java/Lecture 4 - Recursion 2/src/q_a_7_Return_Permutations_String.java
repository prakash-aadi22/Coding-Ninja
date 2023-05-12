import java.util.Scanner;

public class q_a_7_Return_Permutations_String {

    public static String[] permutationOfString(String input) {
        if (input.length() == 0) {
            return new String[]{""};
        }
        String[] ans = permutationOfString(input.substring(1));
        String[] output = new String[ans.length * input.length()];
        int k = 0;
//        for (int i = 0; i < ans.length; i++) {
        for (String an : ans) {
            for (int j = 0; j <= an.length(); j++) {
                output[k++] = an.substring(0, j) + input.charAt(0) + an.substring(j);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] output = permutationOfString(input);
//        for (int i = 0; i < output.length; i++) {
//            System.out.println(output[i]);
//        }
        for (String s : output) {
            System.out.println(s);
        }
    }
}
