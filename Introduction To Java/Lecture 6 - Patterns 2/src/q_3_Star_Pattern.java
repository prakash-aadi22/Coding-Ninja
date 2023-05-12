import java.util.Scanner;

public class q_3_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        int n = x * 2;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            for (int j = n - i; j > 1; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        System.out.println("====================================================================================");
        int i = 0;
        int val = 1;
        while (i < x) {
            int space = 1;
            while (space < x - i) {
                System.out.print(" ");
                space++;
            }
            int j = 0;
            while (j < val) {
                System.out.print("*");
                j++;
            }
            val = val + 2;
            System.out.println();
            i++;
        }
    }
}
