import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n = 00010204
        System.out.println(n); // n = 10204

        String text = "hiheyhello";
        int index = text.lastIndexOf("h", 4);
        System.out.println(index);
        System.out.println("-=========================================-");
        int i = 22;
        String s = String.valueOf(i);
        System.out.println(s);
        char c = 'a';
        int i1 = c;
        System.out.println(i1);
//        char c1 = 'a';
        int i3 = 'a';
        System.out.println(i3);
//        char c1 = 'a';
//        int i2 = Integer.parseInt(c1); // ERROR
//        System.out.println(i2);
//        String s1 = "a";
//        int i3 = Integer.parseInt(s1); //java.lang.NumberFormatException
//        System.out.println(i3);
    }
}
