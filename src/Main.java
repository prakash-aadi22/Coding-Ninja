public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int n = 55, d = 105, gcd = 1, x = Math.min(n, d);
        int n = 20514, d = 27225, gcd = 1, x = Math.min(n, d);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0 && d % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
        System.out.println("n = " + n + " and " + " d = " + d);
        System.out.println("n / d = " + n + " / " + d);
        System.out.println("n / d = " + n / gcd + " / " + d / gcd);
    }
}
