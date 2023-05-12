import java.util.Scanner;

public class q_4_Pair_Star {

    public static String addStars(String s) {
        if (s.length() == 1) {
            return s;
        }
        String str = addStars(s.substring(1));
        if (s.charAt(0) == str.charAt(0)) {
            return s.charAt(0) + "*" + str;
        } else {
            return s.charAt(0) + str;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(addStars(input));
    }
}
