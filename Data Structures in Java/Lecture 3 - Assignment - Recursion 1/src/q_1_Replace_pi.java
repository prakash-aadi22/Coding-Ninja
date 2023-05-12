import java.util.Scanner;

public class q_1_Replace_pi {
    public static String replace(String input) {
        if (input.length() == 1) {
            return input;
        }
        String str = replace(input.substring(1));
        if (str.charAt(0) == 'i' && input.charAt(0) == 'p') {
            return "3.14" + str.substring(1);
        } else {
            return input.charAt(0) + str;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(replace(input));
    }
}
