public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        System.out.println(func(10));
    }

    public static int func(int n) {
        int count = 0;
        int lv = n;
        while (lv > 0) {
            int inner_lv = 0;
            System.out.println("out");
            while (inner_lv < lv) {
                inner_lv++;
                count += 1;
                System.out.println("in");
            }
            lv /= 2;
        }
        return count;
    }
//    static int fun(int n) throws Exception {
//        if (n == 2)
//            throw new Exception();
//        else
//            return 5;
//    }
//
//    public static void main(String[] args) {
//        try {
//            System.out.print(fun(10));
//        } catch (Exception e) {
//            System.out.print("hello");
//        }
//        System.out.print("world");
//    }
}