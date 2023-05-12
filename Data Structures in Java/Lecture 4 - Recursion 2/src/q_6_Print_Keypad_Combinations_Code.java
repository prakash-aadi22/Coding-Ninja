import java.util.Scanner;

public class q_6_Print_Keypad_Combinations_Code {

    public static void printKeypad(int input) {
        printKeypad(input, "");
    }

    public static void printKeypad(int input, String output) {
        if (input == 0) {
            System.out.println(output);
            return;
        }
        int rem = input % 10;
        char[] helperArray = helper(rem);
        printKeypad(input / 10, helperArray[0] + output);
        printKeypad(input / 10, helperArray[1] + output);
        printKeypad(input / 10, helperArray[2] + output);
        if (helperArray.length == 4) {
            printKeypad(input / 10, helperArray[3] + output);
        }
    }

    public static char[] helper(int n) {
        if (n == 2) {
            return new char[]{'a', 'b', 'c'};
        } else if (n == 3) {
            return new char[]{'d', 'e', 'f'};
        } else if (n == 4) {
            return new char[]{'g', 'h', 'i'};
        } else if (n == 5) {
            return new char[]{'j', 'k', 'l'};
        } else if (n == 6) {
            return new char[]{'m', 'n', 'o'};
        } else if (n == 7) {
            return new char[]{'p', 'q', 'r', 's'};
        } else if (n == 8) {
            return new char[]{'t', 'u', 'v'};
        } else if (n == 9) {
            return new char[]{'w', 'x', 'y', 'z'};
        } else {
            return new char[]{' '};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printKeypad(input);
    }
}
