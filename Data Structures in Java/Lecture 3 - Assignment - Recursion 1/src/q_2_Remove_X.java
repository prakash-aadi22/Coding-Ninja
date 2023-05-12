import java.util.Scanner;

public class q_2_Remove_X {
    public static String removeX(String input) {
        if (input.length() == 0) {
            return input;
        }
        String str = removeX(input.substring(1));
        if (input.charAt(0) == 'x') {
            return str;
        }
        return input.charAt(0) + str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeX(input));
    }
}
