import java.util.HashMap;
import java.util.Scanner;

public class q_a_1_Extract_Unique_characters {
    static Scanner sc = new Scanner(System.in);

    public static String takeInput() {
        return sc.next();
    }

    public static String uniqueChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                s.append(ch);
                map.put(ch, 1);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String str = takeInput();
        System.out.print(uniqueChar(str));
    }
}
