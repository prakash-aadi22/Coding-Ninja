import java.util.Scanner;

public class q_1_Count_Words {
    public static int countWords(String str) {
//        if (str.isEmpty()) {
//            return 0;
//        } else {
//            int count = 1;
//            char[] ch = str.toCharArray();
//            for (char c : ch) {
//                if (c == ' ') {
//                    count++;
//                }
//            }
//            return count;
//        }

        int count = 1;
        if (str.length() == 0) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = countWords(str);
        System.out.println(count);
    }
}
