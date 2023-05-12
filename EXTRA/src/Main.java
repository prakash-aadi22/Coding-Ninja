import java.util.ArrayList;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }

//    public static void main(String[] arr) {
//        System.out.println("first main");
//    }
//    public static void main(String arr) {
//        System.out.println("second main");
//    }

//    public static void main(String[] args) {
//        short x = 32767;
//        x++;
//        x++;
//        System.out.print(x);

//        int[] a = {011, 120, 002, 016, 010};
//        for (int j = 0; j < a.length; j++) {
//            System.out.print(a[j] + " ");
//        }

//        String a = new String("BYJUSEXAMPREP");
//        String b = new String("BYJUSEXAMPREP");
//        String c = "BYJUSEXAMPREP";
//        String d = "BYJUSEXAMPREP";

//        ArrayList arrList = new ArrayList();
//        arrList.add("B");
//        arrList.add("J");
//        arrList.add("U");
//        arrList.add("S");
//        arrList.add(1, "Y");
//        System.out.println(arrList);

//        System.out.println(32 / 4);
//        System.out.println((8 >> 2) << 4);
//        System.out.println(2 ^ 5);
//        System.out.println(128 >>> 2);
//        System.out.println(2 >> 5);

//        int I = 1;
//        do while (I < 1)
//            System.out.print("I is " + I);
//        while (I > 1);
//    }

//    public static void throwit() {
//        System.out.print("throwit ");
//        throw new RuntimeException();
//    }
//
//    public static void main(String[] args) {
//        try {
//            System.out.print("hello ");
//            throwit();
//        } catch (Exception re) {
//            System.out.print("caught ");
//        } finally {
//            System.out.print("finally ");
//        }
//        System.out.println("after ");
//    }


    //    public static void main(String[] args) {
//        try {
//            badMethod();
//            System.out.print("A");
//        } catch (Exception ex) {
//            System.out.print("B");
//        } finally {
//            System.out.print("C");
//        }
//        System.out.print("D");
//    }
//
//    public static void badMethod() {
//    }
    public static void main(String[] args) {
        int i = 1, j = 10;
        do {
            if (i++ > --j) {
                continue;
            }
        } while (i < 5);
        System.out.println("i = " + i + " and j = " + j);
    }
}