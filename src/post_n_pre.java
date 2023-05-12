public class post_n_pre {
    public static void print(int n) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(n);
            return;
        }
//        print(n--); // Infinite
        print(--n); // prints 0 1 2 3 4
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int a = 2, b = 2, c = 2, d = 2;
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(c--);
        System.out.println(--d);
        print(5);
    }
}
