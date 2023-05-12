import java.util.Scanner;

public class q_7_Interesting_Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        if (n == 2) {
            ch = 'B';
        } else if (n == 3) {
            ch = 'C';
        } else if (n == 4) {
            ch = 'D';
        } else if (n == 5) {
            ch = 'E';
        } else if (n == 6) {
            ch = 'F';
        } else if (n == 7) {
            ch = 'G';
        } else if (n == 8) {
            ch = 'H';
        } else if (n == 9) {
            ch = 'I';
        } else if (n == 10) {
            ch = 'J';
        } else if (n == 11) {
            ch = 'K';
        } else if (n == 12) {
            ch = 'L';
        } else if (n == 13) {
            ch = 'M';
        } else if (n == 14) {
            ch = 'N';
        } else if (n == 15) {
            ch = 'O';
        } else if (n == 16) {
            ch = 'P';
        } else if (n == 17) {
            ch = 'Q';
        } else if (n == 18) {
            ch = 'R';
        } else if (n == 19) {
            ch = 'S';
        } else if (n == 20) {
            ch = 'T';
        } else if (n == 21) {
            ch = 'U';
        } else if (n == 22) {
            ch = 'V';
        } else if (n == 23) {
            ch = 'W';
        } else if (n == 24) {
            ch = 'X';
        } else if (n == 25) {
            ch = 'Y';
        } else if (n == 26) {
            ch = 'Z';
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
//                System.out.print(n + j - i);
                System.out.print((char) (ch + j - i));
            }
            System.out.println();
        }
        System.out.println("====================================================================");
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }
}
