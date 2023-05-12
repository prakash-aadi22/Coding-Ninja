import java.util.Scanner;

public class q_1_Find_Character_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        if (c >= 65 && c <= 90) {
            System.out.println("1");
        } else if (c >= 97 && c <= 122) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}
