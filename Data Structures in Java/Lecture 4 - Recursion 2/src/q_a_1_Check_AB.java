import java.util.Scanner;

public class q_a_1_Check_AB {
    public static boolean checkAB(String input) {
        if (input.length() == 0) {
            return true;
        }
        if (input.charAt(0) == 'a') {
//            if (input.substring(1).length() > 1 && input.substring(1, 3).equals("bb")) {
            if (input.substring(1).length() > 1 && input.startsWith("bb", 1)) {
                return checkAB(input.substring(3));
            } else {
                return checkAB(input.substring(1));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(checkAB(input));
    }
}
