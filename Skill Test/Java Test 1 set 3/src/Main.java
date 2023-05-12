import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);
        System.out.println(al);
        for (int i = 0; i < al.size();i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        for (Integer i : al) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        String[] s = new String[4];
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}