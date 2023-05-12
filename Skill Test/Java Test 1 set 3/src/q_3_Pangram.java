import java.util.Scanner;

public class q_3_Pangram {

    public static int size = 26;

    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    public static boolean allLetter(int n, String str) {
        str = str.toLowerCase();
        boolean[] present = new boolean[size];
        for (int i = 0; i < n; i++) {
            if (isLetter(str.charAt(i))) {
                int letter = str.charAt(i) - 'a';
                present[letter] = true;
            }
        }
        for (int i = 0; i < size; i++) {
            if (!present[i]) {
                return false;
            }
        }
        return true;
    }

    public static void ans(int n, String str) {
        if (allLetter(n, str)) {
            System.out.println("YES");
        } else if (!allLetter(n, str)) {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int n;
        n = sc.nextInt();
        sc.nextLine();
        str = sc.nextLine();
        ans(n, str);
    }
}
