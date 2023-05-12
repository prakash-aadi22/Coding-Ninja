import java.util.Scanner;

public class q_3_All_substrings {
    public static void printSubstrings(String str) {

        for (int start = 0; start < str.length(); start++) {
            for (int end = start + 1; end <= str.length(); end++) {
                System.out.println(str.substring(start, end));
            }
        }

//        for (int start = 0; start < str.length(); start++) {
//            for (int end = start; end < str.length(); end++) {
//                System.out.println(str.substring(start, end + 1));
//            }
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubstrings(str);
    }
}
