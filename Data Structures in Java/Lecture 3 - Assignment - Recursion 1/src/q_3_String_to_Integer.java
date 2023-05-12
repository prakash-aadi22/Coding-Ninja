import java.util.Scanner;

public class q_3_String_to_Integer {

    public static int convertStringToInt(String input) {
//        return Integer.parseInt(input);

        if (input.length() == 0) {
            return 0;
        }
        int SmallAns = convertStringToInt(input.substring(1));
        int b = input.charAt(0);
        b -= 48;
        return b * (int) Math.pow(10, input.length() - 1) + SmallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(convertStringToInt(input));
    }
}
