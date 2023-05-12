import java.util.Scanner;

public class q_a_6_Return_all_codes_String {

    public static String[] getCode(String input) {
        if (input.length() == 0) {
            return new String[]{""};
        }
        String[] smallAns = getCode(input.substring(1));
        int an = input.charAt(0) - '0';
        char firstChar = (char) ('a' + an - 1);
        for (int i = 0; i < smallAns.length; i++) {
            smallAns[i] = firstChar + smallAns[i];
        }
        String[] smallAns1 = new String[0];
        if (input.length() >= 2) {
            int ch1 = input.charAt(0) - '0';
            int ch2 = input.charAt(1) - '0';
            int an3 = (ch1 * 10) + ch2;
            if (an3 >= 10 && an3 <= 26) {
                char firstTwoChar = (char) ('a' + an3 - 1);
                smallAns1 = getCode(input.substring(2));
                for (int i = 0; i < smallAns1.length; i++) {
                    smallAns1[i] = firstTwoChar + smallAns1[i];
                }
            }
        }
        String[] output = new String[smallAns.length + smallAns1.length];
        int k = 0;
//        for (int i = 0; i < smallAns.length; i++) {
//            output[k] = smallAns[i];
//            k++;
//        }
        for (String s : smallAns) {
            output[k] = s;
            k++;
        }
//        for (int i = 0; i < smallAns1.length; i++) {
//            output[k] = smallAns1[i];
//            k++;
//        }
        for (String s : smallAns1) {
            output[k] = s;
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] output = getCode(input);
//        for(int i = 0; i < output.length; i++) {
//            System.out.println(output[i]);
//        }
        for (String s : output) {
            System.out.println(s);
        }
    }
}
